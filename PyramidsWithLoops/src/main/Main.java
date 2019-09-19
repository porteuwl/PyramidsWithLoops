/*
 * Luke Porteus
 * nicholdw@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main; 
 
public class Main {

	public static void main(String[] args) {
		  int rows = 5, k = 0;
	        for(int i = 1; i <= rows; ++i, k = 0) {
	            for(int space = 1; space <= rows - i; ++space) {
	                System.out.print("  ");
	            }
	            while(k != 2 * i - 1) {
	                System.out.print("1 ");
	                ++k;
	            }
	            System.out.println();
	        }
	    }
	}
 