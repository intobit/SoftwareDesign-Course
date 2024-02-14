package org.se.lab;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class ListFactoryImpl implements ListFactory {

    ListFactoryImpl() {
    }
    @Override
    public List<String> createList() {
        return new ArrayList<>();
    }
    @Override
    public List<String> createList(Type type) {
        if (type == Type.ARRAY)
            return new ArrayList<>();
        if (type == Type.LINKED)
            return new LinkedList<>();
        return null;
    }
}
