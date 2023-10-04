import java.util.ArrayList;

public class Stack {
    public static void main(String[] args) {
      stk myStk = new stk();
      myStk.push(0);
      myStk.push(2);
      myStk.push(4);
      myStk.push(8);
      System.out.println(myStk.pop());
      System.out.println(myStk.pop());
      System.out.println(myStk.pop());
      System.out.println(myStk.pop()); 
  }
}


class stk{
  
  node head;

  class node{
    int data;
    node next;

    node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public void push(int data){
    node newNode = new node(data);
    if(head == null){
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public int pop(){
    if(head == null){
      return -1;
    }
    int data = head.data;
    head = head.next;
    return data; 
  }
}
