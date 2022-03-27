// https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
// link ofr above challenge
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int B, H;
B = sc.nextInt();
sc.nextLine();
H = sc.nextInt();
sc.close();
if (B > 0 && H > 0) {
int area = B * H;
System.out.print(area);
} else if (B <= 0 || H <= 0) {

System.out.println("java.lang.Exception: Breadth and height must be positive");
}
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
