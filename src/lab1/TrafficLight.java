package lab1;
import java.util.*;
public class TrafficLight {
	public static void main(String[] args) {
		String red="stop";
		String yellow="ready";
		String green="go";
		System.out.println("select any one of the ligth mentioned in the list");
		@SuppressWarnings("resource")
		Scanner s1=new Scanner(System.in);
		String color=s1.nextLine();
		switch(color){
		case"red":System.out.println(red);
				break;
		case"yellow":System.out.println(yellow);
		break;
		case"green":System.out.println(green);
		break;
		default:System.out.println("intput has to be traffic signal");
				
		}
	}

}
