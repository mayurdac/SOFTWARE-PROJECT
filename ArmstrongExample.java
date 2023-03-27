package day6;

import java.util.Scanner;

public class ArmstrongExample {

	public static void main(String[] args) {
	
		int n; // 1*1*1+5*5*5+ 3*3*3   =153
		
		int rem=0;
		int sum=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter two number ");
		int k= s.nextInt();
		int l= s.nextInt();
		
		//for(int i=k;  i<=l;  i++,rem=0,sum=0)
		for(int i=k;  i<=l;  i++)	
		{
		rem=0;
		sum=0;
		  n=i;
		  
		  
		while(n!=0)
		{
			
			rem= n%10; 
			sum =sum +(rem*rem*rem);
			n= n/10; 
		}
		if( sum==i)
			System.out.println(i);
	}

}
}