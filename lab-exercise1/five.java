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
public class five {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the range");
        int n=obj.nextInt();
        System.out.println("no of 5's present from 1 to "+n+"is:");
        count1 a=new count1();
        System.out.println(a.first(n));    
}
}
class count1
{
    int lim;
    public int first(int n)
    {
        int count=0;
        for(int i=0;i<=n;i++)
        {
            count+=second(i);
        }
        return count;
    }
    
    public int second(int i)
    {
        int count=0;
        while(i>0)
        {
            if(i%10==5)
            {
                count++;
                i=i/10;
            }      
        }   
    
         return count;
    } 
}
