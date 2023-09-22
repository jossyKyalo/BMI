package bmr;
import java.util.Scanner;
public class bmi {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int weight;
		System.out.print("Enter your weight:");
		weight=input.nextInt();
		float  height;
		System.out.print("Enter your height:");
		height=input.nextFloat();
		float bmi;
	
		bmi=weight/(height*height);
		System.out.println("bmi:"+bmi);
}

}
