class StackUnderFlowException extends Exception
{
    public String toString()
    {
        return "Stack is under flow";
    }
}

class StackOverFlowException extends Exception
{
    public String toString()
    {
        return "Stack is over flow";
    }
}

class Stack
{
    private int top=-1;
    private int size;
    private int s[];

    public Stack (int sz)
    {
        size=sz;
        s=new int[sz];
    }
    public void push(int x) throws StackOverFlowException
    {
        if(top==size-1)
        {
            throw new StackOverFlowException();
        }
        top++;
        s[top]=x;
    }

    public int pop() throws StackOverFlowException
    {
        int x=-1;
        if(top==-1)
        {
            throw new StackOverFlowException();
        }
        s[top]=x;
        top--;
        return x;
    }
}
public class ChallangeQue {
    public static void main(String[] args)
    {
        Stack st=new Stack(5);
        try 
        {
            st.push(10);
            st.push(20);
            st.push(20);
            st.push(20);
            st.push(20);
            st.push(20);
        }
        catch(StackOverFlowException s)
        {
            System.out.println(s);
        }
        // catch (StackUnderFlowException s2)
        // {
        //     System.out.println(s2); 
        // }
    }
    
}
