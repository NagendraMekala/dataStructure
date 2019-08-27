package com.mng.stack;

public class Stack {
	int size;
	int[] stackArr;
	int top;

	public Stack(int size) {
		this.size = size;
		this.stackArr = new int[size];
		this.top = -1;
	}

	public void push(int entry) throws Exception {
		if (this.top == size - 1)
			throw new Exception("stack is alereday full, can't add element");
		System.out.println("Adding: " + entry);
		top = top + 1;
		this.stackArr[top] = entry;
	}
	
	public int pop() throws Exception {
		if(this.top == -1)
			throw new Exception("stack is alereday full, can't add element");   
		return this.stackArr[top--];
	}
	
	public int peek() {
		return this.stackArr[top];
	}
	
	public static void main(String args[]) {
		Stack stack = new Stack(5);
        try {
            stack.push(4);
            stack.push(8);
            stack.push(3);
            stack.push(6);
            stack.push(10);
            stack.pop();           
            System.out.println("peek eleemt: "+stack.peek());
           /* stack.push(34);
            stack.push(45);
            stack.push(78);*/
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
}
