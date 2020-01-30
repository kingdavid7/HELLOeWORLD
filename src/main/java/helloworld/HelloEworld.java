package helloworld;

import java.util.Scanner;

public class HelloEworld {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);

		System.out.println("Enter your nickname or a landom name");
		String Name = input.nextLine();
		
		System.out.println("Enter your preference eWorld? if you do not know what eWorld is? Type Help to get a Hint");

		String eWorld = input.next().toLowerCase();


		String needHelp = "";

		while (eWorld.toLowerCase().equals("help")) {

			needHelp = "Earth, Star, galaxy,Universe, Not my world";

			System.out.println(needHelp);

			eWorld = input.next();
	
		System.out.println(" Now you know what eWorld means,please enter  one of them to see the link assocaite to: Earth,Star,Garaxy,Not my world ");	 
		String myChoice = input.next().toLowerCase();

	}// code to be continued....see you soon ON eWORLD.
	}
}
