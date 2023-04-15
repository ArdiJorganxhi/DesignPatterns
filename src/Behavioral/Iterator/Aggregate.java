package Behavioral.Iterator;

public interface Aggregate<T> {

    Iterator<T> createIterator();
}
