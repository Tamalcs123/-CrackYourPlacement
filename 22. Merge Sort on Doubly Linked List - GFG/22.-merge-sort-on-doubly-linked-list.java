// { Driver Code Starts
import java.util.*;
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next, prev;
    Node(int key)
    {
        data = key;
        next = prev = null;
    }
}

class Driverclass
{
    public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int a1 = sc.nextInt();
	        Node head = new Node(a1);
	        Node temp = head;
	        
	        for (int i = 1;i < n;i++)
	        {
	            int a = sc.nextInt();
	            Node n1 = new Node(a);
	            n1.prev = temp;
	            temp.next = n1;
	            temp = n1;
	        }
	        
	        head = new LinkedList().sortDoubly(head);
	        printList(head);
	    }
	}
	public static void printList(Node node)
	{
	    Node temp = node;
	    while(node != null)
	    {
	        System.out.print(node.data + " ");
	        temp = node;
	        node = node.next;
	    }
	    System.out.println();
	    while(temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.prev;
	    }
	    System.out.println();
	}
}
// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class LinkedList
{
    //Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node head)
    {
        // add your code here
        if(head==null || head.next==null) return head;
        Node middle=getMiddle(head);
        head=sortDoubly(head);
        middle=sortDoubly(middle);
        return merge(head,middle);
    }
    static Node getMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=slow.next;
        slow.next=null;
        return temp;
    }
    static Node merge(Node h1,Node h2){
        if(h1==null){return h2;}
        if(h2==null){return h1;}
        if(h1.data<h2.data){
            h1.next=merge(h1.next,h2);
            h1.next.prev=h1;
            h1.prev=null;
            return h1;
        }
        else{
            h2.next=merge(h1,h2.next);
            h2.next.prev=h2;
            h2.prev=null;
            return h2;
        }
        
    }
    
}