import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//for(int i = 2; i < 10; i++) {
			int[] result = Gugudan.caculate(num);
			Gugudan.print(result);
		//}
		
	}
}
