package Beginersassign;

import java.util.Scanner;

public class SwappingUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the value");
		int b=sc.nextInt();
int temp=a;
a=b;
b=temp;
System.out.println("value of a is" +a);
System.out.println("value of b is" +b);
	}

}
