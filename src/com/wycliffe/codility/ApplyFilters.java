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
//Algo
/*
get the sum of polution and half it as target
get max element then half it.
initialize count
get the new sum and check if less than target 
    if less than target
    then increment count
    return count
else if target 
*/
public class ApplyFilters {
    public static int [] solution(Object...args){
        int someArr[] = {1,2,3,4};
        for(int i:someArr){
            System.out.println(">>>"+i);
        }
       return someArr; 
    }
    public static void main(String...args){
        solution();
    }
}
