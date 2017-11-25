package ru.nik66.practices.practice3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public interface GenericStorage<K, V> extends Iterable<GenericStorage.Node<K, V>> {

    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    class Node<K, V> {

        private K key;
        private V value;

    }

    boolean add(K key, V value);
    K add(V value);
    V get(K key);
    boolean delete(K key);
    boolean update(K key, V value);

}
