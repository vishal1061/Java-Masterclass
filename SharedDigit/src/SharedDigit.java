public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if (firstNumber < 10 || secondNumber < 10 || secondNumber > 99 || firstNumber >99){
            return false;
        }else{
            int remainderOne = firstNumber %10;
            int remainderTwo = secondNumber %10;
            firstNumber = firstNumber /10;
            secondNumber = secondNumber/10;
            if(firstNumber == secondNumber || firstNumber == remainderTwo || secondNumber ==remainderOne || remainderOne == remainderTwo){
                return true;
            }else{
                return  false;
            }

        }
    }
}
