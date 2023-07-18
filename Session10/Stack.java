// LIFO -> Last In First out
public class Stack {
	
	ScreenInterface head;
	ScreenInterface tail;
	int size;
	
	
	Stack(){
//		head = null;
//		tail = null;
//		size = 0;
	}
	
	void push(ScreenInterface screen) {
		
		size++;
		
		if(head == null) {
			head = screen;
			tail = screen;
		}else {
			screen.previous = tail;
			tail.next = screen;
			tail = screen;
		}
	}
	
	void pop() {
		if(size !=0 ) {
			size--;
			tail = tail.previous;
		}else {
			System.err.println("STACK EMPTY...");
		}
	}
	
	void iterate() {
		
		if(tail != null) {
			ScreenInterface temp = tail;
			while(true) {
				temp.show();
				temp = temp.previous;				
				if(temp == null) {
					break;
				}
			}
		}else {
			System.err.println("STACK EMPTY. NOTHING TO PRINT..");
		}
	}
	
}
