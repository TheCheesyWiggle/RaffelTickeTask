
package raffeltickets;

import java.util.*;

import java.io.*;

public class RaffelTickets {

    
    public static void main(String[] args) {
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            Random rand = new Random(2);
            
            System.out.println("Welcome to my raffle. \n Please make a selection:");
            System.out.println("1: Check a Raffle ticket \n 2: Purchase a Raffel ticket ");
            int menuselection = Integer.parseInt(input.readLine()); 
            
            int raffelnum = 500;
            int raffelsold = 7;
            
            
            String[] raffeldata = new String[500]; 
            /*for(int i=0;i<7;i++){
                int randnum = rand.nextInt();
                String names[]={"John","Katie","Greg"};
                String surnames[]={"Smith","Jones","Adams"};
                raffeldata[i] = names[randnum]+" "+surnames[randnum];
            }
            */
            switch(menuselection){
                case(1):
                    System.out.println("Please enter name: ");
                    String checkname =  input.readLine();
                    System.out.println("Please enter raffel number: ");
                    int num = Integer.parseInt(input.readLine());
                    
                    //if(raffeldata[num-1]!= checkname){
                    //   System.out.println("This is not your ticket");
                    //}
                    
                    boolean flag = false;
                    for (int i = 2; i <= num / 2; ++i) {
                      // condition for nonprime number
                      if (num % i == 0) {
                        flag = true;
                        break;
                      }
                    }

                    if (!flag){
                      System.out.println(num + " is a winning ticket");
                    }
                      else{
                      System.out.println(num + " is not a winning ticket");
                    }
                    break;
                case(2):
                    raffelsold++;
                    System.out.println("Please enter your full name :");
                    String name = input.readLine();
                    System.out.println("Your Raffel number is "+raffelsold +" your name is " +name);
                    raffeldata[raffelsold-1] = name;
                    break;
                default:
                    System.out.println("Error not valid input");
                    break;
                }
            } 
        catch(Exception e){
            System.out.println("EXCEPTION: ERROR OCCURED");
        }
    }
    
}
