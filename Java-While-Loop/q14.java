/*
Problem Description
Take a number A as input, print its multiplication table having the first 10 multiples.

Problem Constraints
1 <= A <= 1000

Input Format
First line contains a single integer A.

Output Format
Print 10 lines, ith line containing ith multiple.

Example Input
Input 1:
 2
Input 2:
 3

Exmple Output
Output 1:
 2 * 1 = 2
 2 * 2 = 4
 2 * 3 = 6
 2 * 4 = 8
 2 * 5 = 10
 2 * 6 = 12
 2 * 7 = 14
 2 * 8 = 16
 2 * 9 = 18
 2 * 10 = 20
 */

import java.util.Scanner;

class MultiTables{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(mul*i);
            i++;
        }
    }
}
