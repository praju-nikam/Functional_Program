package com.java.QuadraticEquation;

import java.util.Scanner;

public class Quadratic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a vlue a,b,c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double root1,root2;
        //calculate Determinant (b^2-4ac)
        int delta = b * b - 4 * a * c;
        System.out.println("Determinant :" +delta);
    }
}

