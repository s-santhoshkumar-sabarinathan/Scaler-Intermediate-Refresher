/*
Problem Description
Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user

Problem Constraints
1 <= N <= 1000

Input Format
A single line representing N

Output Format
A single integer showing sum of all Natural numbers from 1 to N

Example Input
Input 1:
5
Input 2:
10

Example Output
Output 1:
15
Output 2:
55
 */

import java.util.Scanner;

class GameSummation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
