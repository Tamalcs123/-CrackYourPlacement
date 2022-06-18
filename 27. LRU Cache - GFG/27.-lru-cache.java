// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

  public class LRUDesign {

    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            int capacity = Integer.parseInt(read.readLine());
            int queries = Integer.parseInt(read.readLine());
            LRUCache cache = new LRUCache(capacity);
            String str[] = read.readLine().trim().split(" ");
            int len = str.length;
            int itr = 0;

            for (int i = 0; (i < queries) && (itr < len); i++) {
                String queryType = str[itr++];
                if (queryType.equals("SET")) {
                    int key = Integer.parseInt(str[itr++]);
                    int value = Integer.parseInt(str[itr++]);
                    cache.set(key, value);
                }
                if (queryType.equals("GET")) {
                    int key = Integer.parseInt(str[itr++]);
                    System.out.print(cache.get(key) + " ");
                }
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// design the class in the most optimal way

class LRUCache
{
    //Constructor for initializing the cache capacity with the given value.
      Node head=new Node(0,0),tail=new Node(0,0);
   Map<Integer,Node> hm=new HashMap<>();
   int capacity;
    LRUCache(int cap)
    {
        //code here
        capacity=cap;
        head.next=tail;
        tail.prev=head;
    }

    //Function to return value corresponding to the key.
       int get(int key)
    {
        // your code here
          if(hm.containsKey(key))
       {
        Node temp=hm.get(key);
        
        remove(temp);
        insert(temp);
        return temp.value;
       }
       else
       return -1;
    }

    //Function for storing key-value pair.
    void set(int key, int value)
    {
        // your code here
         if(hm.containsKey(key))
       remove(hm.get(key));
       
       if(hm.size()==capacity)
        remove(tail.prev);
        
        insert(new Node(key,value));
    }
    
    void insert(Node node){
        hm.put(node.key,node);
       Node headnext=head.next;
       head.next=node;
       node.prev=head;
       headnext.prev=node;
       node.next=headnext;
    }
   void remove(Node node){
        hm.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    class Node{
        Node prev,next;
        int key,value;
        Node(int _key,int _value){
            key=_key;
            value=_value;
        }
    }
}
