// https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
// linkf for the challenge above
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String string1=sc.next();
                int integer1=sc.nextInt();
                System.out.printf("%-15s",string1);
                System.out.printf("%03d%n",integer1)
                //Complete this line
            }
            System.out.println("================================");

    }
}
