import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
	    System.out.println("����� ���� �Է��ϼ��� ex)2,8");
	    Scanner scanner = new Scanner(System.in);
	    String inputValue = scanner.nextLine();
	    
	   String[] splitedValue = inputValue.split(",");//�ΰ��� �Է°��� ����
	   
	   int first = Integer.parseInt(splitedValue[0]);
	   int second = Integer.parseInt(splitedValue[1]);
	   
	    
	    for(int j=2; j<=first; j++) {
		   for(int i=1; i<=second; i++) {
		    System.out.println(j*i);
		   }
	   }
	}
}
