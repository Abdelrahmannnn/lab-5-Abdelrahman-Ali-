package eg.edu.alexu.csd.datastructure.stack.cs41;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

 class applicationTest {
	
	@Test
	
	public void application() {
		
		application a = new application();
		application b = new application();
		application c = new application();
		application d = new application();
		application e = new application();
		application f = new application();
		
		
		
		String g1="2 3 4 + * 6 -";
		String g2="6 2 / 3 - 4 2 * +";
		String g3="24 3 + 3 +";
		String g4="a * b / c";
		String g5="(a / (b - c + d)) * (e - a) * c";
		String g6="a * b + 5";
		 
		//My code answers are
		
		int a1=a.evaluate(g1);
		int a2=b.evaluate(g2);
		int a3=c.evaluate(g3);
		String a4=d.infixToPostfix(g4);
		String a5=e.infixToPostfix(g5);
		String a6=f.infixToPostfix(g6);
		
		
		
		//Right answers are 
		
		String r1="a b c - d + / e a - * c *";
		String r2="a b * c /";
		String r3="a b * 5 +";
		
		
		
		assertEquals(8,a1);
		assertEquals(8,a2);
		assertEquals(30,a3);
		assertEquals(r2,a4);
		assertEquals(r1,a5);
		assertEquals(r3,a6);
		
		
	}
	
	

}
