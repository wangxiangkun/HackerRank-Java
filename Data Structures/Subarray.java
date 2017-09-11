/*
Given an array of  integers, find and print its number of negative subarrays on a new line.
*/
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            array[i] = val;
        }

        int count = 0;
        int sum = 0;
        for (int j = 0; j < n; j++) {
            for (int k = j; k < n; k++) {
                sum += array[k];
                if (sum < 0) {
                    count++;
                }
            }
            sum = 0;
        }
        System.out.println(count);
    }
}