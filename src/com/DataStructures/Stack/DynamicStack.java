package DataStructures.Stack;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(int value) throws StackException {
       if(isFull()){
           int[] temp = new int[stackArray.length * 2];
           System.arraycopy(stackArray, 0, temp, 0, stackArray.length);
           stackArray = temp;
       }
       super.push(value);
    }
}
