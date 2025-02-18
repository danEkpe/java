// Stack Interface
interface Stack<T> {
    void push(T item) throws StackOverflowException;
    T pop() throws StackUnderflowException;
    T peek() throws StackUnderflowException;
    boolean isEmpty();
    boolean isFull();
    int size();
}

// StackOverflowException Class
class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

// StackUnderflowException Class
class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}

// ArrayStack Implementation
class ArrayStack<T> implements Stack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    @Override
    public void push(T item) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack is full. Cannot push item: " + item);
        }
        stack[++top] = item;
    }

    @Override
    public T pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Cannot pop item.");
        }
        return stack[top--];
    }

    @Override
    public T peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Cannot peek item.");
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        try {
            Stack<Integer> stack = new ArrayStack<>(5);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println("Top item: " + stack.peek());
            System.out.println("Stack size: " + stack.size());
            System.out.println("Popped item: " + stack.pop());
            System.out.println("Stack size after pop: " + stack.size());
        } catch (StackOverflowException | StackUnderflowException e) {
            System.err.println(e.getMessage());
        }
    }
}
