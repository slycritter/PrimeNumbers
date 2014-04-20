package prime;
import javax.swing.JOptionPane;// display window import

public class PrimeAlg 
{
	public PrimeAlg()
	{
		NumericValidation m = new NumericValidation();// calling the class 
		String message = "Please enter a number";
		String word = "number ";
		String numbers = "The Prime Numbers are \n";
		int numOfPrime;// user input how many primes 
		final int line = 10;// final amount on line
		int count = 0;// setting count to 0
		int num = 2;
		boolean prime;// used to check if its a prime true false
		
		numOfPrime = Integer.parseInt(m.validUnsignedInt(message, word));
//		while(count <= numOfPrime)
//		{
			
			for (int see = numOfPrime; see > 2; see--)
			{
				prime = true;// if true forget the for loop
				for(int div = 2; div < see; div++)//this for loop finds the primes
				{
//System.out.println(prime + "\t"  + see + "\t" + div);
					if(see % div == 0)
					{
						prime = false;// if prime is false
						break;// breaking the if loop
					}
				}//end for(div) loop
//System.out.println("#33  " + prime + "\t" + see);
				//count = 0;
				if(prime)// if the number is prime display it
				{
//System.out.println("#37  " + see);					
					count++;
					if(count % line == 0)//this is used to display the primes
					{
						System.out.println(see);
						numbers += see + "\n";
					}
					else
					{
						System.out.print(see + " ");
						numbers += see + ", ";
					}
				}//end if(prime)
			}//end for(see) loop
			
			numbers += " 2";
			System.out.println(" 2");

		//displaying all the primes
		JOptionPane.showMessageDialog(null, numbers ,"Prime Numbers", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
