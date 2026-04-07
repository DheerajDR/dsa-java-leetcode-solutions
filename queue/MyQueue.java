
class MyQueue {
    java.util.Stack<Integer> in=new java.util.Stack<>();
    java.util.Stack<Integer> out=new java.util.Stack<>();
    public void push(int x){in.push(x);}
    public int pop(){
        if(out.isEmpty()) while(!in.isEmpty()) out.push(in.pop());
        return out.pop();
    }
}
