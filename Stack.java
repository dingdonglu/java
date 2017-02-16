package hw4;

class Stack extends LinkedList {
	
	public Stack() {
	}
	
	public Stack(int x) {
		super(x);
		count++;
	}
	
	public void insert(int x){
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
			Node last=head.getNext();
			while(last.getNext()!=null) {
				last=last.getNext();
			}
			System.out.println(count + " nodes in the list." );
			System.out.println("The last number in the list is " + last.getData() +", which I will delete.");
			System.out.println();
			count --;
			delete(last.getData());
			current=head.getNext();
			System.out.print("After deletion, the list: ");
			print(head);
			System.out.println();
		}
		
		System.out.println("There is only " + count + " nodes in the list."); 
		System.out.println("The only number is " + head.getData() +" which I will delete it.");
		delete(head.getData());
		count--;
		System.out.println("Now there is " + count + " Node in the Stack list." + "\n");
	
	} //Last in First out.
	
	
}