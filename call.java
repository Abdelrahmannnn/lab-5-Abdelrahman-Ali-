package eg.edu.alexu.csd.datastructure.stack.cs41;

import java.util.Scanner;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * main class for the user interface
 *
 */
public class call {

	public static void main(String[] args)  {
		implement y = new implement();
				
		int x ;
		Scanner t= new Scanner (System.in);
		Object r;
		int w;
		boolean m;
		boolean b=true;
		while(b==true) {
			System.out.println("Enter the operation you want: ");
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: Peek");
			System.out.println("4: Get size");
			System.out.println("5: Check if empty");	
			System.out.println("6: End stack operations ");		
			x= t.nextInt();	
			
			
		if(x==1) {
			System.out.println("Enter the element you want to push : ");
			y.push(t.nextInt());
		}
		else if(x==2) {
			try {
			r=y.pop();
			System.out.println(r);
			}catch( Exception e) {
				System.out.println("Stack is empty. ");
			}
			
		}
		else if(x==3) {
			try {
			r=y.peek();
			System.out.println(r);
			}catch(Exception e) {
				
			}
		}
		else if(x==4) {
			
		w=y.size;
		System.out.println(w);
		}
		
		
		else if(x==5) {
			m=y.isEmpty();
			System.out.println(m);
		}
		else if (x==6) {
			b=false ;
		}
		else {
			try {
				throw new Exception ("invalid number");
			} catch (Exception e) {				
				System.out.println("invalid number : ");
			}
		}

	}
		application q=new application();
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in) );
		System.out.println("Enter the string : ");
		String exp ="";
		try {
			exp = br.readLine();
		} catch (IOException e) {
			
		}
		
		System.out.println("Enter the operation you want: ");
		System.out.println("1: evaluate ");
		System.out.println("2: infixToPostfix ");
		x= t.nextInt();	
		if(x==1) {
			
				int v=q.evaluate(exp);
				System.out.println(v);
				
		}else if(x==2) {
			
			try {
				String ff= q.infixToPostfix(exp) ;
				System.out.println(ff);
				}catch(Exception e) {
					System.out.println("Error");
				}
			
		}
		
		
		
	

}
}
