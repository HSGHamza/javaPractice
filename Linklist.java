public class Linklist {
    public static void main(String[] args) {
        LL myll = new LL();
        myll.add(0);
        myll.add(1);
        myll.add(3);
        myll.printLL();
        System.out.print("\n");
        myll.printLL();
        System.out.println("\n" + myll.size);
        
    }
    
}

class LL{
    node head;
    int size = 0;
    class node{
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}

    public void addfirst(int data){
        size++;
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void add(int data){
        size++;
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }
    public void deleteFirst(){
        size--;
        if(head == null){
            return;
        }
        head = head.next;
    }
    public void delete(){
        size--;
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
        }
        node lastnode = head.next;
        node Slastnode = head;
        while(lastnode.next != null){
            lastnode = lastnode.next;
            Slastnode = Slastnode.next;
        }
        Slastnode.next = null;
    }

    public void printLL(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;       
        }
        System.out.print("null");
    }



















}
