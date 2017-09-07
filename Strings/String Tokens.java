/*
@Sample Input
He is a very very good boy, isn't he?

@Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();//remove spaces
        if(null == s || s.equals("")) {
            System.out.println(0);
            return;
        }
        String delims = "[ .,?!'@#_\"()]+";
        String[] arr = s.split(delims);
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        scan.close();
    }
}