package newPackage;

public class linkedList<E> {
	private class Node <E>{
		E elem;
		Node<E> next, prev;
	}
	Node<E> tail = null;
	Node<E> head=null;
	Node<E> temp=null;
	private int counter =0;
	public linkedList(){}
	public int size(){return counter;}
	
	public void add(E elem){
		if(head == null){
			head = tail = new Node<E>();
			head.next = null;
			//head.prev=null;
			head.elem = elem;
			tail=head;
		}else{
			tail.next=new Node<E>();
			tail=tail.next;
			tail.elem=elem;
			
		}
		counter++;
	}
	public void add(int index, E elem){

		//use other add method if u wanna append at the last
		  if(index == size()){
			add(elem);
			return;
			}

		  else if(index == 0){
		     Node<E> temp = new Node<E>();
		     temp.elem = elem;
		     temp.next = head;
		     head.prev = temp;
		     head = temp;
		     counter++;
		     return; 
		  }
		  
		   temp = head;
		   for(int i = 0; i < index-1; i++) temp = temp.next; //move to the next node

		   Node<E> myNode = new Node<E>(); //create a new node
		   myNode.elem = elem;  //and set the elem
		   myNode.next = temp.next;  //set it to point to the next elem
		   temp.next = myNode;  //set the previous elem to point to it
		   counter++; //increment the count;

		}


	public E get(int index){
		   //forces the index to be valid
//		  assert (index >= 0 && index < size());

		  temp = head; //start at the head of the list
		  
		  //iterate to the correct node
		  for(int i = 0; i < index; i++) temp = temp.next; 
		  return temp.elem; //and return the corresponding element

		}

	public E remove(int index){
		   assert(index >= 0 && index < size()); //force valid index
		   temp = head; //start at the beginning of the list

		   if(index == 0){
		        E elem = head.elem;
		        head = head.next; 
		        counter--;
		        return elem;
		   }

		   else if(index == size()){
		        E elem = tail.elem;
		        tail = tail.prev;
		        counter--;
		        return elem;
		   }

		   //iterate to the position before the index
		   for(int i = 0; i < index-1; i++) temp = temp.next;
		   Node<E> two = temp.next;

		//set temp.next to point to the Node next to the Node to be removed
		   temp.next = two.next; 
		   E elem = two.elem; //store the element to return
		   two = null; //remove the node
		   counter--; //decrement size
		   return elem; //return the element at that position
		}

		public E remove(E elem){
		   temp = head; //start at the beginning of the list
		   Node<E> two = null;

		   if(head.elem.equals(elem)){
		       head = head.next;
		       head.prev = null;
		       counter--;
		       return elem;
		   }

		   else if(tail.elem.equals(elem)){
		       tail = tail.prev;
		       tail.next = null; 
		       counter--;
		       return elem;
		   }

		  //while the elem hasn't been found but there is another node
		   while(temp != null && !temp.elem.equals(elem)){
			  two = temp; //have a reference to the element before the one to remove
			  temp = temp.next; //in this method, temp will be the elem to remove
		   }

		//if the element wasn't found, return null
		   if(temp == null) return null;

		   two.next = temp.next;
		   E spare = temp.elem; //return element
		   temp = null;
		   counter--; //decrement size
		   return spare;  
		}
		private void print (){
			for (Node n = head; n !=null; n=n.next){
				System.out.println(n.elem.toString());
			}
		}
		public static void main(String[] args) {
			linkedList<Integer> ll = new linkedList<Integer>();

			for(int i = 0; i < 10; i++) {
				ll.add(i);
			}

			assert(ll.size() == 10);
			ll.print();


			Integer v = ll.remove(4);
			System.out.println("removed: " + v);
			ll.print();
			assert(ll.size() == 9);
		}


}


