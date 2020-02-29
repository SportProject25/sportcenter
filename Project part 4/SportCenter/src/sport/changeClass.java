package sport;

import java.util.ArrayList;
import java.util.Scanner;
import static sport.sportClass.op;


public final class changeClass implements sportInterface {

    
Scanner sc =new Scanner(System.in);
//declare varible 
String timings;
String categoryOption;
static changeClass ch;
String time;
int price;

//declare constuctor 
    public changeClass(){
     
        System.out.println("Choose Your Day:\nsaturday\nsunday\n\nAnd\nChoose Type of Exercise:\nyoga"
                + "\nzumba\naquacise\nboxfit\nbodyblitz\n");
        timings=sc.nextLine();
        categoryOption=sc.nextLine();
	if (timings.equalsIgnoreCase("Saturday") && categoryOption.equals("yoga") 
                || categoryOption.equals("zumba")|| categoryOption.equals("aquacise")|| categoryOption.equals("boxfit")||categoryOption.equals("bodyblitz")) {
                saturday();
} else if (timings.equalsIgnoreCase("Sunday") && categoryOption.equals("yoga") 
                || categoryOption.equals("zumba")|| categoryOption.equals("aquacise")|| categoryOption.equals("boxfit")||categoryOption.equals("bodyblitz")) {
               sunday();
} else {
  System.out.println("Choose Properly");
}
        
   }
@Override
    public void saturday (){
    
        System.out.println("\nTime Schedule\na.Morning=>8:30am-10:30am\nb.Afternoon=>3:00pm-5:00pm\nc.Evening=>7:00pm-9:00pm\n");
      
        String weekday;
        
        weekday=sc.nextLine();
        switch (weekday) {
         case "a":
           price=500;
           time="Morning 8:30am-10:30am";
            System.out.println("Day=>"+" "+timings+"\n"+"Category=>"+" "+categoryOption+"\nTime=>"+" "+time+"\n"+"Price=>"+" "+price);
            System.out.println("Changed");
            another();
            
           break;
        
         case "b":
          price=400;
          time="Afternoon 3:00pm-5:00pm";
            System.out.println("Day=>"+" "+timings+"\n"+"Category=>"+" "+categoryOption+"\nTime=>"+" "+time+"\n"+"Price=>"+" "+price);
            System.out.println("Changed");
            another();
           break;
             
	 
         case "c":
             price=800;
           time="Evening 7:00pm-9:30pm";
             System.out.println("Day=>"+" "+timings+"\n"+"Category=>"+" "+categoryOption+"\nTime=>"+" "+time+"\n"+"Price=>"+" "+price);
            System.out.println("Changed");
            another();
          break;
        default: 
           System.out.println("Chosse Properly");
           break;
      }
    } 
//override method 
@Override
        public void sunday(){
    
        System.out.println("Schedule\n\na.Morning\nb.Afternoon\nc.Evening\n");
        
        String weekday;
       
        weekday=sc.nextLine();
         switch (weekday) {
         case "a":
           price=600;
           time="Morning 9:00am-11:00am";
            System.out.println("Day=>"+" "+timings+"\n"+"Category=>"+" "+categoryOption+"\nTime=>"+" "+time+"\n"+"Price=>"+" "+price);
            System.out.println("Changed");
            another();
            
           break;
        
         case "b":
          price=500;
          time="Afternoon 3:00pm-5:00pm";
              System.out.println("Day=>"+" "+timings+"\n"+"Category=>"+" "+categoryOption+"\nTime=>"+" "+time+"\n"+"Price=>"+" "+price);
            System.out.println("Changed");
            another();
           break;
             
	 
         case "c":
               price=1000;
           time="Evening 6:00pm-8:00pm";
             System.out.println("Day=>"+" "+timings+"\n"+"Category=>"+" "+categoryOption+"\nTime=>"+" "+time+"\n"+"Price=>"+" "+price);
            System.out.println("Changed");
            another();
          break;
        default: 
           System.out.println("Chosse Properly");
           break;
      }
        
        
    }
      
        public void another(){
        System.out.println("You want to book Anather class"); 
         String choose;
         choose=sc.nextLine();
        switch(choose){
            case "y":
                op=new sportClass();
                break;
              case "n":
                
        
        
        
        }
        }
 
  public void list(){  
  ArrayList<String> al=new ArrayList<>();  
  al.add("Day=>"+" "+timings);
  al.add("Category=>"+" "+categoryOption);
  al.add("Class Time"+" "+time);
  al.add("Price=>"+" "+price);
  System.out.println("Show The previous Booking Rcecipt\n");
   
    //Traversing list through for-each loop
    al.forEach((obj) -> {
    System.out.println(obj+"\n");  
    });
 }  
    
    
    
    }
    
    
    
    
    

