/*
@Sample Input
13

@Sample Output
prime
*/

public class Solution {
    
       public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          BigInteger n = in.nextBigInteger();
          in.close();
          // Write your code here.
          if (n.isProbablePrime(100)) {
              System.out.println("yes");
          } else {
              System.out.println("no");
          }
       }
    }