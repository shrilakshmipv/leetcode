public class Node {
    String val;
    Node next;

    public Node(String val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    int cacheSize;
    HashMap<String, Node> cache = new HashMap<>();
    Node list= new Node(null, null);
    Node head;
    Node prev;
    
    public Solution(int size){
        this.cacheSize = size;
    }

    public String get(String key){
        Node res;
        if(cache.containsKey(key)) {
            res = cache.get(key);

            Node first = head;
            while(first.next != null){
                if(first.val == key) {
                    
                }
            }

            return res.val;
        }
    }
}