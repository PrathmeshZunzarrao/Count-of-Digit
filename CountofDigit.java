import java.util.Scanner;
class  CountofDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		
		int count = 0;

		while(num>0)
		{
			count ++;
			num = num/10;
		}

		System.out.println("Count of digits in number : " + count);
	}
}
