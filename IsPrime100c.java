//Demonstrates calling IsPrimec

public class IsPrimec100c{

	public static void main(String[] args)throws Exception{
Integer testnumber;
	IsPrimec testPrime = new IsPrimec();	
		
for(testnumber=1;testnumber<101; testnumber++){

	testPrime.inputNumber = testnumber;
	
	testPrime.isPrime();
		
}	   
}}

