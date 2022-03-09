public class QueueClass
{
    Queue<Integer>q;
    QueueClass(){
        q=new LinkedList<>();
    }
    public void addElement(int key)
    {
      q.add(key);
    }
    public void RemoveElement()
    {
       if(q.size() == 0)
            System.out.print("-1"+" ");
        else
           System.out.print(q.remove()+" ");
    }
    public void peekElement()
    {
        if(q.size() == 0)
            System.out.print("-1"+" ");
        else
            System.out.print(q.peek()+" ");
    }
    public void Size()
    {
            System.out.print(q.size()+ " ");
    }
}