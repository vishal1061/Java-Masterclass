public class EqualSumChecker {
    public static boolean hasEqualSum (int firstNumber, int secondNumber, int thirdNumber){
        int sumNumber = firstNumber + secondNumber;

        if (sumNumber == thirdNumber){
            return true;

        } else {
            return false;
        }
    }
}
