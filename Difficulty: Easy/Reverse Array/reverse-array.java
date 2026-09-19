class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int Right = arr.length-1;
        for(int Left=0;Left<arr.length;Left++){

            if(Left<=Right){
            int temp =arr[Left];
            arr[Left]=arr[Right];
             arr[Right]=temp;
            Right--;
        }
        }
     
    }
}