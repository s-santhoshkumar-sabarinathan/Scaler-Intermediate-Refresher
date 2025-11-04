/*
Problem Description
Given an english sentence, take it in the input and print it in the output.

Input Format
Single line containing an english sentence.

Output Format
Print in a single line the sentence in the input.

Example Input
Input 1:
Harry loves Hagrid !

Example Output
Output 1:
Harry loves Hagrid !
 */
import java.util.Scanner;

class PrintStr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
    }
}
