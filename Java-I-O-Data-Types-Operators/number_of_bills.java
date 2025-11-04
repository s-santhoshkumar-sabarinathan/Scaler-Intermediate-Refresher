/*
Problem Description
Given total bills amount and amount of a single bill. Print number of bills.
Note : The total amount is equally splitted in all bills. The number of bills should be an integer value.

Input Format
The first line contains a real number N denoting the total budget.
The second line contains an integer M denoting the value of a single bill.

Output Format
Print in a single line denoting the total number of bills that can fit in the total budget.

Problem Constraints
1 <= N <= 10000
1 <= M <= 100

Example Input
Input:-
126.3
5

Example Output
Output:-
25
 */

import java.util.Scanner;

class NumberOfBills{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float total = sc.nextFloat();
        int count = sc.nextInt();

        if (total > 0 && total <= 10000 && count > 0 && count <= 100) {
            System.out.println((int)total/count);
        }
    }
}


/*
Problem Description
Given the value of a single bill and the number of bills you received, print the total value of the bills.
Note: The value of all the bills are same

Problem Constraints
1 <= N <= 100
1 <= M <= 100

Input Format
The first line of the input is an integer N denoting the value of a single bill.
The second line of the input is an integer M denoting the number of bills.

Output Format
Print in a single line denoting the total value of bills.

Example Input
Input:-
12
10

Example Output
Output:-
120
 */

class TotalValueOfBills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int singleBill = sc.nextInt();
        int billCount = sc.nextInt();

        if (singleBill > 0 && singleBill <= 100 && billCount > 0 && billCount <= 100) {
            System.out.println(singleBill * billCount);
        }
    }
}
