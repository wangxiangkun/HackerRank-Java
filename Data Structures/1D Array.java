/*
@Sample Input
5
10
20
30
40
50

@Sample Output
10
20
30
40
50
*/
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int val = scan.nextInt()
            array[i] = val;
        }
        scan.close();

        for (int element : array) {
            System.out.println(element);
        }
    }
}