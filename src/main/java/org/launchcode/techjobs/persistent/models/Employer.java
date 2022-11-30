package org.launchcode.techjobs.persistent.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @Size(min=5, max=255, message="Must be between 5 and 255 characters")
    @NotBlank(message="Location name cannot be blank")
    private String location;

    @OneToMany(mappedBy = "employer")
    private final List<Job> jobs = new ArrayList<>();

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
