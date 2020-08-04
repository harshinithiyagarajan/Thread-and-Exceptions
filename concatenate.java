
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiagarajan
 */
public class concatenate {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a string");
        String a=obj.next();
        System.out.println("enter the string to be concatenated");
        String b=obj.next();
        int n1=a.length();
        int n2=b.length();
        int n=0;
        char[] ch=new char[n1+n2];
        for(int i=0;i<n1;i++)
        {
            ch[n++]=a.charAt(i);
        }
         for(int i=0;i<n2;i++)
        {
            ch[n++]=b.charAt(i);
        }
         String str=String.valueOf(ch);
         System.out.println(str);
                

    }
    
}
