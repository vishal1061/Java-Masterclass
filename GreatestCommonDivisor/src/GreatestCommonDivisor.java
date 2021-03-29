public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int x, int y){
        int temp =1;

        if(x<10 || y<10){
            return -1;

        }else{
            if(x<y){
                for(int i =1; i<= x; i++){
                    if(x%i == 0 && y%i == 0){
                        temp = i;
                    }

                }

            }else{

                for(int i =1; i<= y; i++){
                    if(x%i == 0 && y%i == 0){
                        temp = i;
                    }

                }


            }
            return temp;
        }
    }

}
