//Concept of Abstract Class
abstract class Day_207{    
abstract int getRateOfInterest();    
}    
class SBI extends Day_207{    
int getRateOfInterest(){
    return 7;
}    
}    
class PNB extends Day_207{    
int getRateOfInterest()
{
    return 8;
}    
}    
    
class TestBank{    
public static void main(String args[]){    
Day_207 b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
}
}    