/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

/**
 *
 * @author WOCHIENG1
 */
//find sum of numbers btw 5-10
//declare the methods
//test if start is greater than end
//return sum else return end
public class SimpleRecursion {
    public static int sumRecursion(int start, int end){
        if(end > start){
            System.out.print("End"+end+"Start"+start+"\n");
            return end + sumRecursion(start, end-1);
        }else{
            return end;
        }
    }
    //driver class
    public static void main(String args[]){
        int sum = sumRecursion(5,10);
        System.out.println("Recursive sum is: "+ sum);
    }
    
}