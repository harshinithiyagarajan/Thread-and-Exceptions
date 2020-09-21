/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise9;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class useddefined {
    public static void main(String[] args){
        credit obj=new credit();
        try
        {
            obj.checker();
        }
        catch(CreditException e)
        {
            System.out.println(e);
        }
    }    
}

class credit
{
    Scanner obj=new Scanner(System.in);
     void checker() throws CreditException
                {
                    System.out.println("enter amount to be credited:");
                    int credit =obj.nextInt();
                    int balance=100;
                    if(credit>0)
                    {
                        balance=balance+credit;
                        System.out.println("credited amount:"+credit+"\nbalance amount:"+balance);
                    }
                    else
                        throw new CreditException("invalid amount");
                }    
}
class CreditException extends Exception
{
    CreditException(String s)
    {
        super(s);
    }
}