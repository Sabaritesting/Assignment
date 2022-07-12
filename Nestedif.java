		package Beginersassign;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Grade");
		int a=sc.nextInt();
		if(a>=96) {
		System.out.println("Distinction");	
		}
		else if(a>=80) {
			System.out.println("First Class");
		}
		else if(a>=70) {
			System.out.println("Second Class");
		}
		else if(a>=60) {
			System.out.println("Third Class");
		}
		else if(a>=50) {
			System.out.println("Lower Level");
		}
		else if(a>=30) {
			System.out.println("Reappear");
		}
	}

}
