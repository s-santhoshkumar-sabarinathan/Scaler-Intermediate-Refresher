/*
Problem Description:
Write a program to input two numbers(A & B) from user and print the minimum element among A & B in each line.

Problem Constraints:
1 <= A <= 1000000
1 <= B <= 1000000

Input Format:
First line is a single integer A.
Second line is a single integer B.

Output Format:
One line containing an integer as per the question.

Example Input:
Input 1:
5
6
Input 2:
1000
10000

Example Output:
Output 1:
5
Output 2:
1000
 */

import java.util.Scanner;

class Min{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        if (num_1 > 0 && num_2 > 0 && num_1 <= 1000000 && num_2 <= 1000000) {
            if(num_1 < num_2){
                System.out.println(num_1);
            }
            else {
                if(num_1 == num_2){
                    System.out.println("both are equal");
                }
                else
                    System.out.println(num_2);
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
