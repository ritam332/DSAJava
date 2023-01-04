import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchMore {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
//        int[] arr={1,3,6,88,78,45,7};
//        int target=in.nextInt();
//        int ans=linearSearch(arr,target);
//        System.out.println(ans);
//
//        String name=in.nextLine();
//        char t=in.next().charAt(0);
//        System.out.println(t);
//        System.out.println(search(name,t)); //t= target char

        //2d array....
        int[][] arr2={{1,2,5},{5,6},{3,9948 ,69}};
       // System.out.println(arr2);
        int t2= in.nextInt(); //t2= target int for arr2
        int[] ans=search2d(arr2,t2);
        System.out.println(Arrays.toString(ans));
        System.out.println("Max Value = "+max2(arr2));
    }

    private static int max2(int[][] arr2) {
        int max=Integer.MIN_VALUE;
        for (int[] ints : arr2) {
            for (int anInt : ints) {
                if (max < anInt) max = anInt;
            }
        }
        return max;
    }

    static int[] search2d(int[][] arr2, int t2) {
        for (int row=0;row<arr2.length;row++){
            for (int col=0;col<arr2[row].length;col++){
                if (arr2[row][col]==t2) return new int[] {row,col};
            }
        } return new int[]{-1, -1};
    }

    private static boolean search(String name, char t) {
        if (name.length()==0) return false;
        for (int i=0;i<name.length();i++){
           if (t==name.charAt(i)) return true;
        }
        return false;
    }

    private static int linearSearch(int[] arr, int target) {
            if (arr.length==0) return -1;
            for (int i=0;i<arr.length;i++){
                if (arr[i]==target)
                    return i;
            } return -1;
    }
}
