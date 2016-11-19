//
//  JavaInstanceOfKeyword.java
//  HackerRank
//
//  Created by Fabrizio Duroni on 19/11/2016.
//
//  https://www.hackerrank.com/challenges/java-instanceof-keyword

import java.util.ArrayList;
import java.util.Scanner;

class Student {}
class Rockstar {}
class Hacker {}

public class JavaInstanceOfKeyword {

	static String count(ArrayList<Object> mylist) {
		
		int a = 0, b = 0, c = 0;
		
		for (int i = 0; i < mylist.size(); i++) {
			
			Object element=mylist.get(i);
			
			if (element instanceof Student) {
				
				a++;
			}
			
			if (element instanceof Rockstar) {
				
				b++;
			}
			
			if (element instanceof Hacker) {
				
				c++;
			}
		}
		
		String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
		
		return ret;
	}

	public static void main(String[] args) {
		
		ArrayList<Object> mylist = new ArrayList<Object>();
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			String s = sc.next();
			
			if (s.equals("Student")) {
				
				mylist.add(new Student());
			}
			
			if (s.equals("Rockstar")) {
				
				mylist.add(new Rockstar());
			}
			
			if (s.equals("Hacker")) {
				 
				mylist.add(new Hacker());
			}
		}
		
		sc.close();
		
		System.out.println(count(mylist));
	}
}
