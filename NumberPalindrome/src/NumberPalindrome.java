public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int remainder;
        int tempNumber = number;

        if (number<0){

            number = number*(-1);

            while (number!=0){
                remainder = number%10;
                reverse = (reverse*10) + remainder;
                number = number/10;
            }
            if(reverse == (-1)*tempNumber){
                return true;
            }else{
                return false;
            }

        }else{
            while (number!=0){
                remainder = number%10;
                reverse = (reverse*10) + remainder;
                number = number/10;
            }
            if(reverse == tempNumber){
                return true;
            }else{
                return false;
            }
        }
    }
}
