class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int n =arr.length;
        ArrayList <Integer> res = new ArrayList <>();
     
        int min = Integer.MAX_VALUE;
        int secMin  = Integer.MAX_VALUE ;
        
        for (int i =0 ; i < n ; i++){
            if (arr[i]< min){
                secMin = min ;
                min = arr[i];
            }
            if (arr[i] < secMin && arr[i] != min){
                secMin = arr[i];
            }
        }
        
       if (secMin == Integer.MAX_VALUE) {
           res.add(-1);
       } else {
           res.add(min);
           res.add(secMin);
       }
       
        
        return res;
    }
}
