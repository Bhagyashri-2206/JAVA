public interface pr4_1 {
    int size = 10;    
    void push(int item);  
    int pop();            
    void display();       
    boolean overflow();   
    boolean underflow();  
}
class IntegerStack implements Stack {
    private int top;    private int[] stack; 
    public IntegerStack() {
        stack = new int[size];
        top = -1;     }

    @Override
    public void push(int item) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + item);
        } else {
            stack[++top] = item;
            System.out.println(item + " pushed to stack.");
        }
    }

    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1;         } else {
            int poppedItem = stack[top--];
            System.out.println(poppedItem + " popped from stack.");
            return poppedItem;
        }
    }

    @Override
    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean overflow() {
        return top == size - 1;     }

    @Override
    public boolean underflow() {
        return top == -1;     }
}
public class Test {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
        for (int i = 0; i < 8; i++) {
            stack.push(i * 10); 
        }
        stack.push(999);
        for (int i = 0; i < 10; i++) {
            stack.pop(); 
        }
        stack.pop(); 
    }
}
