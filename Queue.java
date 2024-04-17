public class Queue{
	private int [] queue;
	private int front;
	private int real;
	private int maxSize;
	
	
	public Queue(int size){
		maxSize =size;
		queue=new int[maxSize];
		front = 0;
		real = -1;
	}
	
	public boolean isEmpty(){
		return front == -1;
	}
	
	public boolean isFull(){
		return real ==maxSize -1;
	}
	
	public void enQueue(int element){
		if(!isFull()){
			queue [++real] =element;
		}
	}
	
	public int deQueue(){
		int data =queue[front];
		if(front == real){

			front =real =-1;

		}else{
			front++; 
		}
		return data;
		
	}

	public int peek(){
		return queue[front];
	}	

	public void dispaly(){
		for(int i =front;i<real;i++){
			System.out.println(queue[i] +" ");
		}
		System.out.println();
	}
}