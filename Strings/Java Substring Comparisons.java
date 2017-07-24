/*
@Output Format
Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

@Sample Input 0
welcometojava
3

@Sample Output 0
ava
wel
*/

public class Solution{

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        /*
        char[] str = new char[s.length()];
        str = s.toCharArray();
        */
        int len = s.length();
        for(int i = 0; i <= len - k; i++) {
            String temp = s.substring(i, i + k);
            //System.out.println(temp);
            if(0 == i) {
                smallest = largest = temp;
            } else {
                smallest = temp.compareTo(smallest) <= 0 ? temp : smallest;
                largest = temp.compareTo(largest) >= 0 ? temp : largest;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}