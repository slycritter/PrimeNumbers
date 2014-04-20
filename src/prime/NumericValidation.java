package prime;

import javax.swing.JOptionPane;// display window import

public class NumericValidation
{

	public NumericValidation()// constructor
	{
		// TODO Auto-generated constructor stub
	}

	public String validUnsignedInt(String msg, String word)// unsigned int
	{
		String temp;// a temperary string
		String message = msg;// allows you to pass the message string
		boolean goodInt;// making sure its a good int not a word
		
		do// do while loop for bad input
		{
			goodInt = true;// if true dont continue
			
			temp = JOptionPane.showInputDialog(message);
			//displaying message to input and storing it in temp string 
			if(temp == null || temp.length() == 0)
				temp = "x";
			
			if (!allNumbers(temp))// the if statement checks the inputed number  
			{//making sure it is not a word
				message = "you have entered a bad value for ";//using message string
				message += word + "\n";// using message string and word string
				message += "you must enter only digits\n\n";
				goodInt = false;//making good int false 
			}
	
		}while(!goodInt);// starting the loop over again if goodInt is not true

		return temp;
}
	
	public String validInt(String msg, String word)// if the int is good
	{
		String temp;//temperary string
		String t = "";
		char c[];// char array 
		int begin;
		String message = msg;// passing the msg string
		boolean goodInt;// useing a boolean to check an input
		
		do// do while loop to check for bad input
		{
			goodInt = true;// if true break
			begin = 0;
			t = "";
			
			temp = JOptionPane.showInputDialog(message);// asking user input
			if(temp == null || temp.length() == 0)// checking user input
				temp = "x";
			
			c = temp.toCharArray();//char array
			if ('+' == c[0] || '-' == c[0])// checking array
				begin = 1;
				System.out.println("c = " + c);		
			for(int n = begin; n < c.length; n++)// 
				t += c[n];
			
			if('+' == c[0])
				temp = t;
				System.out.println("t = " + t);		
			if (!allNumbers(t))// displying bad input and asking for new one
			{
				message = "you have entered a bad value for ";
				message += word + "\n";
				message += "you must enter only digits\n\n";
				goodInt = false;
			}
	
		}while(!goodInt);// starting the do loop over if input is stipp bad

		return temp;
}
	
	public String validDouble(String msg, String word)// useing the msg and word strings
	{
		String temp;
		String t = "";
		char c[];// char array
		int begin;
		String message = msg;
		boolean goodDouble;
		
		do// do while loop checking for good double input
		{
			goodDouble = true; // if true break
			begin = 0;
			t = "";
			
			temp = JOptionPane.showInputDialog(message);// asking for the double
			if(temp == null || temp.length() == 0)//if loop setting temp to x if no input 
				temp = "x";//setting temp to x
			
			c = temp.toCharArray();// putting input into array c
			if ('+' == c[0] || '-' == c[0])// if loop checking for sign
				begin = 1;
			
			boolean dp = false;// making dp false
			
			for(int n = begin; n < c.length; n++)//for loop to increment array
			{
				System.out.println("in valid double in for loop c[" + n + "] = " + c[n]);
				
				if('.' == c[n] && !dp)// adding the  decimal 
				{
					System.out.println("if is true");// System checking we are in the loop
					dp = true;// double is true
					continue;
				}
				
				t += c[n];
			}
			
			if('+' == c[0])// if loop checking for +
				temp = t;
			
			if (!allNumbers(t))// if statement used to check input
			{
				message = "you have entered a bad value for ";
				message += word + "\n";
				message += "you must enter only digits"
					+ " and up to one decimal point\n\n";
				goodDouble = false;// making it false
			}
	
		}while(!goodDouble);// redo loop if its not good

		return temp;
}

	private boolean allNumbers(String temp)// checking the inputed numbers
	{
		char c[] = temp.toCharArray();//calling the temp char array
		
		for(int n = 0; n < c.length; n++)// making sure the input is 0-9
		{
			if(c[n] > '9' || c[n] < '0')// checking to see if the number is 0-9
				return false;// return false if its not 0-9
		}
		return true;// if its good return a true
	}
}




