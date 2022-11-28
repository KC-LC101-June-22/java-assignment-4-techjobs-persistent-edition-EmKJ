package org.launchcode.techjobs.persistent.models;

import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message="Please enter a job name")
    @Size(min=3, max=255, message="Must be between 3 and 255 characters")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}