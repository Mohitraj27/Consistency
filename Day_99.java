//BMI Calculator Program also tells whether you are underweight,obsese,overweight
import java.util.*;
class Day_99
{
    public static void main(String args[]) throws Exception
    {
        calculateBMI();
    }
    private static void calculateBMI() throws Exception{
        Scanner sc=new Scanner(System.in);
        float weight,height;
        System.out.println("Enter your weight in kg ");
        weight=sc.nextFloat();
        System.out.println("Enter your height  in cm");
        height=sc.nextFloat();
        //multilplcation by 100*100 for cm to m conversion
        float BMI = (100*100*weight) / (height * height);
         System.out.println("BMI value based on your  height and weight "+BMI);
         printBMICategory(BMI);
    }
    //PrintBMICategory
    private static void printBMICategory(float bmi)
    {
        if (bmi<18.5)
        {
            System.out.println("You are underweight:");
        }
        else if(bmi<25)
        {
            System.out.println("You are normal:");
        
        }
        else if(bmi<30)
        {
            System.out.println("You are overweight:");
            
        }
        else {
            System.out.println("You are obese");
        }
    }
}

/* Output 
 Enter your weight in kg 
90
Enter your height  in cm
150
BMI value based on your  height and weight 40.0
You are obese
 */