import java.util.Scanner;
public class Sum{
	public static void main (String []args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int number = input.nextInt();

	int one = number %10;
	int two = number / 10;
	int three = two / 10 ;
	int four = three % 10;


	System.out.print(one + two + number);
	
	


	
	}
}