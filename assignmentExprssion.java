import java.util.Scanner;
public class assignmentExprssion{
  public static void main(String[] args) {
    Scanner readme = new Scanner(System.in);
  
   System.out.println("Enter Two Numbers (Press Enter after each):");
   double n1, n2, n3; //Declaration of variables
   n1 = readme.nextDouble();
   n2 = readme.nextDouble();
   n3 = n1 + n2; // Using assignment operator and make expression
   System.out.println("Total = " + n3);
  }

    
  }
