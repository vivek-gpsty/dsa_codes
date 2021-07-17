import java.util.*;
class Stack
{
	static int s[],top=-1,n;
	static Scanner sc=new Scanner(System.in);
	static void push()
	{
		if(top==n-1)
			System.out.println("Stack is full");
		
		else
		{
			top++;
			System.out.println("enter an element to push");
			s[top]=sc.nextInt();
		}
	}
	static void pop()
	{
		if(top==-1)
			System.out.println("Stack is empty");
		else
		{
			System.out.println(s[top]+" is popped out");
			top--;
		}
	}
	static void display()
	{
		if(top==-1)
			System.out.println("Stack is empty");
		else
		{
				for(int i=top;i>=0;i--)
					System.out.println(s[i]);
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter Max size of stack");
		n=sc.nextInt();
		s=new int[n];
		int ch;
		while(true)
		{
		System.out.println("Enter choice \n 1.Push \n 2. Pop\n 3. Display \n 4. Exit ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: push();
					break;
			case 2: pop();
					break;
			case 3: display();
					break;
			case 4:System.exit(0);
					break;
			default: System.out.println("Invalid choice");
					break;
		}
	}
}
}
			