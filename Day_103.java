//Basic Switch Case Program
import java.util.*;
class Day_103
{
    static double switchCase(int choice,double r){
        // code here
        double area=0;
        
        switch(choice)
        {
            case 1:
            //returns the area of circle
                area=3.14*r*r;
                break;
                case 2:
                    //for choice 2 returns the perimeter of circle
                    area=2*3.14*r;
                    break;
                    default:
                        System.out.println("Wrong Choice:");
        }
        return area;
    }
}