//Implementation of Constructor Overloading
class Day_190
{
    int id,passout_year;
    String name,Contact_No,College_Name;
    
    Day_190(String Contact_No,String College_Name,int passout_year)
    {
        //this keyword is used to invoke other constructor of same class
        this.Contact_No=Contact_No;
        this.College_Name=College_Name;
        this.passout_year=passout_year;
    }
    //Two contructors with different parameters each performs a different tasks
    Day_190(int id,String name)
    {
        this("9097644568","BIT Mesra",2024);
        this.id=id;
        this.name=name;
    }
    public static void main(String args[])
    {
        //object s is created with parameters 
        Day_190 s=new Day_190(29,"Mohit Raj");
        
        System.out.println("Printing Student Info");
        System.out.println(" Name "+s.name+" Contact No "+s.Contact_No+" College Name "+s.College_Name);
        
    }
}