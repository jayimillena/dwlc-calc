import java.util.Scanner;

public class Calc
{
  public static void main(String[] args) 
  {
    System.out.println("Welcome to Calculator");
    System.out.println("Select an operation");
    System.out.println("[1] Addition ");
    System.out.println("[2] Subtraction");
    System.out.println("[3] Multiplication");
    System.out.println("[4] Division");
    
    Scanner input = new Scanner(System.in);
    String operator = input.nextLine();
    if (operator.equals("1"))
    {
      System.out.println("You have chosen addition operator");
      System.out.print("Enter the first number: ");
      int firstNumber = input.nextInt();
      System.out.print("Enter the second number: ");
      int secondNumber = input.nextInt();
      System.out.println("The sum of "+ firstNumber +" and "+secondNumber+" is "+ getSum(firstNumber, secondNumber));

      input.close();
    }
  }

  public static double getSum(double firstNumber, double secondNumber)
  {
    return firstNumber + secondNumber;
  }
}