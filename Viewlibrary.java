package com.lib.view;
import com.lib.model.*;
import com.lib.dao.*;
import java.util.*;
public class Viewlibrary {
	public static void main(String[]args)
	{
		System.out.println("Welcome to this library ");
		
		DataManage d1=new DataManage();
		Scanner sc=new Scanner(System.in);
		boolean a=true;
		while(a)
		{
			System.out.println("please enter 1 to add a new Book");
			System.out.println("please enter 2  to update book:");
			System.out.println("please enter 3  to  view all books :");
			System.out.println("please enter 4 to exit :");

			System.out.println("Please enter a number :");
System.out.println();
			int i=sc.nextInt();
			if(i==1)
			{
				d1.Addbook();
				
			}
			if(i==2)
			{
				System.out.println("ENter the book name which you want to update:");
				
				d1.Bookname();
			
				
			}
			if(i==3)
			{
				d1.Display();
				
				
			}
			if(i==4)
			{
				a=false;
			}
			System.out.println();
			
			
		}

		
		
	}

}
