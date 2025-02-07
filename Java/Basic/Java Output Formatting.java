import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //%-15 used to determite the blank spaces
                //the 03 determine 3 digits space for the number
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }
}


