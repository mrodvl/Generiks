package data_structures.lesson1;

public class MyStack <T> {

    private T[] data = (T[]) new Object[8];
    private int size = 0;

    public void push(T item){
        if(size == data.length){
            resize(data.length * 2);
        }
        data[size] = item;
        size++;
    }

    private void resize(int newSize) {
        /**
         * 1. new array[newSize]
         * 2. copy from old to new
         * 3. data = new array
         */
        T[] newArray = (T[]) new Object[newSize];
        for (int i = 0; i < data.length; i++) {
            newArray[i] = data[i];

        }
        data = newArray;
    }

    public T pop(){
        /**
         * 1. data[last_index] save
         * 2. size --
         * 3. if size <= 1/4 data.length -> resize(data.length / 2)
         * 4. return
         */
        return null;
    }
    public T peek(){
        /**
         * 1. return data[last_index]
         */
        return null;
    }
    public boolean isEmpty(){
        return size == 0;
    }
}
