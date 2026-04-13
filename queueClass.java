public class queueClass {

    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front =-1;

        Queue(int n){
            arr=new int[n];
            this.size=n;
        }

        public static boolean isEmpty() {
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }


        //add, enqueue
        public static void add (int data){
            if(rear == size-1){   //last index
                System.out.println("full queue");
                return;
            }
            //first element add
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //Dequeue, remove -- O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

            int result =arr[front];
            if(rear==front){  //delete from front
                rear=front-1;
            }else{
                front=(front+1) %size;
            }
            rear--;
            return result;

        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }

}
