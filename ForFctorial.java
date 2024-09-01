/*package com.Statements;

public class ForFctorial {
	public static void main(String[] args) 
	{ 
		for(int x=10; x>=1;x--)
		{
			
			System.out.println(x);
		}
		
	}
}*/
package com.Statements;

import java.util.Scanner;

public class  ForFctorial  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        long factorial = 1;
        
        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("The factorial of " + number + " is " + factorial);
        
        scanner.close();
    }
}
