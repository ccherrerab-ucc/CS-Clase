/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concretecollection;

import java.util.List;

/**
 *
 * @author User
 */
class ConcreteIterator<T> implements Iterator<T> {
    private final List<T> items;
    private int currentIndex = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < items.size();
    }

    @Override
    public T next() {
        return items.get(currentIndex++);
    }
}
