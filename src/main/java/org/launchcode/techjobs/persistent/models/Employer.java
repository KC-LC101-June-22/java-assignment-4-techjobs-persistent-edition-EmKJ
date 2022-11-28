package org.launchcode.techjobs.persistent.models;

import java.lang.reflect.Constructor;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.launchcode.techjobs.persistent.controllers.EmployerController;

@Entity
public class Employer extends AbstractEntity {

    @Size(min=5, max=255, message="Must be between 5 and 255 characters")
    @NotBlank(message="Location name cannot be blank")
    private String location;

    public Employer(){
    }
    
    public Employer(String location) {
        super();
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
