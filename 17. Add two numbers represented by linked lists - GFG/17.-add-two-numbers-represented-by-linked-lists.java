// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
     static Node reverseList(Node head)
    {
        // code here
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
       first=reverseList(first);
       second=reverseList(second);
        Node head=null;
        int sum=0,carry=0;
        
        while(first!=null || second!=null){
            if(first!=null && second!=null){
                sum=first.data+second.data+carry;
            }
            else if(first!=null){
                sum=first.data+carry;
            }
            else{
                sum=second.data+carry;
            }
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
            }
            else{
                carry=0;
            }
            Node newNode=new Node(sum);
            newNode.next=head;
            head=newNode;
            if(first!=null){
                first=first.next;
            }
            if(second!=null){
                second=second.next;
            }
        }
        if(carry!=0){
                Node new_Node=new Node(carry);
                new_Node.next=head;
                head=new_Node;
            }
        return head;
    }
}