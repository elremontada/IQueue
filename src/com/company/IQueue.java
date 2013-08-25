package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: elkoyot
 * Date: 24.08.13
 * Time: 23:08
 * To change this template use File | Settings | File Templates.
 */
public interface IQueue<T> {
    public void setElement(T el);
    public T getElement();
    public void show();
}
