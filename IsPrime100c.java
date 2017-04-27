//Demonstrates calling IsPrimec



public class IsPrime100c{



	public static void main(String[] args)throws Exception{

Integer testnumber;

	IsPrimec testPrime = new IsPrimec();	

		

for(testnumber=1;testnumber<101; testnumber++){



	testPrime.inputNumber = testnumber;

	

	testPrime.isPrime();

		

}	   

}}
