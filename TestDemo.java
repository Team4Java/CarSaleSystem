import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner kb = new Scanner(System.in);
		System.out.print("Input name of item 1: ");
		String n1 = kb.nextLine();
		System.out.print("Input price of item 1: ");
		double p1 = kb.nextDouble();
		System.out.print("Input quantity of item 1: ");
		int q1 = kb.nextInt();
		kb.nextLine();



		// second item
		System.out.print("Input name of item 2: ");

		String n2 = kb.nextLine();
		System.out.print("Input price of item 2: ");
		double p2 = kb.nextDouble();
		System.out.print("Input quantity of item 2: ");
		int q2 = kb.nextInt(); // HERE, dude
	}

}
