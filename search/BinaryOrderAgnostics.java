package search;

public class BinaryOrderAgnostics {
    public static void main(String[] args) {
        int[] arr = {100,87,56,43,22,10,2,1};
        int target=22;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] num,int targ){
        int start=0;
        int end=num.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(targ==num[mid]) {
                return mid;
            }
            boolean asc=num[start]<num[end];
            if(asc){

                if (targ < num[mid]) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if (targ > num[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

        }
        return -1;

    }
}


