public class LargestPrime {
    public static int getLargestPrime(int number){
        if (number<= 1){
            return -1;
        }else{

            int temp =1;
            for (int i =1; i<= number; i++){
                int count = 0;
                if(number % i ==0 ){
                    if (i != 1){
                        for (int j =2; j<i ; j++){
                            if(i%j==0){
                                count++;
                            }
                            if (count == 0){
                                temp = i;
                            }
                        }

                    }else {
                        continue;
                    }

                }
            }
            return temp;
        }
    }
}
