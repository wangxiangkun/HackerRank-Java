/*
@Sample Input
1234
20

Sample Output

1254
24680
*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String strA = input.next();
        String strB = input.next();
        BigInteger numA = new BigInteger(strA);
        BigInteger numB = new BigInteger(strB);
        System.out.println(numA.add(numB));
        System.out.println(numA.multiply(numB));
    }
}