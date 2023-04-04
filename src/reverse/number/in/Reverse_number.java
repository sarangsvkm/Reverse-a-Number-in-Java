package reverse.number.in;

public class Reverse_number {

	public static void main(String[] args) {
	int number=9874,rev=0;
	while(number!=0)
	{
	int rem=number%10;
	rev=rev*10+rem;
	number=number/10;
	}
	System.out.println("The reverse of the given number is:"+rev);
	

	}

}
