package com.mnnu.cache;

import java.util.concurrent.atomic.AtomicInteger;

public class Client2010 {
    public static void main(String[] args) {
        Visitor v1, v2;
        v1 = Visitor.getVisitor();
        v2 = Visitor.getVisitor();
        int n = v2.getNum();
        System.out.println("总访问人数: " + n);
    }
}

class Visitor {
    private static final Visitor visitor = new Visitor();
    private static final AtomicInteger num = new AtomicInteger(0);

    private Visitor() {

    }

    public static synchronized Visitor getVisitor() {
        num.addAndGet(1);
        System.out.println("欢迎用户光临本站");
        return visitor;
    }

    public int getNum() {
        return num.intValue();
    }
}
