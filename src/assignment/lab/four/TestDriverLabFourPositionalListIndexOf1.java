package assignment.lab.four;

import net.datastructures.LinkedPositionalList;
import net.datastructures.Position;
import net.datastructures.PositionalList;
import net.datastructures.LinkedPositionalList.Node;

/*
 *  
 *  Jasper Belenzo
 *  301329283
 *  
 */

public class TestDriverLabFourPositionalListIndexOf1 {
	
	public static void main(String[] args) {
		
		// indexOf(Position<E> p) that accepts Position p
		System.out.println("indexOf(Position<E> p) that accepts Position p");
		PositionalList<String> positionalList = new LinkedPositionalList<String>();
		positionalList.addLast("X");
		positionalList.addLast("Y");
		positionalList.addLast("Z");
		positionalList.addFirst("W");
		System.out.println("positionalList.size() --> " + positionalList.size());
		for (Position<String> position : positionalList.positions()) {
		    System.out.println("  position.getElement() --> " + position.getElement());
		}
		System.out.println("");
		Node<String> p1 = new Node("A", (Node)positionalList.first(), (Node)positionalList.last());
		System.out.println("positionalList.indexOf(\"A\") --> " + positionalList.indexOf(p1) + "\n");
		
		Node<String> p2 = new Node("Z", (Node)positionalList.first(), (Node)positionalList.last());
		System.out.println("positionalList.indexOf(\"Z\") --> " + positionalList.indexOf(p2) + "\n");
		
		Node<String> p3 = new Node("W", (Node)positionalList.first(), (Node)positionalList.last());
		System.out.println("positionalList.indexOf(\"W\") --> " + positionalList.indexOf(p3) + "\n");
		
		// indexOf(E e) that accepts E p
		System.out.println("indexOf(E e) that accepts E p");
		PositionalList<Integer> positionalList2 = new LinkedPositionalList<Integer>();
		positionalList2.addLast(30);
		positionalList2.addLast(40);
		positionalList2.addLast(50);
		positionalList2.addFirst(20);
		positionalList2.addFirst(10);
		System.out.println("positionalList.size() --> " + positionalList2.size());
		for (Position<Integer> position : positionalList2.positions()) {
		    System.out.println("  position.getElement() --> " + position.getElement());
		}
		System.out.println("");
		System.out.println("positionalList.indexOf(\"99\") --> " + positionalList2.indexOf(99) + "\n");
		System.out.println("positionalList.indexOf(\"50\") --> " + positionalList2.indexOf(50) + "\n");
		System.out.println("positionalList.indexOf(\"10\") --> " + positionalList2.indexOf(10) + "\n");
		
	}

}
