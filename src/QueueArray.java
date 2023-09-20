public class QueueArray implements Queue{

    private final int DEFAULT_CAPACITY = 5;
    private int[] storageArray;

    private int headIndex = 0;
    private int infiniteTailPointer = 0;

    private int preferredSize = 0;
    public QueueArray(){
        this.storageArray = new int[DEFAULT_CAPACITY];
        preferredSize = DEFAULT_CAPACITY;
    }
    public QueueArray(int arraySize){
        this.storageArray = new int[arraySize];
        preferredSize = arraySize;
    }
    public void grow() {
        int newSize = storageArray.length + (storageArray.length >> 1);
        int[] newArray = new int[newSize];
        for(int i = 0; i < storageArray.length; i++){
            newArray[i] = storageArray[i];
        }
        storageArray = newArray;
    }
    @Override
    public void enqueue(int element) {
         storageArray[infiniteTailPointer] = element;
         infiniteTailPointer++;
         if(infiniteTailPointer == storageArray.length ){ //nilapas ko sa prefferedSize
             grow();
         }
         if(infiniteTailPointer - 1>= preferredSize && size() > preferredSize){
             headIndex++;
        }
    }


    @Override
    public int dequeue() {
        headIndex++;
        if(isEmpty()){
            return 0;
        }
        return storageArray[headIndex - 1];
    }

    @Override
    public boolean isEmpty() {
        return infiniteTailPointer - headIndex == 0;
    }

    @Override
    public int peek() {
        return storageArray[headIndex];
    }

    @Override
    public int size() {
        return (infiniteTailPointer - headIndex);
    }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        if (isEmpty()) {
            return stringBuilder.append("").append("]").toString();
        } else {
            for (int i = 0; i < size() - 1; i++) {
                stringBuilder.append(storageArray[i + headIndex]).append(",");
            }
            stringBuilder.append(storageArray[size() - 1 + headIndex]).append("]");
//        for (int i = 0; i < size(); i++){
//            System.out.print(storageArray[i+ headIndex ]);
//        }
            return stringBuilder.toString();
        }
    }

}
