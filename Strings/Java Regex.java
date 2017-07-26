/*
In this problem you will be provided strings containing any combination of ASCII characters.
You have to write a regular expression to find the valid IPs.
*/
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String pattern = "((?:(?:25[0-5]|2[0-4]\\d|(?:1\\d{2}|[1-9]?\\d))\\.){3}(?:25[0-5]|2[0-4]\\d|(?:1\\d{2}|[1-9]?\\d)))";
}

/*
We first need to get values from 250 to 255 by matching against 25[0-5],
then values from 200 to 249 can be found by matching against 2[0-4][0-9] finally the remaining values will range from 0 to 199 which can be found by [01]?[0-9][0-9]?
Combining all these together gives us any digit(A, B, C or D) < 255 which again can be added together to form the final IP address. Below is the code which passes all the test cases:
*/

/*
public String pattern = "\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
*/