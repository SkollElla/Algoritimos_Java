/*
 * 
 * 
 * */

package Programas;

public class Tabuada0a10 {
	public static void main(String...args) {
		
		int x = 1, y = 10, res;
		
		while(x <= 10) {
			System.out.println("Tabuada do: " + x);
			y = 1;
			while(y <= 10) {
				
				res = x * y;
				System.out.println(x + "X" + y + "=" + res);
				y++;
				
			}
			
			x++;
		}
		
	}

}
