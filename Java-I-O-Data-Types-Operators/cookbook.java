/*
Problem Description
You're going to write some code to help you cook a gorgeous lasagna from your
favorite cookbook. According to your cookbook, the Lasagna should be in the oven for
40 minutes. Given the time (in minutes), the lasagna has been in the oven, find how
many more minutes the lasagna still needs to bake for.

Problem Constraints
0 <= N <= 40
 */

import java.util.Scanner;

class Cookbook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 40;
        if (k > 0 && k <= 40) {
            System.out.println(sum - k);
        }
    }
}


/*
Problem Description
You wrote some code to help you cook a gorgeous lasagna from your favorite cookbook.
Now, you want to find the total number of minutes you've been cooking for the sum of
your preparation time and the time the lasagna has already spent baking in the oven.
The preparation time of one layer is 2 minutes. Given the number of layers added to
the lasagna and the number of minutes the lasagna has been baking in the oven, find
the total elapsed cooking time (prep + bake) in minutes
 */

class Cookbook2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int layer = 2;
        System.out.println(layer * k);
    }
}


/*
Problem Description
You wrote some code to help you cook a gorgeous lasagna from your favorite
cookbook. Now, you want to find the total number of minutes you've been cooking
for the sum of your preparation time and the time the lasagna has already spent baking
in the oven. The preparation time of one layer is 2 minutes. Given the number of layers
added to the lasagna and the number of minutes the lasagna has been baking in the oven,
find the total elapsed cooking time (prep + bake) in minutes.
 */

class Cookbook3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int layer = 2;

        if (k > 0 && k <= 20 && n > 0 && n <= 40) {
            System.out.println((k*layer) + n);
        }
    }
}
