package assignment4;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		int min;
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		if(a>b)
			min=a;
		
		else
			min=b;
		
		while(true)
		{		
			
			if(min%a==0 && min%b==0)
			{
				System.out.println(min);
				break;
			}
			
			min++;
		
		}

	}

}
