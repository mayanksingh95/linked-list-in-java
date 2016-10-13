package interviewprograms;

public class main {

	public static void main(String[] args) {
		linkedlist list=new linkedlist();
		list.prepand(1);
		list.prepand(2);
		list.prepand(3);
		list.prepand(4);
		System.out.println(list.tostring());
		
		list.append(5);
		list.append(6);
		list.append(7);
		list.append(8);
		System.out.println(list.tostring());
		
		
		list.removefirst();
		list.removefirst();
		System.out.println(list.tostring());
		
	
		list.removelast();
		list.removelast();
		System.out.println(list.tostring());
	
		list.insertAt(3, 100);
		list.insertAt(list.getsize(), 80);
		System.out.println(list.tostring());
		
		list.removeAt(2);
		list.removeAt(list.getsize());
		System.out.println(list.tostring());
		
	
	}

}
