//U10416018 陳宗佑
import java.util.Scanner;
import java.util.ArrayList;

public class TestRepeatAdditionQuiz{
	public static void main(String[] args){
	int num1 = (int)(Math.random() * 10);
	int num2 = (int)(Math.random() * 10);
	//Create a Scanner
	Scanner input = new Scanner(System.in);
		
	System.out.print("What is " + num1 + " * " + num2 + " ? ");
	int answer = input.nextInt();
	//Call class StoreAnswer
	StoreAnswer storeanswer = new StoreAnswer();
	
	//Loop for estimating
	while(num1 * num2 != answer){
		//Call method store
		storeanswer.store(answer);
		
		System.out.print("Wrong answer. Try again. What is "
		 + num1 + " * " + num2 + " ? ");
		 answer = input.nextInt();
		 
		//Call method determine 
		storeanswer.determine(answer);
	}
		System.out.println("Ypu got it.");
	}
}

class StoreAnswer{
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	//Method for store answer
	public void store(int answer){	
		list.add(answer);
	}
	
	//Method for determining and store answer
	public void determine(int answer){
		if (list.contains(answer)){
			System.out.println("You already enter " + answer);
		}
		else{
			list.add(answer);
		}
	}
}
