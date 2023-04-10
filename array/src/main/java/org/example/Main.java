package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int[] number=new int[n];
        String[] strings=new String[n];
        System.out.println("Enter numbers:");
        for(int i=0;i<n;i++){
            if(sc.hasNext()){
                number[i]=sc.nextInt();
            }
        }
        System.out.println("Enter Strings:");
        for(int i=0;i<n;i++){
            if(sc.hasNext()){
                strings[i]=sc.next();
            }
        }
        System.out.println("Displaying numbers");

        for(int i:number){
            System.out.println(i);
        }

        System.out.println("Displaying strings");
        for(String s:strings){
            System.out.println(s);
        }

    }
}