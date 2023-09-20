public interface Queue {
    void enqueue(int element);
    int dequeue();
    boolean isEmpty();
    int peek();
    int size();
}
