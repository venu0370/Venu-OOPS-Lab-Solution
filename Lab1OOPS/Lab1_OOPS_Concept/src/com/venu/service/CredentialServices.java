package com.venu.service;

import java.util.Random;

import com.venu.model.Employee;

public class CredentialServices
{
	Employee obj = new Employee("venu","sdr");
	public void generateEmailAddress()
	{
		System.out.println("Dear "+ obj.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email------->"+obj.getFirstName()+obj.getLastName()+"@tech.abc.com");	 
	}
	public void generateEmailAddress1()
	{
		System.out.println("Dear "+ obj.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email------->"+obj.getFirstName()+obj.getLastName()+"@admin.abc.com");
	}
	public void generateEmailAddress2()
	{
		System.out.println("Dear "+ obj.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email------->"+obj.getFirstName()+obj.getLastName()+"@hr.abc.com");
	}
	public void generateEmailAddress3()
	{
		System.out.println("Dear "+obj.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email------->"+obj.getFirstName()+obj.getLastName()+"@legal.abc.com");
	}
	
public char[]generatePassword()
{
	String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lower = "abcdefghijklmnopqrstuvwxyz";
	String num = "0123456789";
	String specialChars = "!@#$%^&()+";
	String combination = upper+lower+specialChars+num;
	char[]password = new char [8];
	
	Random r = new Random();
	
	for(int i=0;i<8;i++)
	{	
	password[i]=combination.charAt(r.nextInt(combination.length()));
	}
	System.out.println("Password---->"+new String(password));
		
	return password;
	}
}
