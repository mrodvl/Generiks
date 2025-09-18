package data_structures.lesson3;

import java.util.NoSuchElementException;


public class MyQueue<T> {
    private int first = 0;
    private int last = -1;
    private int size = 0;
    private T[] array = (T[]) new Object[8];

    public void enqueue(T item) {
        if (size == array.length) {
            resize(array.length * 2);
        }
        last = (last + 1) % array.length;
        array[last] = item;
        size++;
    }

    private void resize(int newSize) {
        T[] newArray = (T[]) new Object[newSize];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[(first + i) % array.length];
            //формула вычисляет правильный индекс в старом массиве, чтобы извлечь элементы в порядке fifo

        }
        array = newArray;
        first = 0;
        last = size - 1;
    }


    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T value = array[first];
        array[first] = null;
        first = (first + 1) % array.length;
        size--;

        if (size > 0 && size <= array.length / 4 && array.length > 8) {
            resize(array.length / 2);
        }
            return value;

        }

        public T peek() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
            return array[first];
        }


        public boolean isEmpty () {
            return size == 0;
        }
    }

