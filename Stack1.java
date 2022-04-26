package application;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s= new Stack<String>();
		s.push("a");
		s.push("b");
		s.push("ac");
		s.push("ad");
		s.push("ae");
		System.out.print(s.size());
		s.pop();
		System.out.println();
		System.out.println(s.size());
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}