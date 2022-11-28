package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Job extends AbstractEntity{

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @NotBlank(message="Please select an employer")
    private String employer;

    private String skills;

    public Job() {
    }

    public Job(String anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
