class linked__list{
    private node head;
    private node tail;
    private int size;

    linked_list(){
        this.size=0;
    }
    private class node{
        private int value;
        private node next;

        node(int value,node next){
            this.value=value;
            this.next=next;
        }
        node(int value){
            this.value=value;
        }
    }
}

public class main{
    public static void main(String[] args) {
        linked_list l1=new linked_list();
    }
}