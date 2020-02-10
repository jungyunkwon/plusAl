package Chp04;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) throws InterruptedException {
		int num = 5;
		Scanner sc = new Scanner(System.in);
		Scanner stdIn=new Scanner(System.in);
		int menu = 9;
		Object o;
		Gstack<Object> sample = new Gstack<Object>(num);

		while (menu != 0) {
			sample.size();
			System.out.println("(1)push (2)pop (3)dump (4)indexof");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("push할 값 : ");
				o=stdIn.nextLine();
				sample.push(o);
				
				break;
			case 2:
				sample.pop();
				
				break;
			case 3:
				sample.dump();
				break;
			case 4:
				System.out.println("검색할 값 : ");
				o=stdIn.nextLine();
				System.out.println(sample.indexOf(o));
			}
		}
	}
}
