package com.company.Task13_2;

public class MyArray<T> {
    private final int DEFAULT_SIZE=10;
    private int size;
    private T[] array;

    public MyArray() {
        this.size = 0;
        this.array = (T[]) new Object[DEFAULT_SIZE];
    }

    public MyArray(int capacity) {
        if (capacity==0){
            throw new IllegalArgumentException("capacity not equals 0 !!!");
        }
        this.array = (T[]) new Object[capacity];
        this.size=0;
    }

    public void remove(T element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            array[--size] = null;
        }
    }


    public void add(T element) {
        if (size == array.length) {
            resizeArray();
        }
        array[size] = element;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range.");
        }
        return array[index];
    }


    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    private void resizeArray() {
        int newCapacity = array.length * 2;
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public int arraySize() {
        return array.length;
    }
}
