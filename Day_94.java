/*
 Program keeps a numbers from user and generates an integer between 1 and 7
and displays the name of the weekday
*/
import java.util.*;
class Day_94
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
           System.out.print("Input number:");
        int day=sc.nextInt();
        
        System.out.println(getDay(day));
     
    }
    public static String getDay(int day)
    {
        String dayName=" ";
        switch(day){
            case 1: dayName="Monday";
            break;
            case 2:
                dayName="Tuesday";
                break;
                case 3:
                    dayName="Wednesday";
                   break;
                    case 4:
                        dayName="Thursday";
                        break;
                        case 5:
                            dayName="Friday";
                         break;   
                         
                        case 6:
                            dayName="Saturday";
                         break;   
                         
                        case 7:
                            dayName="Sunday";
                         break;   
        }
        return dayName;
    }
}
/*
 Output
 
Input number: 3                                                                                               
Wednesday 
 */