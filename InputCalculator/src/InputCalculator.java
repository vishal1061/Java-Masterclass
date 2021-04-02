import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int count =0;
        int sum =0;
        long avg = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                count ++;
                sum +=number;
            }else{
                break;
            }
            scanner.nextLine();
        }
        if(count==0){
            System.out.println("SUM = " + sum + " AVG = " + avg);
        }else{
            double tempAvg =   ((double) sum/count);

            avg = Math.round(tempAvg);
            System.out.println("SUM = " + sum + " AVG = " + avg);
        }


        scanner.close();
    }
}
