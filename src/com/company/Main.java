package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc  = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter Array");
        String line = sc.nextLine();
        String[] token = line.split("");
        for(int i=0;i<token.length;i++){
            arr.add(Integer.parseInt(token[i]));
        }
        Collections.sort(arr, Collections.reverseOrder());
        int count = 0;
        int i = 1;
        while(arr.get(0)!=arr.get(arr.size()-1)){
            if(arr.get(i-1)>arr.get(i)){
                arr.set(i-1,arr.get(i));
                count++;
                i = 0;
            }
            i++;
        }
        System.out.println("Number of Steps: "+ count);
    }
}
