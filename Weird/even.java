package Weird;

import java.util.Scanner;

public class even {

    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    //  82778 / 86630
// Consider an algorithm that takes as input a positive integer 
// n n. If   n is even, the algorithm divides it by two, and if  n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for 
// n = 3
    int n;
              System.out.println("Enter the Value of n : ");
              n = sc.nextInt();
           for (int i = 1; i< n ;) {

                 if(n % 2 == 1)
              { 
               n = n * 3 + 1;


              }
              else {
      
               n = n/2;

              }
               System.out.println("Value of n = "+  n);
           
           }

        }
    }


