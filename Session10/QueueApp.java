
public class QueueApp {

	public static void main(String[] args) {
		
		Patient patient1 = new Patient("1. John", 20, 'M');
		Patient patient2 = new Patient("2. Fionna", 22, 'F');
		Patient patient3 = new Patient("3. Sia", 19, 'F');
		
		Queue queue = new Queue();
		
		queue.enqueue(patient1);
		queue.enqueue(patient2);
		queue.enqueue(patient3);
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		queue.enqueue(patient1); //-> Find the BUG and Fix It :)
		
		queue.iterate();
		

	}

}
