package com.lib.dao;
import java.util.Collections;
import java.util.TreeSet;
import java.util.*;
import com.lib.model.Book;
import com.lib.model.PopularityComparator;
public class DataManage {
	 TreeSet<Book> t = new TreeSet<Book>(new PopularityComparator()); 
	public DataManage(){
		
	}
	public void Addbook()
	{
	Scanner sc=new Scanner(System.in);
	Book B=new Book();
	System.out.print("please enter book name");
	B.setTitle(sc.nextLine());
	System.out.print("please enter author name");
	B.setAuthor(sc.nextLine());
	System.out.print("please enter Isbn ");
	B.setIsbn(sc.nextLine());
	System.out.print("please enter rating");
	B.setRating(sc.nextInt());
	t.add((Book)B);
	System.out.print("Book Details added Successfully");
	
	}
	
	public void Bookname() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the book name:");
	    String bn = sc.nextLine();
	    boolean found = false;

	    Iterator<Book> iterator = t.iterator();
	    while (iterator.hasNext()) {
	        Book book = iterator.next();
	        if (book.getTitle().equals(bn)) {
	            found = true;
	            iterator.remove(); 
	            update(book);
	            break; 
	        }
	    }

	    if (!found) {
	        System.out.println("Book not found.");
	    }
	}
	public void update(Book b)
	{
			System.out.println("Do you want to change name of existing book title then enter 1");
			System.out.println("Do you want to change author of book  then enter 2");
			System.out.println("Do you want to change Isbn of  book  then enter 3");		
			System.out.println("Do you want to change Rating of the  book title then enter 4");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			String s;
			switch(n)
			{
			case 1 :
				System.out.println("please enter new book name:");
				s=sc.next();
				b.setTitle(s);
				t.add(b);
				System.out.println("Updated successfully");
				break;
				
			case 2:
				System.out.println("please enter new Author name:");
				s=sc.next();
				b.setAuthor(s);
				t.add(b);
				System.out.println("Updated successfully:");
				break;
			case 3:
				System.out.println("please enter new Isbn: ");
				s=sc.next();
				b.setIsbn(s);
				t.add(b);
				System.out.println("Updated successfully");
				break;
				
			case 4:
				System.out.print("please enter new rating:");
				int val=sc.nextInt();
				b.setRating(val);
				t.add(b);
				System.out.print("Updated successfully");
				break;
			default:
				t.add(b);
	            System.out.println("Invalid option.");
	            break;		
			}
			
	}
	public String toString( Book b)
	{
		return b.getTitle()+" "+b.getRating();
	}
	public void Display()
	{
		for(Book i:t)
		{
		System.out.println(toString(i));
		}
	}
	
}
