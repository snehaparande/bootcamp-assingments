package com.tw.step8.assignment5;

public interface Queryable {
    int getSizeOf(Color color);
    int getTotalSize();

    boolean isFull();

    boolean isPresent(Color color);
}
