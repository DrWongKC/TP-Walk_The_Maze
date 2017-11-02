package walkthemaze;

/**
 *
 * @author sllau
 */
public class Stack {

        private int top;		//index
        private Object[] items;         //use array to store data in stack
        private int count;
        
        public Stack(int s)
        {
            items = new Object[s];      //create stack using fixed size array
            top = -1;
            count = 0;
        }


        public boolean push(Object x)
        {
            // Is the stack full?
            if (count == items.length)
            {
                return false;
            }
            else
            {
                top++;               //move pointer up by 1
                items[top] = x;      //store item into array location
                count++;
                return true;
            }
        }

        public Object pop()
        {
            Object result = null;
            if (count == 0)              // If the stack is empty
            {
                return null;
            }
            else
            {

                result = items[top];  // remove the top element from the stack
                top--;                 //move pointer down by 1
                count--;
                return result;        //return value of the item popped
            }
        }

        public Object peek()
        {
            if (count == 0)             // If the stack is empty
            {
                return null;
            }
            else
            {
                // only return a copy of the top item
                return items[top];
            }
        }

        public boolean isEmpty()
        {
            if (count == 0)         // If the stack is empty
            {
                return true;     //confirmed empty
            }
            else
            {
                return false;    //stack not empty
            }
        }
        public int size()
        {
            return count;          
        }

}
