import java.util.Scanner;
public class Assignment_2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int userAge;
Scanner userinput=new Scanner(System.in);
System.out.print("Enter your age:");
userAge=userinput.nextInt();

if(userAge>=18)
{
	System.out.println("You are eligible to vote");
	
}
else
	System.out.println("You are not eligible to vote");
	}

}
