package com.Statements;

public class WhileReverse {


	public static void main(String[] args) {
		int a=345785;
		System.out.println("original number:"+a);
		int org=a;
		  int rev=0;
		  int rem=0;
		  
		  while(a>0)
		  {
			    rem=a%10;
			    rev=rev*10+rem;
			   a=a/10;
		  }
		System.out.println("original number:"+a);
		System.out.println("reverse number :"+rev);
	}

}