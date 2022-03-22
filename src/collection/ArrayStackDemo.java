package collection;

import java.util.Arrays;
import java.util.EmptyStackException;

class ArrayStack {
	private Object a[];
	private int top; // stack top

	public ArrayStack(int n) // constructor
	{
		a = new Object[n]; // create stack array
		top = -1; // no items in the stack
	}

	public void push(Object item) // add an item on top of stack
	{
		if (top == a.length - 1)
			resize();
		a[++top] = item;
	}
  public void resize(){
		a = Arrays.copyOf(a,a.length*2);
  }
	public Object pop()
	{
		if (isEmpty())
			throw new EmptyStackException();
	return a[top--];
	}

	public Object peek()
	{
		if (isEmpty())
			throw new EmptyStackException();
		return a[top];
	}

	public boolean isEmpty(){
		return top == -1;
	}

	public int size()
	{
		return top + 1;
	}
}

public class ArrayStackDemo {
	public static void main(String[] args) {
		ArrayStack stk = new ArrayStack(4); // create stack of size 4
		Object item;
		stk.push('A'); // push 3 items onto stack
		item = stk.pop(); // delete item
		System.out.println(item + " is deleted");
		stk.push('B');
		stk.push('C');
		stk.push('D');

		System.out.println("size(): " + stk.size());
		stk.push('D'); // add three more items to the stack
		stk.push('E');
		System.out.println(stk.pop() + " is deleted");
		stk.push('G'); // push one item
		item = stk.peek(); // get top item from the stack
		System.out.println(item + " is on top of stack");
		System.out.println("Size of the Stack : " + stk.size());
		ArrayStack stk1 = new ArrayStack(4);
		stk1.push("Java");
		stk1.push(20);
		stk1.push(30);
	}

}
