/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class oddeven {
    public static void main(String[] args){
        Scanner obj=new Scanner (System.in);
        System.out.println("enter no of elements in array:");
        int n=obj.nextInt();
        int i,odd=0,even=0;
        int[] a=new int[n];
        System.out.println("enter array elements");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even=even+a[i];
            }
            else
            {
                odd=odd+a[i];
            }
        }
        System.out.println("sum of odd numbers:"+odd);
        System.out.println("sum of even numbers:"+even);
    }
    
}
