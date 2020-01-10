import java.util.Scanner;
public class Carloan
{public static void main (String [] args)

   { Scanner scan = new Scanner (System.in);
   
    double A=0,B=0,D=0,total_interest,monthly_repayment,principal,interest,balance;
    int C=0,years=1;
    
    while (A<30000)
    {System.out.print("Enter the car price: ");
    A = scan.nextDouble();}  
 
   while (B<=0)
   {System.out.print ("Enter the down payment: ");
   B = scan.nextDouble();}
   
   while (C<5 || C>9)
   {System.out.print ("Enter the loan period: ");
   C = scan.nextInt();}
   
   while (D<0.03 || D>0.07)
   {System.out.print ("Enter the interest rate: ");
   D = scan.nextDouble();}
   
   total_interest = (A - B)* D * C;
   monthly_repayment = (A - B + total_interest ) / (C * 12);
   
   System.out.printf("Monthly Repayment is RM%.2f ",monthly_repayment );
   
   System.out.print ("\nYears \t\t Principal \t\t Interest \t\t Balance \t ");
   
   while (years<=C)
   {principal = monthly_repayment * 12 * years;
   interest = total_interest/C * years;
   balance = monthly_repayment * 12 * (C - years);
   
   System.out.printf ("\n  %d \t\t\t %.2f \t\t %.2f \t\t %.2f\t", years,principal,interest,balance);
   years ++;}
   
  }
} 
