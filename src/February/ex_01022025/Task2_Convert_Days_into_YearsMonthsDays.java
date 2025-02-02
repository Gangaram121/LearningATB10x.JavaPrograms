package February.ex_01022025;

public class Task2_Convert_Days_into_YearsMonthsDays {
    public static void main(String[] args) {
        int days = 1095;
        int years = days/365;
        int months = (days%365)/30;
        int remainingDays = (days%365)%30;
        System.out.println("Years: "+years);
        System.out.println("Months: "+months);
        System.out.println("Days: "+remainingDays);
    }
}

//Define the conversion logic:
//
//        :- Assume 1 year = 365 days.
//
//        :- Assume 1 month = 30 days
//
//        :- Convert the Days into Years, Month and days and Print it.
//
//        if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.
