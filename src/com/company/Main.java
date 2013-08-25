package com.company;
public class Main {


    public   static void main(String[] args)   {
        String[] str = new String[10];

        Queue<String> q = new Queue<String>(str);
        q.setElement("123");
        q.setElement("567");
        q.show();
        q.getElement();
        q.show();

    }
}
