import java.util.Scanner;
class GradeIf
{

  public static void main(String arg[])
       
      {	
	char grade = 'A';
      


	if(grade == 'A')
	{
		System.out.println("FCD");
	}
	
	else if(grade == 'B')
	{
		System.out.println("FC");
	}

	else if(grade == 'C')
	{
		System.out.println("Just Pass");
	}

	else if(grade == 'D')
	{
		System.out.println("Fail");
	}

	else
	{
		System.out.println("Invalid Grade");
	}

	

      }
}