/*
@Sample Input
12324.134

@Sample Output
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
*/

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);
        String us = fmt.format(payment);
        Locale indiaLocale = new Locale("en", "IN");
      
        fmt = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = fmt.format(payment);
        
        fmt = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = fmt.format(payment);
        
        fmt = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = fmt.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}