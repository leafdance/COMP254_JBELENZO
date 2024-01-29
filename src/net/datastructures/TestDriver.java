package net.datastructures;

/*
 * 
 * Jasper Belenzo
 * 301329283
 * 
 */

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Exercise 1 - Concatenate two DoublyLinkedList");
        DoublyLinkedList<String> doublyLinkedListStringsOne = new DoublyLinkedList<>();
        doublyLinkedListStringsOne.addLast("First");
        doublyLinkedListStringsOne.addLast("Second");
        doublyLinkedListStringsOne.addLast("Third");
        doublyLinkedListStringsOne.addLast("Fourth");
        doublyLinkedListStringsOne.addLast("Fifth");
        System.out.println("First doublyLinkedListStringsOne -> " + doublyLinkedListStringsOne);
        
        DoublyLinkedList<String> doublyLinkedListStringsTwo = new DoublyLinkedList<>();
        doublyLinkedListStringsTwo.addLast("Seis");
        doublyLinkedListStringsTwo.addLast("Siete");
        doublyLinkedListStringsTwo.addLast("Ocho");
        doublyLinkedListStringsTwo.addLast("Nueve");
        doublyLinkedListStringsTwo.addLast("Diez");
        System.out.println("Second doublyLinkedListStringsTwo -> " + doublyLinkedListStringsTwo);

        doublyLinkedListStringsOne.concatenate(doublyLinkedListStringsTwo);
        System.out.println("Updated, concatenated doublyLinkedListStringsOne -> " + doublyLinkedListStringsOne + "\n");

        System.out.println("Exercise 2 - swapNodes for SinglyLinkedList");
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.addLast("One");
        singlyLinkedList.addLast("Two");
        singlyLinkedList.addLast("Three");
        singlyLinkedList.addLast("Four");
        singlyLinkedList.addLast("Five");
        singlyLinkedList.addLast("Six");
        System.out.println("singlyLinkedList BEFORE swapNodes(2,5) -> " + singlyLinkedList);
        singlyLinkedList.swapNodes(2,5);
        System.out.println("singlyLinkedList AFTER swapNodes(2,5) -> " + singlyLinkedList + "\n");

        System.out.println("Exercise 3 - clone CircularLinkedList");
        CircularlyLinkedList<String> circularlyLinkedList = new CircularlyLinkedList<>();
        circularlyLinkedList.addLast("One");
        circularlyLinkedList.addLast("Two");
        circularlyLinkedList.addLast("Three");
        circularlyLinkedList.addLast("Four");
        circularlyLinkedList.addLast("Five");
        circularlyLinkedList.addLast("Six");
        System.out.println("circularlyLinkedList BEFORE clone() --> " + circularlyLinkedList);
        CircularlyLinkedList<String> clonedCircularlyLinkedList = null;
        // try {
        	clonedCircularlyLinkedList = circularlyLinkedList.clone();
        /* } catch (CloneNotSupportedException cnse) {
        	cnse.printStackTrace();
        	System.out.println("CloneNotSupportedException occurred --> " + cnse.getMessage());
        } catch (Exception e) {
        	e.printStackTrace();
        	System.out.println("Exception occurred --> " + e.getMessage());
        }*/
        System.out.println("circularlyLinkedList AFTER clone() --> clonedCircularlyLinkedList --> " + clonedCircularlyLinkedList);
        System.out.println("Add \"Seven\" to circularlyLinkedList");
        circularlyLinkedList.addLast("Seven");
        System.out.println("circularlyLinkedList --> " + circularlyLinkedList);
        System.out.println("clonedCircularlyLinkedList --> " + clonedCircularlyLinkedList);

    } // main

} // TestDriver
