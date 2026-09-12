class Solution {
    public int mean(int[] arr) {
        // code here
        int sum=0;
        int mean;
        for(int i =0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        mean=sum/arr.length;
        return mean;
    }

    public int median(int[] arr) {
        // code here
        int Left;
        int Right;
        int Median;
        Arrays.sort(arr);
        if(arr.length%2==0){
          Left = arr[(arr.length/2)-1];
          Right = arr[(arr.length)/2];
          Median = (Left + Right)/2;
        }  
          else
           Median=arr[arr.length/2];
          return Median;
    }
}