package assignment.lab.four;

import net.datastructures.LinkedQueue;

public class TestDriverLabFourLinkedQueueConcatenate3 {
	
	public static void main(String[] args){
		
        // Two Queues, queueOne and queueTwo
        LinkedQueue<Integer> queueOne = new LinkedQueue<>();
        LinkedQueue<Integer> queueTwo = new LinkedQueue<>();

        // Populate queueOne
        queueOne.enqueue(11);
        queueOne.enqueue(22);
        queueOne.enqueue(33);
        queueOne.enqueue(44);
        queueOne.enqueue(55);
        
        // Populate queueTwo
        queueTwo.enqueue(66);
        queueTwo.enqueue(77);
        queueTwo.enqueue(88);
        queueTwo.enqueue(99);

        // Displaying BEFORE CONCATENATION
        System.out.println("BEFORE CONCATENATION in O(1) time");
        System.out.println("queueOne --> " + queueOne);
        System.out.println("queueTwo --> " + queueTwo + "\n");

        // CONCATENATE queueOne and queueTwo in O(1) time
        queueOne.concatenate(queueTwo);

        // Displaying AFTER CONCATENATION
        System.out.println("\nAFTER CONCATENATION in O(1) time");
        System.out.println("queueOne --> " + queueOne);
        System.out.println("queueTwo --> " + queueTwo + "\n\n\n");
        
        
        
        // Two Queues again, queueOne and queueTwo for O(n) time
        queueOne = new LinkedQueue<>();
        queueTwo = new LinkedQueue<>();

        // Populate queueOne
        queueOne.enqueue(11);
        queueOne.enqueue(22);
        queueOne.enqueue(33);
        queueOne.enqueue(44);
        queueOne.enqueue(55);
        
        // Populate queueTwo
        queueTwo.enqueue(66);
        queueTwo.enqueue(77);
        queueTwo.enqueue(88);
        queueTwo.enqueue(99);

        // Displaying BEFORE CONCATENATION
        System.out.println("BEFORE CONCATENATION in O(n) time");
        System.out.println("queueOne --> " + queueOne);
        System.out.println("queueTwo --> " + queueTwo + "\n");

        // CONCATENATE queueOne and queueTwo in O(n) time
        queueOne.concatenateOofN(queueTwo);

        // Displaying AFTER CONCATENATION
        System.out.println("\nAFTER CONCATENATION in O(n) time");
        System.out.println("queueOne --> " + queueOne);
        System.out.println("queueTwo --> " + queueTwo + "\n");
        
        

    }

}
