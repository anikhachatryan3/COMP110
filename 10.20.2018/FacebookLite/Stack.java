public class Stack {
    private int count = 0;
    private int size;
    private int top; //master index for our array
    private String[] stack;
    
    public Stack(int size) {
       
        this.size = size;
        stack = new String[size];
        top = -1;
       
    }
   
    public int getSize() {
        return size;
    }
   
    public boolean isEmpty() {
        return (top == -1);
    }
   
    public boolean isFull() {
        return (top == size - 1);
    }
   
    public void push(String item) {
       
        if(isFull()) {
           
            Util.print("The stack is full");
           
        }
        else {
            top++;
            stack[top] = item;
            count++;
           
        }
       
    }
   
    public String pop() {
        if(isEmpty()) {

            Util.print("The stack is empty");
            return "";
           
        }
        else {
            count--;
            top--;
            return stack[top];
           
        }
       
    }
   
    public void reset() {
       
        for(int i = 0; i < getSize(); i++) {
           
            stack[i] = "";
           
        }
        top = -1;
        count = 0;
       
    }
   
    public void print() {
       
        int i = 0;
        while(i < count) {
           
            Util.print(stack[i]);
            i++;
           
        }
       
    }
   
   public String[] getAllFriends() {
      return stack;
   }
   
   public String[] getAllPosts() {
      return stack;
   }
   
}
