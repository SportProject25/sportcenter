package sport;

import java.util.Scanner;


public class Rating {
  static Rating ra;
  String review="";
   
  public Rating() {
        //write the review 
        System.out.println("Attend");
        System.out.println("Write Few Wrods For Our Behlaf:\n");
    
  
    Scanner sc =new Scanner(System.in);
    review=sc.nextLine();
   
    
        //numertical rating 
       //Declaring a variable for switch expression  
    int number=0;
    System.out.println("Rate as Numerical:\n");
    System.out.println("1: Very dissatisfied,\n2: Dissatisfied,\n3: Ok,\n4: Satisfied,\n5: Very Satisfied\n");
    number=sc.nextInt();
    //Switch expression  
    switch(number){  
    //Case statements  
    case 1: 
            System.out.println("Review From Student:\n"+" "+"Very dissatisfied\n"+review); 
           
            
    break;  
    case 2: 
            System.out.println("Review From Student:\n"+" "+"Dissatisfied\n"+review);
    break;  
    case 3: System.out.println("Ok\n"); 
            System.out.println("Review From Student:\n"+" "+"Ok\n"+review); 
    break; 
    case 4: 
            
            System.out.println("Review From Student:\n"+" "+"Satisfied\n"+review);
    break;
    case 5:
            System.out.println("Review From Student:\n"+" "+"Very Satisfied\n"+review);
    break;
    //Default case statement  
    default:System.out.println("Not In Option\n"); 
            
    }  
    
    }
    
  
      
 
    }     
    

