public class LargestPrime {
    public static int getLargestPrime(int number){
        if (number<= 1){
            return -1;
        }else{

            int temp = number;

            for (int j =2; j<number ; j++){

                if (number % j ==0){

                    int count = 0;
                    for (int i = 2 ; i <= j ; i++){
                        if(j%i ==0){
                            count++;

                        }
                    } if(count == 1){
                        temp = j;
                    }

                }

            }

            return temp;

        }
    }
}
