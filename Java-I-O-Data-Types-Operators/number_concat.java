/*
Problem Description
Given two numbers A and B. Concatenate the two numbers and print it.

Problem Constraints
1 <= A, B <= 104

Input Format
There are two input lines
The first line has a single integer A.
The second line has a single integer B.

Output Format
Print in a single line the concatenated number.

Example Input
Input 1:-
4
5
Input 2:-
16
2

Example Output
Output 1:-
45

Example Explanation
Explanation 1:-
Concatenation of 4 and 5 is 45.
 */

import java.util.Scanner;

class ConcatenationInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a +""+ b);
    }
}
