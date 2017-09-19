
/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * @author Hannah James
 * @since 8/30/17
 * @version 4.7
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab1b {
    
    // data members

    /** Constructor: calls method readFile that reads the doubles
     * contained in the file "<code>filename</code>" and computes the
     * average of the elements.
     @param filename name of the file containing doubles.
    */
    public Lab1b(String filename) {
	readFile(filename);
    }

    /** Reads double from a file named <code>filename</code> and
     * computes the average of the elements contained in the file 
     * @param filename name of the file containing the doubles 
     * 
     */
    public void readFile(String filename) {
	//  -- TO COMPLETE -- Method description here 
    //Array holds values from file then uses loops to calculate the average
    	Scanner input = null;
    	double []numarr=new double[8];
    	int index=0;
    	double count=0;
    	int total=0;
    	try {
    		File file =  new File(filename);
    		input= new Scanner(file);
    		
    		while(input.hasNext() && index < numarr.length)
    		{
    			numarr[index]=input.nextDouble();
    			index++;
    		}
    		
    		for(int i=0;i<numarr.length;i++)
    		{
    			total+=numarr[i];
    			count++;
    		}
    		double avg=total/count;
    		System.out.println(avg);	
    		
    	}
    	catch (FileNotFoundException er)
		{
			System.out.printf("Unrecoverable exception, exiting program %s\n", er);
		}
    	
    } //end readFile()
    
    

    /** main : creates a Lab1b Object with the filename passed in
     * argument*/
    public static void main(String arg[]) {
    	
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter name of file: ");
    	String s = input.nextLine();
    	
	if (s.length() == 0)
	    System.err.println("enter the data file name!");
	else
	    new Lab1b(s);
	
	input.close();
    } //end main
    
} //end class Lab1b