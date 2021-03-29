public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int count =0;
        int sum = 0;
        int tempValue;
        if (number<0){
            return -1;
        }else{
            while (number!=0){

                tempValue = number % 10;
                count ++;
                if (count ==1){
                    sum +=tempValue;
                }

                number /=10;

                if (number ==0){
                    sum +=tempValue;
                }

            }


            return sum;
        }
    }
}
