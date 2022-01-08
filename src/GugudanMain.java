import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
	    System.out.println("출력할 단을 입력하세요 ex)2,8");
	    Scanner scanner = new Scanner(System.in);
	    String inputValue = scanner.nextLine();
	    
	   String[] splitedValue = inputValue.split(",");//두개의 입력값을 받음
	   
	   int first = Integer.parseInt(splitedValue[0]);
	   int second = Integer.parseInt(splitedValue[1]);
	   
	    
	    for(int j=2; j<=first; j++) {
		   for(int i=1; i<=second; i++) {
		    System.out.println(j*i);
		   }
	   }
	}
}
