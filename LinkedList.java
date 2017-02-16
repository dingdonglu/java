package hw4;

public class LinkedList {
	
	protected Node head;
	protected int x;
	protected int count;

	
	public LinkedList() {	
	}
	
	public LinkedList(int x){
		head = new Node(x);
	}
	
	public LinkedList(Node n){
		head = n;
	}

	public void print(){
		Node current = head;
		while (current!=null){
			System.out.print(current.getData()+" ");
			current = current.getNext();
		}
	}
	
	public boolean delete(int x){
		if(head.getData()==x){
			head = head.getNext();
			return true;
		}
		Node current = head.getNext();
		Node previous = head;
		while (current!=null){
			if(current.getData() == x ){
				previous.setNext(current.getNext());
				return true;
			} else if(current.getData()<x){
				previous = current;
				current = current.getNext();
			} else {
				return false;
			}
		} // while
		return false;
	}
	
	public Node find(int x){
		Node current = head;
		while(current!=null){
			if(current.getData()==x){
				break;
			} else {
				current = current.getNext();
			}
		}
		return current;
	}
	
	public void prepend1(int x){
		Node temp = new Node(x);
		temp.setNext(head);
		head = temp;
	}
	public void prepend2(int x){
		head = new Node(x,head);
	}
	
	public void append(int x){
		Node current = head;
		while (current.getNext()!=null){
			current = current.getNext();
		}
		current.setNext(new Node(x));
	}
	
	public void insert(int x){
		if(x<=head.getData()){
			// case 1: insert at beginning of the list
			head = new Node(x, head);
		} else {
			Node previous = head;
			Node current = head;
			while(current!=null){
				if(current.getData()<x){
					previous = current;
					current = current.getNext();
				} else {
					// case 2: insert into middle of the list
					previous.setNext(new Node(x, current));
					break;
				}
			} 
			if(current==null){
				// case 3: insert at end of list
				previous.setNext(new Node(x));
			}
		}
	}
	
	public int getCount() {
		return count;
	}

}