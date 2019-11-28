import java.util.Scanner;
class Sum
{

  public static void main(String arg[])
       
      {	
	int sum1=0;
	for(int i = 0;i<=10;i++)
		{
			sum1=sum1+i;
		}	
	System.out.println("Sum Of The First 10 no: "+sum1);

	int sum2=0;
	for(int i = 0;i<=100;i++)
		{
			sum2=sum2+i;
		}	
	System.out.println("Sum Of The First 100 no: "+sum2);

	int sum3=0;
	for(int i = 0;i<=1000;i++)
		{
			sum3=sum3+i;
		}	
	System.out.println("Sum Of The First 1000 no: "+sum3);

      }
}