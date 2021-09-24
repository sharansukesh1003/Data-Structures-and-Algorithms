// https://leetcode.com/problems/defanging-an-ip-address/
package com.sharan;

public class StringDefangingIPAddress {
    public static void main(String[] args) {
        String str = "1.1.1.1";
        System.out.println(defangIPaddr(str));
    }
    static String defangIPaddr(String address) {
        StringBuilder outputString = new StringBuilder();
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                outputString.append("[.]");
            }
            else {
                outputString.append(address.charAt(i));
            }
        }
        return outputString.toString();
    }
}
