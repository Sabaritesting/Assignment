package Beginersassign;

import java.util.Scanner;

public class PositiveUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
if(a>0) {
System.out.println(a+ "is a positive number");	
}
else {
System.out.println(a+ "is a negative number");	
}
	}

}
