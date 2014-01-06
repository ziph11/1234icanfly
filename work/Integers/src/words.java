import java.util.Scanner;
public class words {

	
	public static void main(String[] args) {
		System.out.println ("Does Izzy like pie?");
		String one;
		Scanner words = new Scanner (System.in);
	one = words.nextLine ();
	if  (one.equals ("yes")){
		System.out.println ("CORRECT");
	}
	else{
		System.out.println ("INCORRECT");
	}
	
	System.out.println ("What is Izzy's favorite animal?");
	String two;
	two = words.nextLine ();
	System.out.println ("CORRECT");
	System.out.println ("Does Izzy like candy?");
	String three;
	three = words.nextLine ();
	if (three.equals ("yes")){
		System.out.println ("Great job! You passed Quiz 1!");
	}
	else{
		System.out.println ("INCORRECT PLEASE TRY AGAIN");
	}
	
	
	}

}
