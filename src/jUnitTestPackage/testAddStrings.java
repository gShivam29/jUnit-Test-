package jUnitTestPackage;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		 Scanner s = new Scanner(System.in); 
		 jUnitFunctions ob = new jUnitFunctions();
		 String a,b;
		 System.out.println("Type a string:");
		 a=s.nextLine();
		 System.out.println("Type a string:");
		 b=s.nextLine();
		 ob.addstring(a,b);
	}

}