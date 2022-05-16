
public class Week1_Lab_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		//create a variable to hold the quantity of available plane seats left on a flight
		int quantityPlaneSeats = 5;
		
		//create a variable to hold the cost of groceries at checkout
		double groceriesCost = 15.25;
		
		//create a variable to hold a person's middle initial
		char middleInitial = 'E';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = false;
		
		//create a variable to hold a customer's first name
		String firstName = "Eric";
		
		//create a variable to hold a street address
		String streetAdress = "Brooklyn New York";
		
		//print all variables to the console
		System.out.println(quantityPlaneSeats +","+ groceriesCost +","+ middleInitial +","+ isHotOutside +","+ firstName +","+ streetAdress );
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		quantityPlaneSeats = quantityPlaneSeats -= 2;
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		groceriesCost = groceriesCost += 2.15;
	    
	  //birth certificate was printed incorrectly, change the middle initial to something else
		 middleInitial = 'C';
	    
	  //the season has changed, update the hot outside variable to be opposite of what it was
		 isHotOutside =! isHotOutside;
		 
		 //print all variables to the console
	  		System.out.println(quantityPlaneSeats +","+ groceriesCost +","+ middleInitial +","+ isHotOutside +","+ firstName +","+ streetAdress );
	  		
	    
	  //create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
	    String fullName = firstName +" "+ middleInitial +" "+ "James";
	   
	    
	  //print a line to the console that introduces the customer and says they live at the address variable
	    System.out.println("The Customer"+" "+fullName +" "+ "Lives at the following adress:" +" "+streetAdress+".");

	 
	}

}
