package LinkedInProjects;
import java.util.*;
import java.util.Random;
public class Game1 {
						//Designed And Coded By Ashu Patel//
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello Welcome Into Game");
		System.out.println("Desgined By Ashu Patel");
		System.out.println("Enter Your Name:");
		String name=sc.nextLine();
		System.out.println("Hello :"+name);
		//Initializing the object to number .
		int Sc= 0;
		int St=1;
		int P=2;
		int tg=5;
		int gp=0;
		int userc=0;
		int oppoc=0;
		System.out.println("-:INSTRUCTIONS FOR GAME:-");
		System.out.println("Press 0 for Sccisor ");
		System.out.println("Press 1 for Stone ");
		System.out.println("Press 2 for Paper ");
		while(gp<tg) {
		//Taking Input From User
		System.out.println("Enter Your Choice:");
		int ch=sc.nextInt();
		if(ch>2) {
			System.out.println("Invalid Choice Read Instruction Carefully");
		}
		if(ch==0) {
			System.out.println( name+" Has Chosen SCCISOR ");
		}
		else if (ch==1) {
			System.out.println(name+" Has Chosen STONE");
			
			
		}
		else {
		System.out.println(name+" Has Chosen PAPER");
		}
		//Generating Random Selection from Computer.
		Random r=new Random();
		int r1=r .nextInt(3);
		if(r1==0) {
			System.out.println("Opponent Has Chosen SCCISOR ");
			
		}
		else if (r1==1) {
			System.out.println("Opponent Has Chosen STONE");
			
		}
		else {
		System.out.println("Opponent Has Chosen PAPER");
		}
		//Now Comparing and Producing Result Of Game
		if(ch==r1) {
			System.out.println("OOPS its a TIE");
			userc++;
			
			
		}
		else if(ch==0 && r1==1){
			System.out.println("Opponent Won");
			oppoc++;
			
		}
		else if(ch==0 && r1==2){
			System.out.println("Congrats! "+name+" Won");
			userc++;
			
		}
		else if(ch==1 && r1==0) {
			System.out.println("Congrats! "+name+" Won");
			userc++;
			
		}
		else if(ch==1 && r1==2) {
			System.out.println("Opponent Won");
			oppoc++;
			
		}
		else if(ch==2 && r1==0) {
			System.out.println("Opponent Won");
			oppoc++;
			
		}
		else if(ch==2 && r1==1) {
			System.out.println("Congrats! "+name+" Won");
			userc++;
		}
		gp++;
		System.out.println("Game Played: "+gp);
		System.out.println("    ");
		
		
		
		
		

	}
	if(gp==tg) {
		if(userc==oppoc) {
			System.out.println("Game is Tied");
		}
		else if(userc>oppoc){
			System.out.println("Congratulation!!! "+name+" Won the Game");
		}
		else {
			System.out.println("Opponent Won the Game");
		}
		
	}
	}
	

}
