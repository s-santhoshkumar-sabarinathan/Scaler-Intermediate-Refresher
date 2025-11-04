/*
Problem Description
Take a name A as input from the user and print "Hello A", where A is the name in input.

Problem Constraints
1 <= len(A) <= 15 Characters in A are in lowercase English Alphabets.

Input Format
There is a single input line, which is the string **A**.

Output Format
Print in a single line "Hello A" without quotes.
Example Input
Input 1:-
Ram

Output 1:-
Hello Ram

 */

import java.util.Scanner;

class HelloName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name.length() > 1 && name.length() <= 15 && name.matches("[a-z]+")) {
            System.out.println("Hello " + name);
        }
    }
}
