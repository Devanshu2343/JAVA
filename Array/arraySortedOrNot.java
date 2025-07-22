class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        int l = arr.length ;
        for (int  i=1 ; i < l ; i++){
            if (arr[i]<arr[i-1]){
                return false ;
            }
        }
        return true ;
    }
}
