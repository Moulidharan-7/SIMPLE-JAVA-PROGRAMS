class linked_list{
    private node head;
    private node tail;
    private int size;

    linked_list(){
        this.size=0;
    }
    public void insertfirst(int val){
        node nd=new node(val);
        nd.next=head;
        head=nd;
        if(tail==null){
            tail=head;
        }

        size++;
    }
    public void insertlast(int val){
        
        if(tail==null){
            insertfirst(val);return;
        }
        node nd=new node(val);
        tail.next=nd;
        tail=nd;
        size++;
    }
    public void deletefirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;

    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"  ->");
            temp=temp.next;
        }
        System.out.print("End");
    }
    public void size(){

        System.out.println("Size :"+size);
    }
    public void isempty(){
        if(size==0){
            System.out.println("Linked List is NULL");
        }
        else{
            System.out.println("Not NULL");
        }
    }
    public node getvalue(int position){
        node temp=head;
        for(int i=0;i<position;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void deletelast(){
        if(size<=1){
            deletefirst(); 
        }
        node nd=getvalue(size-2);
        tail=nd;
        tail.next=null;
    }
    private class node{
        private int value;
        private node next;

        node(int value){
            this.value=value;
        }
        node (int value,node next){
            this.value=value;
            this.next=next;
        }
    }
}


public class LINKED_LIST {
    
    public static void main(String[] args){
        linked_list s = new linked_list();
        
        s.insertlast(1);
        s.insertlast(2);
        s.insertlast(3);
        s.insertlast(4);
        s.insertlast(5);
        s.display();
        s.insertfirst(-3);
        s.display();
        s.deletefirst();
        s.display();
        s.deletelast();
        s.display();
        s.isempty();
        s.size();
        s.getvalue(3);
    }
}