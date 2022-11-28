package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message="Please enter a skill description")
    @Size(min = 5, max = 255, message = "Description must be between 5 and 255 characters.")
    private String description;

    public Skill() {
    }

    public Skill( String description) {
        super();
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}