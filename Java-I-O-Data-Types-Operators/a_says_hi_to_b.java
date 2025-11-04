/*
Problem Description
Take two names A and B as input from the user, print "A says Hi to B" (Without quotations), where A and B are the names in input.

Problem Constraints
1 <= len(A), len(B) <= 15
Characters in A and B are in lowercase English Alphabets.


Input Format
There are two input lines
The first line has a string A.
The second line has a string B.

Output Format
Print in a single line A says Hi to B.

Example Input
Input:-
Ram
Shyam

Example Output
Output:-
Ram says Hi to Shyam
 */

import java.util.Scanner;

class PrintString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.length() > 1 && a.length() <= 15 && b.length() > 1 && b.length() <= 15) {
            System.out.println(a.toLowerCase() + " says Hi to " + b.toLowerCase());
        }
    }
}
