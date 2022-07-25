//ATM Machine for overall user ATM operation.

import java.util.*;
class Day_36
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your balance amount:");
        int balance=sc.nextInt();
        int withdraw,deposit;
        while(true)
        {
            System.out.println("Welcome to ATM Machine");
            System.out.println("Press 1 to withdraw amount");
            System.out.println("Press 2 to  Deposit amount");
            System.out.println("Press 3 to Check Balance");
            System.out.println("Press 4 for Exit");
            System.out.println("Choose the operation you want");
            
            int choice=sc.nextInt();
            switch(choice){
             case 1:
             System.out.println("Enter your withdrawal amount");
             withdraw=sc.nextInt();
             if(balance >=withdraw)
             {balance=balance-withdraw;
             System.out.println("Your transcation of "+ withdraw+ " is succesfull");
            }else{
             System.out.println("Insufficient Fund");
            }
            System.out.println("");
            break;
            case 2:
               System.out.print("Enter money to be deposited");
               deposit=sc.nextInt();
               balance=balance+deposit;
                System.out.print("Your Money has been successfully deposited");
            System.out.println("");
            break;
            case 3:
                System.out.println("Balance:"+balance);
              System.out.println("");
            break;
            case 4:
                System.exit(0);
            }
    }
}}
/*Enter your balance amount:
 * 50000
Welcome to ATM Machine
Press 1 to withdraw amount
Press 2 to  Deposit amount
Press 3 to Check Balance
Press 4 for Exit
Choose the operation you want
2
Enter money to be deposited500
Your Money has been successfully deposited
Welcome to ATM Machine
Press 1 to withdraw amount
Press 2 to  Deposit amount
Press 3 to Check Balance
Press 4 for Exit
Choose the operation you want
3
Balance:50500

Welcome to ATM Machine
Press 1 to withdraw amount
Press 2 to  Deposit amount
Press 3 to Check Balance
Press 4 for Exit
Choose the operation you want
1
Enter your withdrawal amount
10000
Your transcation of 10000 is succesfull

Welcome to ATM Machine
Press 1 to withdraw amount
Press 2 to  Deposit amount
Press 3 to Check Balance
Press 4 for Exit
Choose the operation you want
3
Balance:40500

Welcome to ATM Machine
Press 1 to withdraw amount
Press 2 to  Deposit amount
Press 3 to Check Balance
Press 4 for Exit
Choose the operation you want
4

 */