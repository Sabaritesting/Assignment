package Beginersassign;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the company name");
var company=sc.next();

switch (company) {
case "Infosys":
	System.out.println("Infosys was started by Narayana Murthy");
	break;
case "TCS":
	System.out.println("TCS was started by Tata Group");
	break;
case"Wipro":
	System.out.println("Wipro was started by Azim Premji");
	break;
case "HCL":
	System.out.println("HCL was started by Shiv Nadar");
	break;
case "Zoho":
	System.out.println("Zoho was started by  Sridhar Vembu");
	break;
default:
	System.out.println("Invalid Name");
	break;
}
	}

}
