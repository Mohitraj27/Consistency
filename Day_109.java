
//shuffle of elements in given arrayList using shuffle operation
import java.util.*;
class Day_109
{
    public static void main(String args[])
    {
        //Create a list and add colors in the list
        ArrayList<String> colorList=new ArrayList<String>();
        colorList.add("RED");
        colorList.add("YELLOW");
        colorList.add("ORANGE");
        colorList.add("BLUE");
        colorList.add("GREEN");
        colorList.add("VOILET");
        System.out.println("list before shuffling: "+colorList);
        
        Collections.shuffle(colorList);
        System.out.println(" List after shuffling :"+colorList);
        
        
        
        
}
}
/* Output:
list before shuffling: [RED, YELLOW, ORANGE, BLUE, GREEN, VOILET]
 List after shuffling :[RED, YELLOW, GREEN, ORANGE, BLUE, VOILET]
 */