/*
You are given a date. Your task is to find what the day is on that date.

@Sample Input
08 05 2015

@Sample Output
WEDNESDAY
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        in.close();
        
        int YY = Integer.parseInt(year);
        int MM = Integer.parseInt(month);
        int DD = Integer.parseInt(day);
        
        LocalDate currentDate = LocalDate.of(YY, MM, DD);
        DayOfWeek dw = currentDate.getDayOfWeek();
        System.out.println(dw);
    }
}