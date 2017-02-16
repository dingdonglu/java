package hw4;

public class Assignment4 {
	
	public static void main(String[] arge) {

		Stack stack = new Stack(1);
		Queue queue = new Queue(1);
		
		for(int i=2;i<=20;i++) {
			stack.insert(i);
			queue.insert(i);
		}//insert numbers to the list.
		
		System.out.print("The Stack list : ");
		stack.print();
		System.out.println();

		stack.cleanAll();
		//clean all number and Node from Stack list
	
		System.out.print("The Queue list : ");
		queue.print();
		System.out.println();
		
		queue.cleanAll();
		//clean all number and Node from Queue list

	}

}
