public class Linear_Search {
    public static void main(String args[]){
              int nums[] = {
                    1,34,243,21,41,523,22,3212
              };
              int find = 21;
              System.out.println(linear_search(nums,find));



              int num[][] = {
                {5,85,6},
                {17,2,6},
                {45,85,65}
              };
              int target = 2;

              


    }

    // Search in array 
    static int linear_search(int[] arr , int target){
                 if(arr.length == 0){
                    return -1 ;
                 }
                 else{
                    for(int i = 0 ; i < arr.length ; i++){
                        if(arr[i] == target){
                            return i ;
                        }
                    }
                    return -1;
                 }

        // // Search in 2d Array
        // static int searchin2d(int[][] num, int target){

        // }
    }
}
