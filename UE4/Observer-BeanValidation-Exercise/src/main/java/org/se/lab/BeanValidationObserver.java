package org.se.lab;

public class BeanValidationObserver implements Observer {

    @Override
    public void update(Subject state) {
        if(state instanceof Bean bean) {
            if(bean.getName() == null || bean.getName().length() < 4
                    || bean.getName().length() > 32 || bean.getId() < 0) {
                throw new IllegalStateException();
            }
        }
    }
}
