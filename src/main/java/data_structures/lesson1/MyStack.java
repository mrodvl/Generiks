package data_structures.lesson1;

import java.util.NoSuchElementException;

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
        for (int i = 0; i < size; i++) {
            newArray[i] = data[i];

        }
        data = newArray;
    }

    /**
     * 1. data[last_index] save
     * 2. size --
     * 3. if size <= 1/4 data.length -> resize(data.length / 2)
     * 4. return
     */
    public T pop(){
        if (size == 0) {
            throw new NoSuchElementException();
        }
        T datum = data[size - 1];
        size--;
        if (size <= data.length /4 && data.length > 8){
            resize(data.length / 2);
        }
        return datum;
    }

    public T peek(){
        if (size == 0) {
            throw new NoSuchElementException();
        }
        /**
         * 1. return data[last_index]
         */
        return data[size - 1];
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
