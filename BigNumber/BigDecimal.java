/*
@Sample Input
9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

@Sample Output
90
56.6
50
02.34
0.12
.12
0
000.000
-100
 */
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++) {
            s[i]=sc.next();
        }
        sc.close();
        //Write your code here
        for (int j = 1; j <s.length; j++) {
            for (int i = 0; i < s.length-3; i++) {
                BigDecimal fomer = new BigDecimal(s[i]);
                BigDecimal beher = new BigDecimal(s[i + 1]);
                if (fomer.compareTo(beher) < 0) {
                    String temp = s[i];
                    s[i] = s[i+1];
                    s[i+1] = temp;
                }
            }
        }
        //Output
        for(int i=0;i<n;i++) {
            System.out.println(s[i]);
        }
    }
}