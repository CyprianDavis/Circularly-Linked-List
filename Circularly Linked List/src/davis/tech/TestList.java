package davis.tech;

public class TestList {
	public static void main(String[]args) {
		CircularlyLinkedList<String> names = new CircularlyLinkedList<String>();
		names.addFirst("SSEREMBA");
		names.addLast("CYPRIAN ");
		names.addLast("DAVIS");
		names.addLast("TUSUUBIRA");
		names.addLast("ANNET");
		
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		names.rotate();
		System.out.println();
		System.out.println(names.getFirst());
		
		names.rotate();
		System.out.println();
		System.out.println(names.getFirst());
		
		names.rotate();
		System.out.println();
		System.out.println(names.getFirst());
		
		names.rotate();
		System.out.println();
		System.out.println(names.getFirst());
		
		
		names.rotate();
		System.out.println();
		System.out.println(names.getFirst());
		
	}
	

}
