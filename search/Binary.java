package search;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,4,15,18,22,45};
        int target=22;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
        System.out.println("testing");
    }
    static int binarysearch(int[] num,int targ){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(targ<num[mid]){
                end=mid-1;
            }
            else if (targ>num[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }
}
