public class Queue
{
    private Node front, rear;
    private int currentSize; //number of elements in list

    private class Node
    {
        int data;
        Node next;
    }

    //constructor
    public Queue()
    {
        front = null;
        rear = null;
        currentSize = 0;
    }

    public boolean isEmpty()
    {
        return (currentSize == 0);
    }

    //method for dequeuing
    public int dequeue(int i)
    {
        int data = front.data;
        front = front.next;

        if(isEmpty())
        {
            rear = null;
        }
        currentSize--;
        //System.out.println(data + " has been removed from the queue");
        return data;
    }

    //method for enqueue (add data to end)
    public void enqueue(int data)
    {
        Node oldEnd = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;

        if(isEmpty())
        {
            front = rear;
        }
        else
        {
            oldEnd.next = rear;
        }
        currentSize++;
        //System.out.println(data + " Has been added to queue");
    }
    public void printQueue() {
        //make node to start at
        Node current = front;

        //iterate through nodes
        while (current != null) //while current is not tail
        {
            System.out.println(current.data);
            current = current.next; //move to next one
        }
    }

}