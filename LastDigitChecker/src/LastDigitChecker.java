public class LastDigitChecker {

    public static boolean hasSameLastDigit(int first, int second, int third){
        if(first<10 || second < 10|| third<10 || first>1000 || second > 1000|| third>1000){
            return false;
        }else{
            int firstLast = first%10;
            int secondLast = second%10;
            int thirdLast = third%10;
            if(firstLast==secondLast || firstLast == thirdLast || secondLast ==thirdLast){
                return true;
            }else{
                return false;
            }
        }
    }

    public static boolean isValid(int x){
        if(x<10 || x> 1000){

            return false;
        }else{
            return true;

        }
    }
}
