package Chp04;

import java.util.Scanner;

public class Q3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num;
		num = 10;
		Q3_IntStack Stack = new Q3_IntStack(num);

	
		
		while (true) {

			System.out.println("(A)A스택 (B)B스택 (C)스택 데이터 보기 (0)종료  ");
			String input = sc.next();
			
			if(input.equals("0")) {
				break;
			}
			
			switch (input) {
			case "A":
				System.out.println("A스택 선택");
				Astack(Stack);
				break;
			case "B":
				System.out.println("B스택 선택");
				Bstack(Stack);
				break;
			case "C":
				System.out.println("스택 데이터 보기");
				Stack.Adump();
				Stack.Bdump();
				break;
				
				
			}

		}

	}

	private static void Bstack(Q3_IntStack s) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("(1) 푸시 (2)팝 (3)피크 " +
				  "(4)덤프 (0)종료 : ");
			int menu=sc.nextInt();
			if( menu==0) break;
			int x;
			
			switch(menu) {
			case 1:
				System.out.print("데이터 :");
				x=sc.nextInt();
				try {
					s.Bpush(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x=s.Bpop();
					System.out.println("팝한 데이터는 "+x+"입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3:
				try {
					x=s.Bpeek();
					System.out.println("피크한 데이터는 "+x+"입니다.");
					
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				s.Bdump();
				break;
			}
		}
		
	}

	private static void Astack(Q3_IntStack s) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("(1) 푸시 (2)팝 (3)피크 " +
				  "(4)덤프 (0)종료 : ");
			int menu=sc.nextInt();
			int x;
			if( menu==0) break;
			switch(menu) {
			case 1:
				System.out.print("데이터 :");
				x=sc.nextInt();
				try {
					s.Apush(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x=s.Apop();
					System.out.println("팝한 데이터는 "+x+"입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3:
				try {
					x=s.Apeek();
					System.out.println("피크한 데이터는 "+x+"입니다.");
					
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				s.Adump();
				break;
			}
		}
	}

	
}
