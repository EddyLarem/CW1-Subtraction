

import java.util.Random; 
// imports the Random class to generate random integers


import java.util.Scanner; 
// import 'Scanner' to get input from user(student) when prompted for the answer
 


public class Subtraction {


      public static void main(String[] args) {


                  Scanner scanner = new Scanner(System.in);

                  
Random random = new Random();



                  // generate random integers

                  // for single digit integer must be below 10
                  int a = random.nextInt(1,10);


 
                  //keep the bounds of the range to include 1 and exclude 10
                  int b = random.nextInt(1,10);



                  // swap values if b is greater than a

                  if (b > a) {
		  // swap using bitwise XOR operator


                    a = a ^ b;


                    b = a ^ b;


                    a = a ^ b;

                  }


                  //Prompt student to input answer for subtraction problem
		  System.out.println("What is " + a + " - " + b);


                  // get input from student
		  int c = scanner.nextInt();


                  // compare values and out the answer to the screen
		  if (c == (a - b)) {

                  System.out.println(c + " is the correct answer");

                  } else {

                    
                  System.out.println("Sorry, the correct answer is  " + (a - b));


                  }


		  scanner.close();       
            }


}
