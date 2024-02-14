package org.se.lab;

public class ServiceLocator {

    private static ServiceLocator locator = new ServiceLocator();
    private ServiceLocator() {
    }
    public static ServiceLocator getInstance() {
        return locator;
    }
    public ListFactory newListFactory() {
        return new ListFactoryImpl();
    }
}
