package com.Statements;

public class ForLoopDiamond
{
    public static void main(String[] args) {
        
        // Upper half of the diamond
        for(int i = 1; i <= 5; i++) {
            for(int j = 5; j > i; j--) {
                System.out.print(" ");
            } 
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Lower half of the diamond
        for(int i = 4; i >= 1; i--) {
            for(int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
