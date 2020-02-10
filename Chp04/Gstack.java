package Chp04;

public class Gstack<E> {
	private int max;
	private int ptr;

	private E[] stk;

	@SuppressWarnings("unchecked")
	public Gstack(int capacity) {
		max = capacity;
		ptr = 0;
		stk = (E[]) new Object[max]; // casting to generictype
	}

	// 실행시 예외 : 스택이 비어있음
	@SuppressWarnings("serial")
	public static class EmptyGStackException extends RuntimeException {
		public EmptyGStackException() {
		}
	}

	@SuppressWarnings("serial")
	public static class OverflowGStackException extends RuntimeException {
		public OverflowGStackException() {
		}
	}

	public E push(E x) throws OverflowGStackException {
		if (ptr >= max) {
			throw new OverflowGStackException();
		}
		return stk[ptr++] = x;
	}

	public E pop() throws EmptyGStackException {
		if (ptr <= 0) {
			throw new EmptyGStackException();
		}
		return stk[--ptr] = null;

	}

	public void dump() throws EmptyGStackException {
		if (ptr <= 0) {
			throw new EmptyGStackException();
		}
		for (int i = 0; i < ptr; i++) {
			System.out.print(stk[i] + " ");
			System.out.println();
		}
	}

	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--) 
			if (stk[i].equals(x))
				return i;
		return -1;
	}

	public void size() {
		System.out.println("들어있는 데이터 수 :" + ptr);
	}
}
