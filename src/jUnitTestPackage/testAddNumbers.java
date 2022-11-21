package jUnitTestPackage;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		    int x, y;
		    Scanner s = new Scanner(System.in); 
		    System.out.println("Type a number:");
		    x = s.nextInt(); 
		    System.out.println("Type another number:");
		    y = s.nextInt(); 
		    jUnitFunctions ob = new jUnitFunctions();
		    ob.addnum(x, y);
	}

}