package com.Statements;

public class IfElseAge {

	
	    public static void main(String[] args)
	      {
	        int Ram = 20;
	        int Rahul = 25;
	        int Nikhil= 30;
	        if (Ram>Rahul  &&  Ram>Nikhil ) 
	         {
	            System.out.println("Ram is older Nikhil and"
	            		+ " Rahul are younger");
	         }
	         else if (Rahul>Ram  &&  Rahul>Nikhil  ) 
	         {
	            System.out.println("Rahul is older, "
	            		+ "Ram and Nikhil are younger");
	          }
	             else
	              {
	                  System.out.println("Nikhil is older ,"
	                  		+ " Ram and Rahul are younger");
	               }
	           }
	}       
	  