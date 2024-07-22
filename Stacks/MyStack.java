package Stacks;

import java.util.Scanner;

import static java.lang.System.exit;

// Stack Using Array :

/*class MyStack {
int[] a;
int top;
int capacity;

    public MyStack(int capacity){
        this.capacity = capacity;
        top = -1;
        a = new int[capacity];
    }
         void push(int num){
            if(top == capacity - 1){
                System.out.println("Stack Overload !!");
            }
            else{
                a[++top] = num;
                System.out.println("Number Is Entered At Position "+top);
            }
        }

        int pop(){
            if(top == -1){
                return -1;
            }
            else{
                int num = a[top];
                top--;
                return num;
            }
        }
        int peek(){
            if(top == -1){
                System.out.println("Stack Underflow !!");
                return -1;
            }
            else{
                int num;
                num = a[top];
                return  num;
            }
        }

        boolean isEmpty(){
            return top == -1;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack st = new MyStack(5);

        int ch;
        System.out.println("1.Push()\n2.Pop()\n3.Peek()\n4.IsEmpty()\n5.Exit");




        do {
            System.out.println("Enter Your Choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter The Number In Stack : ");
                    int data = sc.nextInt();
                    st.push(data);
                    break;
                case 2:
                    int pop = st.pop();
                    System.out.println("Element " + pop + " Popped From The Stack ");
                    break;
                case 3:
                    int peek = st.peek();
                    System.out.println("Element at the top of the stack is : " + peek);
                    break;
                case 4:
                    if (st.isEmpty()) {
                        System.out.println("Stack Is Empty !!");
                    } else {
                        System.out.println("Stack Is Not Empty !!");
                    }
                    break;
                case 5:
                    exit(0);

            }
        }while(true);

    }

}
*/

//Stack Using LinkedList :

class MyStack{
    Node head;
    
    int size;

    public MyStack(){
        head = null;
        size = 0;
    }

    void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        size++;
        head = temp;
    }

    int peek(){
        if(head == null){
            return -1;
        }
        return head.data;
    }

    int pop(){
        if(head == null){
            return -1;
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    boolean isEmpty(){
        return head == null;
    }

    int size(){
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack st = new MyStack();

        int ch;
        System.out.println("1.Push()\n2.Pop()\n3.Peek()\n4.IsEmpty()\n5.Size\n6.Exit");

        do {
            System.out.println("Enter Your Choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter The Number In Stack : ");
                    int data = sc.nextInt();
                    st.push(data);
                    break;
                case 2:
                    int pop = st.pop();
                    System.out.println("Element " + pop + " Popped From The Stack ");
                    break;
                case 3:
                    int peek = st.peek();
                    System.out.println("Element at the top of the stack is : " + peek);
                    break;
                case 4:
                    if (st.isEmpty()) {
                        System.out.println("Stack Is Empty !!");
                    } else {
                        System.out.println("Stack Is Not Empty !!");
                    }
                    break;
                case 5:
                    System.out.println("Size Of The Stack Is : "+st.size());
                case 6:
                    exit(0);

            }
        }while(true);

    }
    static class Node{
        int data ;
        Node next ;
        Node(int x){
            data=x ;
            next=null ;
        }
    }
}

