package com.Statements;

public class IfElese {

	 public static void main(String[] args)
     {
       int n = 10;
       if (n >0) 
        {
            System.out.println("Number is positive");
              if(n % 2 == 0)
                {
                     System.out.println("Number is even");
                }
              else
                 { 
                       System.out.println("Number is odd");
                 }
         }    
              else if (n<0)
            {
             System.out.println("Number is negative");
            }
       else
           {
             System.out.println("Number is zero");
           }
    }  
}
