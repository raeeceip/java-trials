package methods;

public class CalculateSum {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 10;
        int sum = calculateSum(num1, num2);
        System.out.println("The sum is: " + sum);
    }
    public static int calculateSum(int num1, int num2){
        return num1 + num2;
    }
}
