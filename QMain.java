public  class Main{
        public static void main(String[] args) {
        Queue qu = new Queue(8);
        qu.enQueue(10);
        qu.enQueue(33);
        qu.enQueue(28);
        qu.enQueue(43);
		
		qu.dispaly();

        System.out.println("Peek :"+qu.peek());

        qu.enQueue(11);
        qu.enQueue(27);

		qu.dispaly();
        System.out.println("Front element : " +qu.peek());

        qu.deQueue();

        System.out.print("Queue Element : ");
        qu.dispaly();
        System.out.println("");

        qu.enQueue(18);

        System.out.print("Queue Element : ");
        qu.dispaly();



    }
}