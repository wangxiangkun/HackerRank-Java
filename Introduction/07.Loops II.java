/*
We use the integers a, b, and q to create the following series:
a + 2^0 * b + ... + 2^(n-1) * b

@Output Format
For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

@Sample Input
2
0 2 10
5 3 5

@Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

@append
第一行的参数是执行程序的组数，第二行及以后的参数是公式里的两个变量和数列的长度.
*/

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int k = 0;
            int temp = 0;
            for(int j = 0; j < n; j++) {
                while(k <= j) {
                    temp += (int)Math.pow(2, k++) * b;
                }
                temp += a;
                System.out.print(temp + " ");
                temp = k = 0;
            }
            System.out.println();
        }
        in.close();
    }
}