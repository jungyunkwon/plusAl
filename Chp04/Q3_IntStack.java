package Chp04;

import javax.management.RuntimeErrorException;

public class Q3_IntStack {

	private int max;
	private int Aptr;
	private int Bptr;
	private int[] stk;

	
	// 실행시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	// 생성자
	public Q3_IntStack(int capacity) {
		Aptr = 0;
		max = capacity;
		Bptr = max-1;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}

	}
	
	

	// 스택 A
	// 스택에 x를 푸시
	public int Apush(int x) throws OverflowIntStackException {
		if (Aptr >= max)
			throw new OverflowIntStackException();
		return stk[Aptr++] = x;
	}

	// 스택에서 데이터를 팝
	public int Apop() throws EmptyIntStackException {
		if (Aptr <= 0)
			throw new EmptyIntStackException();
		return stk[--Aptr];
	}

	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int Apeek() throws EmptyIntStackException {
		if (Aptr <= 0)
			throw new EmptyIntStackException();
		return stk[Aptr - 1];
	}

	// 스택안의 모든 데이터를 bottom->top 순서로 출력
	public void Adump() {
		if (Aptr <= 0) {
			System.out.println("스턱이 비어있습니다.");
		} else {
			for (int i = 0; i < Aptr; i++)
				System.out.print("Astk["+i+"]:"+stk[i] + " ");
			System.out.println();
		}
	}

	// 스택 B
	// 스택에 x를 푸시
	public int Bpush(int x) throws OverflowIntStackException {
		if (Bptr <= Aptr)
			throw new OverflowIntStackException();
		
		return stk[Bptr--] = x;
	}

	// 스택에서 데이터를 팝
	public int Bpop() throws EmptyIntStackException {
		if (Bptr >= max)
			throw new EmptyIntStackException();
		return stk[++Bptr];
	}

	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int Bpeek() throws EmptyIntStackException {
		if (Bptr >= max)
			throw new EmptyIntStackException();
		return stk[Bptr];
	}

	// 스택안의 모든 데이터를 bottom->top 순서로 출력
	public void Bdump() {
		System.out.println(Bptr);
		if (Bptr == max) {
			System.out.println("스택이 비어있습니다.");
		} else {
			for (int i = (max-1); i >Bptr; i--)
				System.out.print("Bstk["+i+"]:"+stk[i] + " ");
			System.out.println();
		}
	}
}
