/*
 * Assignment 04
 * Luke Porteus
 * porteuwl@mail.uc.edu
 * IS4010 App Dev with Java
 * Fall 2019
 * 09/24/2019
 * Description: Printing pyramids using loops.
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
		  int rows = 5, k = 0;	//declares 5 rows
	        for(int i = 1; i <= rows; ++i, k = 0) {	//if i is less than or equal to number  of row, add 2 more i's
	            for(int space = 1; space <= rows - i; ++space) { // As rows go down, space is subtracted
	                System.out.print(" "); // prints space
	            }
	            while(k != 2 * i - 1) { //start of loop
	                System.out.print(i); //prints i
	                ++k; //increments k by 1
	            }
	            System.out.println(); //prints loop
	        }
	    }
	}
  