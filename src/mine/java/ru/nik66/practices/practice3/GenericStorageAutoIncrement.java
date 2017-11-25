package ru.nik66.practices.practice3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericStorageAutoIncrement<V extends Entity<Integer>> implements GenericStorage<Integer, V>, Iterable<GenericStorage.Node<Integer, V>> {

    private Integer id = 0;
    private List<Node<Integer, V>> nodeList = new ArrayList<>();



    @Override
    public boolean add(Integer key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Integer add(V value) {

        nodeList.add(new Node<>(++id, value));
        value.setId(id);

        return id;
    }

    @Override
    public V get(Integer key) {
        V result = null;
        for (Node<Integer, V> integerVNode : nodeList) {
            if (integerVNode.getKey().equals(key)) {
                result = integerVNode.getValue();
                break;
            }
        }
        return result;
    }

    @Override
    public boolean delete(Integer key) {
        boolean result = false;
        for (Iterator<Node<Integer, V>> iterator = nodeList.iterator(); iterator.hasNext();) {
            if (iterator.next().getKey().equals(key)) {
                iterator.remove();
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean update(Integer key, V value) {
        boolean result = false;
        for (int i = 0; i < nodeList.size(); i++) {
            if (nodeList.get(i).getKey().equals(key)) {
                nodeList.get(i).setValue(value);
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public Iterator<Node<Integer, V>> iterator() {
        return nodeList.iterator();
    }
}
