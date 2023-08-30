package search;

public class evendigits {
    public static void main(String[] args) {
        int[] num = {1,34,678,454,45};
        System.out.println((findnumbers(num)));

    }
    static int findnumbers(int[] nums)
    {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num)
    {
        int numofdigits=digits(num);

        return  numofdigits % 2 ==0;
    }
    static int digits2(int num){
        return (int)(Math.log10(num))+1;
    }
    static int digits(int nums){
        if(nums<0){
            nums= nums * 1;
        }
        if(nums==0){
          return 1;
        }
        int count=0;
        while(nums>0){
            count++;
            nums=nums/10;

        }
        return count;
    }
}
