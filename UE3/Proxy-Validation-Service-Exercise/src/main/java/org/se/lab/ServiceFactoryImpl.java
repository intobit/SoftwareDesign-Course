package org.se.lab;

public class ServiceFactoryImpl implements ServiceFactory{

    @Override
    public Service createService() {return new ValidationProxy(new ServiceImpl());}
}
