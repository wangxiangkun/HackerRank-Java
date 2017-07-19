/*
@Sample Input
Helloworld
3 7

@Sample Output
lowo
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        
        String str = S.substring(start, end);
        System.out.print(str);
    }
}