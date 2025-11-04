/*
Problem Description
Given two numbers A and B. Print A+B, A*B, A-B, A/B in the same order.

Problem Constraints
1 <= A, B <= 104

Input Format
There are two input lines
The first line has a single integer A.
The second line has a single integer B.

Output Format
Print in a single line separated by space A+B, A*B, A-B, A/B in the same order.

Example Input
Input 1:-
4
5


Example Output
Output 1:-
9 20 -1 0
*/

import java.util.Scanner;

class SimpleCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a+b + " ");
        System.out.print(a*b + " ");
        System.out.print(a-b + " ");
        System.out.print(a/b + " ");
    }
}
