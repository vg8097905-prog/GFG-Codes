class Solution {
    int majorityElement(int arr[]) {
        // code here
         int candidate =0;
             int count=0;
        for(int i=0;i<arr.length;i++){
           if(count==0){
               candidate=arr[i];
           }
           
           if(arr[i]==candidate){
                count++;
            } 
                if(arr[i]!=candidate){
                    count--;
                }
      
               
        }
        count = 0;
        for(int j =0;j<arr.length;j++){
              if(arr[j]==candidate){
                  count++;
              }
              if(count>arr.length/2){
            return candidate;
        }
      
        }
        
        return -1;
    }
}