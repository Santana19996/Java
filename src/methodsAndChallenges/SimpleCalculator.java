package methodsAndChallenges;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult(){
        if (secondNumber == 0){
            return 0;
        }
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5);
        calculator.setSecondNumber(4);
        System.out.println("Addition result is: " + calculator.getAdditionResult());
        System.out.println("Subtraction result is: " + calculator.getSubtractionResult());
        System.out.println("Multiplication result is: " + calculator.getMultiplicationResult());
        System.out.println("Division result is: " + calculator.getDivisionResult());
    }
}


