package org.se.lab;

import java.util.Objects;

public abstract class Entity {

    private long id;

    public Entity() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id >= 1) {
            this.id = id;
        } else throw new IllegalArgumentException("id must be positive");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return id == entity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
