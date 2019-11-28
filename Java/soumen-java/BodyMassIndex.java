import java.util.Scanner;
class BodyMassIndex
{

  public static void main(String arg[])
       
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Your Weight In Kgs.: "); 
          double kg=sc.nextDouble();
          System.out.println("Enter Your Height In Mtrs.: "); 
          double mtr=sc.nextDouble();
          double BMI=kg/(mtr*mtr);
           System.out.println("Your BMI is: "+ BMI);
      }
}