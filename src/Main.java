public class Main {
    public static void main(String[] args) {
    QueueArray queue = new QueueArray(2);
    queue.enqueue(5); // 0
        queue.enqueue(6); // 1
        queue.enqueue(7); //2
        queue.enqueue(8); //3
        queue.enqueue(9); //4
        queue.dequeue();
        queue.dequeue();
        System.out.println("Queue is Empty: " + queue.isEmpty());
        System.out.println("size: " + queue.size());
        System.out.println(queue);


//        queue.enqueue(9); //4 [5, 6, 7 ,8 ,9]
//        queue.enqueue(10); // 5 [ 6, 7 ,8 ,9, 10]
//        queue.dequeue();           // [ 7 ,8 ,9, 10]
//        queue.enqueue(11); // [ 7 ,8 ,9, 10 , 11 ]
//        queue.enqueue(12);  // [8 ,9, 10 , 11, 12]
//        queue.dequeue();
//        queue.enqueue(13);// [9, 10 , 11, 12, 13]
//        queue.enqueue(14); //  [10 , 11, 12, 13, 14]
//        queue.enqueue(15); // [ 11, 12, 13, 14 , 15 ]
//        queue.dequeue();





    }
}