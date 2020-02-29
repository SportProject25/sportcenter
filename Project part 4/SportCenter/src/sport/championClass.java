
package sport;

import java.util.Scanner;


public class championClass {
   static championClass ca;
    int result;
   
    public championClass() {
    int month;
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose Your Option for Champion Class\n");
    System.out.println(
"January= 1\n" +
"February= 2\n" +
"March= 3\n" +
"April= 4\n"+
"May= 5\n"+
"June= 6\n"+
"July= 7\n"+   
"August= 8\n"+            
 "September= 9\n"+           
 "October= 10\n"+   
 "November= 11\n"+
 "December= 12\n");
  
  month=sc.nextInt();
    
        switch (month) {
            case 1:
                System.out.println("January\n");
                System.out.println("Chapion class of the month");
                
                System.out.println("Yoga=> $" + 5000);
                System.out.println("Zumba=> $" + 11000);
                result=5000+11000;
                System.out.println("Total Income=> $"+result);
               
                break;
            case 2:
                System.out.println("February\n");
                System.out.println("Chapion class of the month");
                
                System.out.println("Zumba=> $" + 4000);
                System.out.println("Aquacise=> $" + 10000);
                result=4000+10000;
                System.out.println("Total Income=> $"+result);
                break;
                case 3:
                 System.out.println("March\n");
                System.out.println("Chapion class of the month");
                
                System.out.println("Yoga=> $" + 15000);
                System.out.println("Box Fit=> $" + 30000);
                result=15000+30000;
                 System.out.println("Total Income=> $"+result);
                break;
                case 4:
                System.out.println("April\n");
                System.out.println("Chapion class of the month");
                
                System.out.println("Body Blitz=> $" + 40000);
                System.out.println("Zumba=> $" + 11000);
                result=40000+11000;
                 System.out.println("Total Income=> $"+result);
                break;
                case 5:
                System.out.println("May\n");
                System.out.println("Chapion class of the month");
                
                System.out.println("Yoga=> $" + 65000);
                System.out.println("Zumba=> $" + 21000);
                result=65000+21000;
                System.out.println("Total Income=> $"+result);
                break;
                case 6:
                 System.out.println("June\n");
                System.out.println("Chapion class of the month");
                
                System.out.println("Box Fit=> $" + 50000);
                System.out.println("Body Blitz=> $" + 110000);
                result=50000+110000;
                System.out.println("Total Income=> $"+result);
                break;
                case 7:
               System.out.println("July\n");
                System.out.println("Chapion class of the month");
                
                System.out.println("Aquacise=> $" + 6000);
                System.out.println("Zumba=> $" + 11000);
                result=6000+11000;
                System.out.println("Total Income=> $"+result);
                break;
                case 8:
               System.out.println("August\n");
                System.out.println("Chapion class of the month");
                
                System.out.println("Yoga=> $" + 5000);
                System.out.println("Aquacise=> $" + 45000);
                result=5000+45000;
                System.out.println("Total Income=> $"+result);
                break;
                case 9:
                System.out.println("September\n");
                System.out.println("Chapion class of the month");
                
                System.out.println("Box Fit=> $" + 9000);
                System.out.println("Zumba=> $" + 21000);
                result=9000+21000;
                 System.out.println("Total Income=> $"+result);
                break;
                case 10:
                System.out.println("October\n");
                System.out.println("Chapion class of the month");
                
                System.out.println("Yoga=> $" + 5000);
                System.out.println("Body Blitz=> $" + 11000);
                result=5000+11000;
                System.out.println("Total=>"+result);
                break;
                case 11:
                System.out.println("November\n");
                System.out.println("Chapion class of the month");
                
                System.out.println("Zumba=> $" + 10000);
                System.out.println("Box Fit=> $" + 20000);
                result=10000+20000;
                System.out.println("Total Income=> $"+result);
                break;
                case 12:
               System.out.println("December\n");
                System.out.println("Chapion class of the month");
                
                System.out.println("Yoga=> $" + 5000);
                System.out.println("Zumba=> $" + 11000);
                result=5000+11000;
                System.out.println("Total Income=> $"+result);
                break;
            default:
                System.out.println("Good evening.");
                break;
        }
    }
}