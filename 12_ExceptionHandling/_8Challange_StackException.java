class stackOverflow extends Exception {
    public String toString(){
        return "Stack is full";
    }   
}

class stackUnderflow extends Exception {
    public String toString(){
        return "Stack is empty";
    }   
}

class Stack{
    private int top=-1;
    private int s[];
    private int size;

    public Stack(int sz){
        size=sz;
        s=new int[sz];
    }
    
    public void push(int x) throws stackOverflow{
        if(top==size-1){
            throw new stackOverflow();
        }
        else{
            top++;
            s[top]=x;
        }
    }

    public int pop() throws stackUnderflow{
        int x=-1;
        if(top==-1){
            throw new stackUnderflow();
        }
        else{
            x=s[top];
            top--;
            return x;
        }
    }
    
}

public class _8Challange_StackException {
    public static void main(String[] args) {
        Stack st=new Stack(5);

        try {
            st.push(50);
            st.push(10);
            st.push(30);
            st.push(20);
            st.push(40);
            st.push(60);
        } 
        catch (stackOverflow e) {
            System.out.println(e);
        }

    }
}
