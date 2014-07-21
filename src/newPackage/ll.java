package newPackage;

public class ll {
public class Node{
	Node next;
	int elem;
}
int count;
Node head = null;
Node temp = null;
Node curr=null;

ll(){
	head = null;
	temp = null;
	curr=head;
	count = 0;
	
}

void add(int element){
	if (head == null){
	 head= new Node();
	  head.elem=element;
	  head.next= null;
		
//		
//		temp = new Node();
//	  temp.elem= element;
//	  head  = temp;
//	  curr=head;
	  System.out.println("came in the if loop ");
	}
	else{
		
		//while(temp.next!=null) temp=temp.next;
		temp = new Node();
		temp.elem=element;
		temp.next = head.next;
		head.next=temp;
		
		System.out.println("came in the else loop");
	}
	count++;
	}

void print(){
	temp=head;
	while(temp.next!=null){
		System.out.println(temp.elem);
		temp=temp.next;
		
		
	}
	System.out.println(temp.elem);

}
public int size(){
	return count;
}
public void remove(int element){
	System.out.println("headelem"+head.elem);
	temp=head;
	while (temp.next!=null){
		System.out.println("temp.elem"+temp.elem);
		if (temp.next.elem==element){
			
			temp.next=temp.next.next;
		}
		temp=temp.next;
	}
}

public void removeDups(Linkedlist)
public static void main(String args[]){
	ll l1=new ll();
	l1.add(3);
	l1.add(5);
	l1.add(1);
	l1.print();
	System.out.println("size"+l1.size());
	l1.remove(3);
	l1.print();
}
	
}
