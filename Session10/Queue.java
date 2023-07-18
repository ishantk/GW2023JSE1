// FIFO -> First In First out

public class Queue {
	
	Patient head;
	Patient tail;
	int size;
	
	
	Queue(){
//		head = null;
//		tail = null;
//		size = 0;
	}
	
	void enqueue(Patient patient) {
		
		size++;
		
		if(head == null) {
			head = patient;
			tail = patient;
		}else {
			patient.previous = tail;
			tail.next = patient;
			tail = patient;
		}
	}
	
	void dequeue() {
		if(size !=0 ) {
			size--;
			head = head.next;
		}else {
			System.err.println("QUEUE EMPTY...");
		}
	}
	
	void iterate() {
		
		if(head != null) {
			Patient temp = head;
			while(true) {
				temp.show();
				temp = temp.next;				
				if(temp == null) {
					break;
				}
			}
		}else {
			System.err.println("QUEUE EMPTY. NOTHING TO PRINT..");
		}
	}
}
