//Concepts of Objects and Class 
 class Day_181
{
    String breed;
    String size;
    int age;
    String color;
    
    
    
    public String getInfo()
    {
    return ("Breed is:"+breed+"Size is:"+size+"Age is:"+age+"color is:"+color);
        
    }
    
    //main method
    public static void main(String args[])
    {
        Day_181 maltese=new Day_181();
        maltese.breed="Maltese";
        maltese.size="small";
        maltese.age=2;
        maltese.color="white";
        
        System.out.println(maltese.getInfo());
    }
}