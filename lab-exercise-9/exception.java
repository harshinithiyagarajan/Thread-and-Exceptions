/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class exception {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a[]={1,2,3};
        String b="welcome";
        int i =Integer.parseInt(obj.next());
        int j =Integer.parseInt(obj.next());
        try
        {
            int k=i/j;
            System.out.println(k);
            System.out.println(a[2]);
            System.out.println(b.substring(9));
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
          
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
               
    }
    
}
