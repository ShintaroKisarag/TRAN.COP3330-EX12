/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;

class Interest{
    double principal;
    double rate;
    int years;
    public void inputs(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        principal = input.nextDouble(); //stores principal
        System.out.print("Enter the rate of interest: ");
        rate = input.nextDouble();  //stores rate
        System.out.print("Enter the number of years: ");
        years = input.nextInt();    //store years
    }
    public void outputs(){
        int value =(int)Math.round(principal*(1+rate*years*0.01));  //calculates interest
        System.out.println("After "+years+" years at "+rate+"%, the investment will be worth $"+value);
    }
}

public class ex12 {
    public static void main(String[] args){
        Interest call = new Interest();
        call.inputs();  //calls function inputs
        call.outputs(); //calls function outputs

    }
}
