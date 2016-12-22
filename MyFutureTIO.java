
import TerminalIO.*;

public class MyFutureTIO
{
KeyboardReader reader = new KeyboardReader();
ScreenWriter writer = new ScreenWriter();

public void run()
{
// global instance variables
char keepdepositing='N';
double deposit, rate, balance=0 , withdrawals=0, interest=0, withdrawalyears=0, finalbalance=0, counter=0;
int age, years=0, continuedyears=0;

// Initial inputs to be able to determine when the loan matures
writer.print("Amount deposited per month: ");
deposit = reader.readDouble();
writer.print("Your age: ");
age = reader.readInt();
writer.print("Interest rate: ");
rate = reader.readDouble();

deposit = deposit*12;     // This is the yearly deposit amount
rate = rate/100;          // To convert the rate to a decimal

if (age >=60){      // This if statement is used when the age is over 60 years
years = 0;
for (int i = 0; i < years; i++)
{   
balance = (balance + deposit) * (1 + rate);
if (counter % 10==0)
rate = rate + 0.01;
counter++;
}
writer.print("As you are 60 or older, your account is at maturity\n");
writer.print("Your account has a $" + balance +", but you can choose to deposit money from this point onwards\n");
writer.print("Would you like to start depositing?\n");
keepdepositing = reader.readChar();          
if (keepdepositing == 'N'){  //the user doesn't want to open an account
writer.print("As you don't want to start depositing and your account has a $0 balance no account has been opened\n");
}
else if (keepdepositing == 'Y'){   //the user wants to start depositing into the account
writer.print("How many years would you like to deposit for? ");
continuedyears = reader.readInt();
for (int i = 0; i < continuedyears; i++)
{   
balance = (balance + deposit) * (1 + rate);
}
writer.print("Your balance at this time will be: $" + balance);
interest = (balance*rate)/12;
writer.print("Your account will earn $" + interest + " per month in interest after this point\n");
writer.print("How much would you like to withdraw per month? ");
withdrawals = reader.readDouble();
writer.print("How many years would you like to withdraw for? ");
withdrawalyears = reader.readDouble();
for (int i = 0; i < withdrawalyears; i++) // do i need the counter here?
{
finalbalance = (balance - withdrawals*12)*(1 + rate);
}
writer.print("After this time your account will have a balance of: $" + finalbalance + "\n");
}
} 
