package assignment.lab.four;

//import java.util.Stack;
import net.datastructures.Stack;
import net.datastructures.ArrayStack;
import net.datastructures.LinkedStack;

/*
 *  
 *  Jasper Belenzo
 *  301329283
 *  
 */

public class TestDriverLabFourTransferStack2 {
	
    public static <E> void transfer(Stack<E> S, Stack<E> T){
        int n = S.size();                   // store the size of Stack S
        for(int x = 0; x < n; x++){
            T.push(S.pop());                // add the popped elements of Stack S onto Stack T
        }
    }

    public static void main(String[] args) {
       
        // Stack<Integer> S = new Stack<Integer>();
    	Stack arrayStackS = new ArrayStack();
        // Stack<Integer> T = new Stack<Integer>();
    	Stack<Integer> linkedStackT = new LinkedStack<Integer>();
 
        // Top of ArrayStack S is currently 12
        arrayStackS.push(2);
        arrayStackS.push(4);
        arrayStackS.push(6);
        arrayStackS.push(8);
        arrayStackS.push(10);
        arrayStackS.push(12);

        // Displaying the Stacks before using the transfer method
        System.out.println("Before Transfer: ");
        System.out.println("arrayStackS Stack: " + arrayStackS);
        System.out.println("linkedStackT Stack: " + linkedStackT);

        // Transfer elements of Stack S onto Stack T using the transfer method
        // transfer(S,T);
        
        // Transfer elements of Stack arrayStackS onto Stack linkedStackT using the transfer method
        transfer(arrayStackS, linkedStackT);

        // Displaying the Stacks after using the transfer method
        System.out.println("\nAfter Transfer: ");
        System.out.println("arrayStackS Stack: " + arrayStackS);
        System.out.println("linkedStackT Stack: " + linkedStackT);

    }

}
