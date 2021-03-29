public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        int remainder;
        int sum = 0;
        if(number<0){
            return -1;

        }else{
            while (number!=0){
                remainder = number %10;
                if(remainder %2 ==0){
                    sum+=remainder;
                }
                number = number/10;
            }
            return sum;
        }
    }
}
