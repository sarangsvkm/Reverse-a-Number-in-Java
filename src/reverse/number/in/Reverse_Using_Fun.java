package reverse.number.in;

import java.util.Scanner;

public class Reverse_Using_Fun {
	static void reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		System.out.println("The reverse of the given number is:"+rev);
	}

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("enter a given number");
		int num=obj.nextInt();
		reverse(num);

	}

}
