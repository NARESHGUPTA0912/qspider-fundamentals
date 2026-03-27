package linkedList;

public class HouseBulbDriver {
	public static void main(String[] args) {
		House h1=new House();
		Bulb b1=new Bulb("Red");
		Bulb b2=new Bulb("Green");
		Bulb b3=new Bulb("Yellow");
		
		h1.head=b1;
		h1.head.next=b2;
		h1.head.next.next=b3;
		
		Bulb temp=h1.head;
		while(temp!=null) {
			System.out.print(temp.color+"->");
			temp=temp.next;
		}
		System.out.println("null");
		System.out.println("====Count Bulb=====");
		int count=0;
		Bulb temp1=h1.head;
		while(temp1!=null) {
			count++;
			temp1=temp1.next;
		}
		System.out.println("Total Number of Bulbs are: "+count);
		h1.head.next=h1.head.next.next;
		
		System.out.println("Now all the Bulbs are: ");
		Bulb temp2=h1.head;
		while(temp2!=null) {
			System.out.print(temp2.color+"->");
			temp2=temp2.next;
		}
		System.out.println("null");
	}

}
