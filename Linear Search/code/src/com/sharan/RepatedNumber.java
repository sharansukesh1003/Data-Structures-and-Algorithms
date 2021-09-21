package com.sharan;

class RepeatedNumber {
    public static void main(String args[] ) throws Exception {
        int[] arr = {7,10,2,3,4,3,5,6};
        int ans =findDuplicate(arr);
        System.out.print(ans);
    }
    static int findDuplicate(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            for(int j = i+1; j < arr.length; j++){
                if(temp == arr[j]){
                    int duplicate = arr[j];
                    return duplicate;
                }
            }
        }
        return -1;
    }
}
