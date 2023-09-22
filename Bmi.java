package bmi;
import java.util.Scanner;
public class Bmi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int weight;
		System.out.print("weight");
		weight=input.nextInt();
		int height;
		System.out.print("height");
		height=input.nextInt();
		float bmi;
	
		bmi=weight/(height*height);
		System.out.println("bmi:"+bmi);
	}


	}


