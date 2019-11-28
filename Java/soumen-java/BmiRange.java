import java.util.Scanner;
class BmiRange
{

  public static void main(String arg[])
       
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Your Weight In Kgs.: "); 
          double kg=sc.nextDouble();
          System.out.println("Enter Your Height In Mtrs.: "); 
          double mtr=sc.nextDouble();
          double BMI=kg/(mtr*mtr);
		if(BMI<=18.5)
			{
				 System.out.println("You Are UnderWeight");
			}
		else if(BMI>=18.8){
			 System.out.println("You Are In The Healthy Range");
		}
		
		else if(BMI>=25){
			 System.out.println("You Are In Over Weight Range");
		}
		else if(BMI>=30 && BMI<=39.9){
			 System.out.println("You Are In Obese Range");
		}
      }
}