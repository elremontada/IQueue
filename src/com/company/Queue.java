package com.company;

import java.util.Arrays;

public class Queue<T> implements IQueue<T> {
    private T[] mas;
     int maxIndex;
     int currentIndex;

    public Queue(T[] x) {
        mas = x;
        maxIndex = mas.length;
    }


    @Override
    public void setElement(T el) {
        T[] result = Arrays.copyOf(this.mas, this.mas.length);
        result[currentIndex++] = el;
        this.mas = result;
    }

    @Override
    public T getElement() {
        T el = this.mas[0];
        for(int i = 0; i < this.mas.length-1;i++){
            this.mas[i] = this.mas[i+1];
            if((i+1) == this.mas.length ){
                this.mas[i] = null;
            }
        }
        return el;
    }

    @Override
    public void show() {
        System.out.println(Arrays.toString(this.mas));
    }
}
