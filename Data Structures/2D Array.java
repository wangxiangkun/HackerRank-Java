/*
@Sample Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

@Sample Output
19

@Explanation
The hourglass which has the largest sum is:
2 4 4
  2
1 2 4
*/

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int temp;
        int res = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] +
                           arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (i == 0 && j == 0) {
                    res = temp;
                }
                res = res >= temp ? res : temp;
            }
        }
    }
}