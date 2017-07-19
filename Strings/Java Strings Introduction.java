/*
@Input Format
The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

@Output Format
There are three lines of output: 
For the first line, sum the lengths of A and B. 
For the second line, write Yes if A is lexicographically larger than B or No if it is not. 
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

@Sample Input
hello
java

@Sample Output
9
No
Hello Java
*/

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String flag = null;

        int len = A.length() + B.length();

        if(A.compareTo(B) > 0) {
            flag = "Yes";
        } else {
            flag = "No";
        }

        String subStr = A.substring(1);
        A = A.toUpperCase();
        String head = A.substring(0, 1);

        String str1 = head + subStr;

        subStr = B.substring(1);
        B = B.toUpperCase();
        head = B.substring(0, 1);
        String str2 = head + subStr;

        System.out.println(len);
        System.out.println(flag);
        System.out.println(str1 + " " + str2);
    }
}
