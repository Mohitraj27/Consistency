/* If else program
 Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then 
 using following rules print their place of service.
 if employee is female, then she will work only in urban areas.

 if employee is a male and age is in between 20 to 40 then he 
 may work in anywhere

 if employee is male and age is in between 40 t0 60 then he will 
 work in urban areas only.

 And any other input of age should print "ERROR".
*/
import java.util.*;
class Day_102
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Input your age :");
        int age=sc.nextInt();
        
        System.out.println("Enter your marital status: Y or N");
        char MS=sc.next().charAt(0);
        
        System.out.println("Input your Sex: M or F");
        char sex=sc.next().charAt(0);
        sc.close();
        if(sex== 'F')
        {
        System.out.println("you will work only urban areas:");
    }
       if(sex == 'M')
       { 
                   if((age>=20) && (age <=40))
                   {
        System.out.println("you may work in anywhere:");}
         
        else if((age>=40) && (age<=60))
        {
        System.out.println("He will work in urban areas only:");
    }
        else
        { 
            System.out.println("ERROR");
        }
    }
}}
/* Output 
 Input your age :
21
Enter your marital status: Y or N
N
Input your Sex: M or F
M
you may work in anywhere:
*/