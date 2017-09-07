/*
Given a string A, print Yes if it is a palindrome, print No otherwise.
*/
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        StringBuffer temp = new StringBuffer(A);
        if(A.compareTo(temp.reverse().toString()) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}