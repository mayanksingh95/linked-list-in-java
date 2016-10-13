package interviewprograms;


public class linkedlist {
	private Node header;
	private Node lastnode;
	private int size;
	
	public linkedlist(){
		header =new Node(null);  //creating dummy node which has reference to first node
		lastnode=header;
	}
	
	
	public void prepand(Integer data){
		Node n= new Node(data);
		if(size==0) //no element in our linked list 
		{header.next=n;
		lastnode=n;
		size++;}
		else
		{Node temp=header.next;
		header.next=n;
		n.next=temp; //temp is a value 
		size++;
		}
	}
	
	public void append(Integer data){
		Node n=new Node(data);
		if(size==0) //no element in our linked list 
		{header.next=n;
		lastnode=n;
		size++;}
		else{
			lastnode.next=n;
			lastnode=n;
			size++;
		}
	 }
	
	public void removefirst(){
		if(size!=0){
		header.next=header.next.next; //gives us second node in the linked list
		size--;
		}
	}
	
	public void removelast(){
		if(size==1){
			header.next=null;
			lastnode=header; //reference to dummy node
			size--;
		}
		else if(size!=0){
			Node n=header.next;
			int count=1;
			while(count!=size-1){
			n=n.next;
				count++;
			}
			lastnode=n; 
			lastnode.next=null;
			size--;
		}
	
	}
	public void insertAt(int index,Integer data){
		if(index<=0 || index>size){ //important hai
			return;
		}
		else if(index==1)
			prepand(data);//if user enters the index of first node
		else if (index==size)
			append(data);//if user enters the index of last node
		else{
			Node n=new Node(data);
			Node x=header.next; //reference to first node;
			int count=1;
		    while(count!=index-1){
		    	x=x.next;
		    	count++;
		    }
		   Node temp=x.next; //storing before referencing to new node
		 
		   x.next=n;
		    n.next=temp;
		    size++;
		}
	}
	
	
	
	public void removeAt(int index){
		if(index<=0 || index>size){ //important hai
			return;
		}
		else if(index==1)
			removefirst();
		else if (index==size)
			removelast();
		else{
			Node n=header.next;
			int count=1;
			while(count!=index-1){
				n=n.next;
				count++;
			}
			n.next=n.next.next;
			size--;
		}
	}
	
	public int getsize(){
		return size;
	}
	
	public String tostring(){
		Node n=header.next;
		String temp="";
		while(n!=null){
		temp=temp+n.data+" ";
			n=n.next;
		}
		return temp;
	}
	
}
