package walkthemaze;
import java.util.Random;
import java.util.Scanner;

public class WalkTheMaze {

    public static void main(String[] args) {
        
        // Create scanner object
        Scanner sc = new Scanner(System.in);
        
        // Create Stack object
        Stack theMaze = new Stack(10);
        
        // While loop through 10 times
        int i=0;
        while (i<10)
        {
            // Store random number from 1 to 10 into int X
            Random random = new Random();
            int x = random.nextInt(10)+1;
            
            // if random number is between 1 to 7, run this
            if (x<=7)
            {
                // do...while loop ensures the user enters either left or right.
                // do the following for as long as the flag stays true
                boolean flag=true;
                do {
                System.out.print("\nEnter your choice: ");
                String choice = sc.nextLine().toLowerCase();
                
                switch (choice) {
                    case ("left"):
                        System.out.println("Pushed " + choice + " to the Stack.");
                        theMaze.push(choice);
                        flag=false; // user's input made to stack, change flag to false to exit the loop
                        break;
                    case ("right"):
                        System.out.println("Pushed " + choice + " to the Stack.");
                        theMaze.push(choice);
                        flag=false; // usesar's input made to stack, change flag to false to exit the loop
                        break;
                    default:
                        System.out.println("Please enter again (right or left only).");
                        break;
                    }
                } while (flag);
            } else {
                theMaze.push("exit");
                System.out.println("\nPushed exit to the Stack.\nIt's over...\n");
                // Break out of loop
                i=10;
            }
            i++;
        }
        
        // Save the size of the stack
        int stackSize = theMaze.size()-1; // size of stack without "exit" element

        // Display all while emptying the stack
        for (int j=0; j<stackSize; j++)
        {
            // dispose the first element in the step. first element is "exit"
            if (j==0)
                theMaze.pop();
            
            System.out.println("I went " + theMaze.pop() + ".");
        }
    }
    
}
