package hw4;

class Queue extends LinkedList {
	
	public Queue() {
	}
	
	public Queue(int x) {
		super(x);
		count++;
	}

	public void insert(int x) {
		super.insert(x);
		count++;
	}
	 //insert

	public boolean delete(int x) {
		return super.delete(x);	
	}
	//delete
	
	public void print(Node n){
		super.print();
	}
	//print
	
	public void cleanAll() {
		Node current=head.getNext();
		while(current!=null) {
			System.out.println( count + " nodes in the list.");
			System.out.println("The first number is " + head.getData() +", which I will delete it.");
			System.out.println();
			current=current.getNext();
			count --;
			delete(head.getData());
			System.out.print("After deletion, the list : ");
			print(head);
			System.out.println();
			
		}
		System.out.println("There is only " + count + " nodes in the list.");
		System.out.println("The number is " + head.getData() +" which I will delete it.");
		delete(head.getData());
		count --;
		System.out.println("Now there is " + count + " Node in the Queue list." + "\n");
		
	}// First in First Out
	
	
}