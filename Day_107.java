//Program using different concepts of Arraylist different operations
import java.util.ArrayList;
class Day_107
{
    public static void main(String args[])
    {
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        //list 1 is for different campus of BIT
        list1.add("BIT Mesra");
        list1.add("BIT Deoghar");
        list1.add("BIt Patna");
        
        //List 2 is for courses offereed
        list2.add("BTech");
        list2.add("BCA");
        list2.add("BBA");
        list2.add("Mtech");
        //list 3 is for year of establishment
        list3.add(1955);
        list3.add(2009);
        list3.add(2007);
        
        
        System.out.println("Intial ArrayList for BIT Campuses "+list1);
        System.out.println("Intial ArrayList for Courses Offered "+list2);
        System.out.println("Intial ArrayList for Established of Campus "+list3);
        
        
         //Updated List for BIT University
         list1.set(2,"BIT  Patna ");
         list1.add("BIT Noida");
         list1.add("BIT Allahabad");
         list1.add("BIT Muscat");
          System.out.println("Updated ArrayList for BIT Campus  "+list1);
         //used different operations of Array list
         
         list2.remove(1);
          list2.add("MBA");
          list2.set(0,"Bachelor of Technology");
          list2.set(1,"Bachelor of Computer Science");
          list2.set(2,"Bachelor of Bussiness Administration");
          list2.set(3,"Master of Technology");
          list2.add("B Pharma");
          list2.add("M Pharma");
          list2.add("MCA");
          list2.add("PGDBM");
         System.out.println("Updated ArrayList for Courses Offered  "+list2);           
          
   
   
           list3.remove(0);
          list3.remove(1);
          
       
        
        System.out.println("Updated ArrayList for BIT Establisted  "+list3);
        
    }
}