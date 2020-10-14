/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise11;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class interthread {
    public static void main(String[] args) throws InterruptedException{
        T p=new T();
        producer credit=new producer(p);
        consumer debit=new consumer(p);        
    }    
}
class T
{
    boolean value=false;
    synchronized int get()
    {
        while(!value)
        try
        {
            wait();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        notify();
        return 0;
    }
    synchronized void put(int n)
    {
        while(value)
            try{
                wait();
            }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }              
    }
}
class producer implements Runnable
{
    T p;
    producer(T p) throws InterruptedException
    {
        this.p =p;
        new Thread(this,"producer").start();
        
    }
    Scanner obj=new Scanner(System.in);
    public void run()
    {
        int balance=10000,credit;
        System.out.println("Enter amount to be credited");
        credit=obj.nextInt();
        if(credit>0)
        {
            balance+=credit;
            System.out.println("Balance after credited:"+balance);
        }
        else
            System.out.println("Enter valid amount");
    
    }
}
class consumer implements Runnable
{
    T p;
    Scanner obj=new Scanner(System.in);
    consumer(T p) throws InterruptedException
    {
        this.p =p;
        new Thread(this,"consumer").start();
        
    }
    public void run()
    {
        int balance=10000,debit;
        System.out.println("Enter amount to be debited");
        debit=obj.nextInt();
        if(debit>0) 
        {
            balance-=debit;
            System.out.println("Balance after debited:"+balance);
        }
        else
            System.out.println("Enter valid amount");
    }
}