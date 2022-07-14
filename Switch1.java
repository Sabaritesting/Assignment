package Beginersassign;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
switch (num) {
case 1:
	System.out.println("The value of 1 is One");	
	break;
case 2:
	System.out.println("The value of 2 is Two");	
	break;
case 3:
	System.out.println("The value of 3 is Three");	
	break;
case 4:
	System.out.println("The value of 4 is Four");	
	break;
case 5:
	System.out.println("The value of 5 is Five");	
	break;
case 6:
	System.out.println("The value of 6 is Six");	
	break;
case 7:
	System.out.println("The value of 7 is Seven");	
	break;
case 8:
	System.out.println("The value of 8 is Eight");	
	break;
case 9:
	System.out.println("The value of 9 is Nine");	
	break;
case 10:
	System.out.println("The value of 10 is Ten");	
	break;

default:
	System.out.println("Invalid Number");
	break;
}
	}

}
