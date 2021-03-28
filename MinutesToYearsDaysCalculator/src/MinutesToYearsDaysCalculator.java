public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays (long minutes){
        if (minutes <0){
            System.out.println("Invalid Value");
        }else{
            long noOfDays = minutes / (60*24*365);
            long remainingMinutes = minutes % (60*24*365);
            long remainingDays = remainingMinutes /(60*24);

            System.out.println(minutes + " min = "+ noOfDays + " y and " + remainingDays +" d" );
        }
    }
}
