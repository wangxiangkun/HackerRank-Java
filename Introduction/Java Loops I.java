/*
@Objective 
In this challenge, we're going to use loops to help us do some simple math.

@Task 
Given an integer, n, print its first 10 multiples. Each multiple n x i(where 1 <= i <= 10)should be printed on a new line in the form: N x i = result.

@Input Format
A single integer, n.

@Constraints
2 <= n <= 20

@Output Format
Print 10 lines of output; each line i(where 1 <= i <= 10) contains the result of n x i in the form: n x i = result

@Sample Input
2

@Sample Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int baseNum = scan.nextInt();
        scan.close();
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(baseNum + " x " + i + " = " + baseNum * i);
        }
    }
}