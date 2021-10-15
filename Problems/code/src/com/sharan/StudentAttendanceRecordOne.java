// https://leetcode.com/problems/student-attendance-record-i/
package com.sharan;
// 100% Faster O(n) Solution.
public class StudentAttendanceRecordOne {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                absent++;
                late = 0;
            }
            if(s.charAt(i) == 'L'){
                late++;
                if(late == 3) return false;
            }
            if(s.charAt(i) == 'P'){
                late = 0;
            }
            if (absent >= 2){
                return false;
            }
        }
        return true;
    }
}
