//https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
package samm;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormat {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List l=new ArrayList();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        int Ino = sc.nextInt();
        int Ino2=sc.nextInt();
        int dno=sc.nextInt();
        	arr[Ino]=Ino2;
        
       for(int i=0;i<arr.length;i++) {
    	l.add(arr[i]);   
       }
       
       System.out.print(l);
        
    }}