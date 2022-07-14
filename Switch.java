package Beginersassign;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
switch (num) {
case 1:
	int a=5,b=4;
	int c=a+b;
	System.out.println("Addition"+c);
	break;
case 2:
	int e=5,f=4;
	int g=e-f;
	System.out.println("Subraction"+g);
	break;
case 3:
	int i=5,j=4;
	int k=i*j;
	System.out.println("Multiplication"+k);
	break;
case 4:
	int x=20,y=4;
	int z=x/y;
	System.out.println("Division"+z);
	break;
	
default:
	System.out.println("Invalid Operation");
	break;
}
	}

}
