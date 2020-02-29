
package sport;

import java.util.Scanner;
import static sport.sportClass.op;
import static sport.Rating.ra;
import static sport.changeClass.ch;
import static sport.monthlyReport.mr;
import static sport.championClass.ca;

public class main {

    public static void main() {
    System.out.println("Choose Your Option");
    System.out.println("1. Book a group exercise class\n" +
"2. Change a booking\n" +
"3. Attend a class\n" +
"4. Monthly class report\n" +
"5. Monthly champion class report\n"+
"6. Exit\n");
        
    //Declaring a variable for switch expression  
    int number=0;
    Scanner sc =new Scanner(System.in);
    number=sc.nextInt();
    //Switch expression  
    switch(number){  
    //Case statements  
    case 1:  op =new sportClass();
             System.out.println("\nDo You Want To Choose Another Option");
             main();
    break;  
    case 2: op.list();
            ch =new changeClass();
             System.out.println("\nDo You Want To Choose Another Option");
            main();
    break;    
    case 3: ra = new Rating(); 
            System.out.println("\nDo You Want To Choose Another Option");
            main();
    break;
    case 4: mr=new monthlyReport();
                 mr.rating();
            System.out.println("\nDo You Want To Choose Another Option");
            main();
    break;
    case 5:ca=new championClass();
              main();  
    break;
     case 6:
         System.exit(0);
         System.out.println("Exit");
    break;  
    //Default case statement  
    default:System.out.println("Invalid");  
    }  
    
    }
    
    
    public static void main(String[] args) {
       
        main();
    }

   
}
