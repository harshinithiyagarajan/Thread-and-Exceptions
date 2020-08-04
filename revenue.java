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
public class revenue {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int up,q,amo,dis,ori;
        System.out.println("enter unit price:");
        up=obj.nextInt();
        System.out.println("enter quantity:");
        q=obj.nextInt();
        amo=up*q;
        if(q>=100 && q<=120)
        {
            dis=amo-(amo/10);
            ori=amo-dis;            
            System.out.println("discount amount:"+dis);
            System.out.println("revenue from sale:"+ori);
        }
        else if(q>=120)
        {
            dis=amo-(amo/15);
            ori=amo-dis;
            System.out.println("discount amount:"+dis);
            System.out.println("revenue from sale:"+ori);
        }
        else 
        {
            System.out.println("there is no discount");
            System.out.println("amount:"+amo);
        }
        
    }
    
}
