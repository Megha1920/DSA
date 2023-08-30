package search;

import java.util.Arrays;
import java.util.Scanner;
public class Linear {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] ar = {{1,2,56},
                {45,67,90},
                {4,7,10},
                {3,7},
        };

        int[] arr = new int[4];

//        System.out.println("Enter the array elements" );
//        for (int i =0;i<arr.length;i++) {
//            arr[i]=in.nextInt();
//        }
        System.out.println("enter the no. to be found out:");
        int  target = in.nextInt();
        int[] anss =twodsearch(ar,target);
        System.out.println(Arrays.toString(anss));
        //  int ans = linearsearch(arr,target);
        System.out.println(anss);
    }
    static  int  linearsearch(int[] num,int targ)
    {
        if(num.length==0)
            return -1;

        for (int index=0;index<num.length;index++)
        {
            if(num[index]==targ)
            {
                return index;
            }
        }
        return -1 ;
    }
    //searching target with true or false
    static  boolean  linearsearch3(int[] num,int targ)
    {
        if(num.length==0)
            return false;

        for (int element:num) {
            if (element == targ){
                return true;
            };

        }
        return false;
    }
    //returning element using enhanced for loop
    static  int  linearsearch2(int[] num,int targ)
    {
        if(num.length==0)
            return -1;

        for (int element:num) {
            if (element == targ){
                return element;
            };

        }
        return -1 ;
    }
    static int[] twodsearch(int[][] array,int target){
        //expecting array is not empty

        for(int row=0;row< array.length;row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}