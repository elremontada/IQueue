package com.company;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: elkoyot
 * Date: 24.08.13
 * Time: 23:09
 * To change this template use File | Settings | File Templates.
 */
public class Queue<T> implements IQueue {
    private T[] mas;
     int maxIndex;
     int currentIndex;

    public Queue(T[] x) {
        mas = x;
        maxIndex = mas.length;
    }



    @Override
    public void setElement(Object el) {
        //System.out.println(Arrays.toString(this.mas));
        T[] result = Arrays.copyOf(this.mas, this.mas.length);
        System.out.println(Arrays.toString(result));
        result[currentIndex++] = (T)el;
        System.out.println(currentIndex);
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
