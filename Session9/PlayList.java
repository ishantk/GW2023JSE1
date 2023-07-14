
public class PlayList {

	Song head;
	Song tail;
	int size;
	
	PlayList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	void add(Song song) {
		
		size++;
		
		if(head == null) {
			head = song;
			tail = song;
		}else {
			song.previous = tail;
			tail.next = song;
			tail = song;
			
			// Circular
			head.previous = tail;
			tail.next = head;
		}
	}
	
	void iterate(boolean forward) {
		
		if(forward) {
			Song temp = head;
			while(true) {
				temp.show();
				temp = temp.next;
				
				if(temp == head) {
					break;
				}
			}
		}else {
			Song temp = tail;
			while(true) {
				temp.show();
				temp = temp.previous;
				
				if(temp == tail) {
					break;
				}
			}
		}
	}
	
	// remove any object
	void delete(String track) {
		
	}

	// add in front 
	void insert(Song song) {
		
	}
	
}
