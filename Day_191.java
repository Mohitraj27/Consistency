//Illustration of Construction Chaining
//within the same class Using this() keyword
class Day_191
{
    //Below is the default constructor it will call another constructor
    //using this keyword from same class
    Day_191(){
        //this keyword will invoke to second constructor
        this(5);
        System.out.println("This is the Ilustration of Constructor Chaining");
        
    }
         //Below is the second constructor
          Day_191(int x)
         {
         //Below this  keyword will calls the third constructor
         this(5,15);
          System.out.println(x);
        
         }
                 //This is the Third constructor
                  Day_191(int x, int y)
                    {
          
                      System.out.println(x * y);
        
                       }
            
 public static void main(String args[]){
        //This will invokes the default constructor first
        new Day_191();
    }
}