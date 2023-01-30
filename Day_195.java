//Illustration of Encapsulation
class Day_195
{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public static void main(String args[])
    {
        Day_195 s=new Day_195();
        
        s.setName("Vijay");
        System.out.println(s.getName());
    }
}