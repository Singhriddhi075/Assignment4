package assignment4;

import java.util.Stack;

public class nextgreaterelement {
	 public static void main(String[] args) {
	        int[] arr = { 2, 1, 3, 8, 6, 7, 5 };
	        Stack<Integer> stack = new Stack<>(); // generic function
	        for (int i = 0; i < arr.length; i++) {
	            while (!stack.isEmpty() && arr[i] > stack.peek()) {
	                int rv = stack.pop();
	                System.out.println(rv + "->" + arr[i]);
	            }
	            stack.push(i);  // Corrected this line
	        }
	        while (!stack.isEmpty()) {
	            int rv = stack.pop();
	            System.out.println(rv + "->" + "-1");
	        }
	    }
}
