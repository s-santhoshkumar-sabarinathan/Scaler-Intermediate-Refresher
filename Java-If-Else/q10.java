/*
Problem Description
Write a program that takes in a number N as input and does the following:
if N is a multiple of 3, print Fizz
if N is a multiple of 5, print Buzz
if N is a multiple of both 3 and 5, print FizzBuzz

Problem Constraints:
1 <= N <= 1000

Input Format
There is only 1 single line in the input, which is the integer N.

Output Format
Print Fizz / Buzz / FizzBuzz depending on the value N.

Example Input
Input 1:
9
Input 2:-
15

Example Output
Output 1:-
Fizz
Output 2:-
FizzBuzz
 */

import java.util.Scanner;

class FizBuz{
    public static void main(String[] args) {
        Scanner scannerr = new Scanner(System.in);
        int n = scannerr.nextInt();
        if(n%3 == 0 && n%5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(n%3 == 0){
            System.out.println("Fizz");
        }
        else{
            if(n%5 == 0){
                System.out.println("Buzz");
            }
        }
    }
}
