package com.venu.Main;
import java.util.Scanner;
import com.venu.service.CredentialServices;
public class Driver 
{
	public static void main(String[] args) 
	{
		CredentialServices cs = new CredentialServices();
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		option = sc.nextInt();
		
		switch (option)
		{
		case 1:
			cs.generateEmailAddress();
			cs.generatePassword();
			break;
		case 2:
			cs.generateEmailAddress1();
			cs.generatePassword();
			break;
		case 3:
			cs.generateEmailAddress2();
			cs.generatePassword();
			break;
		case 4:
			cs.generateEmailAddress3();
			cs.generatePassword();
			break;
		default:
			System.out.println("Please select above Options only");
		}		
	}		
}

