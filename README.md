STIA1113_Assignment

# STUDENT INFO

Name : ABRAHAM A/L RAVICHANDRAN

Matrix : 271376

INTRODUCTION

This assignment is making a car loan calculator to compute the amount of monthly repayment and principal , interest and balance loan repayment table, by year. Before doing coding we have to do pseudocode and flow chart to make easier our work. By using while loop ,I can limit the input by keep looping until the user enter the proper amount for calculate the monthly repayment .I just need to enter the car price , down payment amount , car loan period and loan interest rate , and we can get the monthly repayment,principal,interest and balance for a year.In assignment 2 I have to type the program with refer the pseudocode and flow chart.

# Pseuducode
Start

Declare 



  double A=0,B=0,D=0,total_interest,monthly_repayment,principal,interest,balance


int C=0,years=1


Input car price


Output enter the car price


Loop enter the car price if the car price less than RM30000


Input down payment 


Output enter the down payment	




Loop enter the down payment if the down payment less than equal to zero 
Input loan period 


Output enter the loan period


Loop enter the loan period if the loan period less than five or more than nine 


Input interest rate 


Output enter the interest rate


Loop enter the interest rate if the interest rate less than 0.03 or more than 0.07


Calculate the total interest = (car price - down payment) * interest rate * loan period


Calculate the total monthly repayment = ( car price - down payment + total interest ) / (loan period * 12)


Output monthly repayment


Loop depending on loan period 


	Calculate principal = monthly repayment *12*years 
	
	
	Calculate interest = total interest / loan period * years 
	
	
	Calculate balance = monthly repayment*12*(loan period-years)
	
	
	
Output years,principal,interest,balance


	Calculate years ++
End

# FLOWCHART
![flowchart assingment 1](https://user-images.githubusercontent.com/55254441/72142209-29c14400-33cf-11ea-91c5-9f099f1fbcb1.png)

# OUTPUT 
![Screenshot (5)](https://user-images.githubusercontent.com/55254441/72142067-e36be500-33ce-11ea-812c-7bf4e4586f03.png)

