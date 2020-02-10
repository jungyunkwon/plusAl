package Chp04;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64); //최대 64를 push
		
		while(true) {
			System.out.println("현재 데이터 수 :"+s.size()+"/"
											  +s.capacity());
			System.out.println("(1) 푸시 (2)팝 (3)피크 " +
											  "(4)덤프 (5)indexOf (6)clear (7)capacity "
											+ "(8)size (9)isEmpty (10)isFull (0)종료 : ");
			int menu=stdIn.nextInt();
			if(menu==0)break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터 :");
				x=stdIn.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x=s.pop();
					System.out.println("팝한 데이터는 "+x+"입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3:
				try {
					x=s.peek();
					System.out.println("피크한 데이터는 "+x+"입니다.");
					
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				System.out.println("검색할 값 x :");
				x=stdIn.nextInt();
				System.out.println(s.indexOf(x));
				break;
			case 6:
				s.clear();
				System.out.println("스택을 비웠습니다.");
				break;
			case 8:
				System.out.printf("스택에 쌓여있는 데이터 수 :");
				System.out.print(s.size());
				System.out.println();
				break;
			case 9:
				if(s.isEmpty()) {
					System.out.println("스택이 비었습니다.");
				}
				else System.out.println("스택이 비어있지 않습니다.");
				break;
			case 10:
				if(s.isFull()) {
					System.out.println("스택이 가득 찼습니다.");
				}
				else System.out.println("스택이 가득 차지 않았습니다.");
				break;
			}
			
		}
	}
}
