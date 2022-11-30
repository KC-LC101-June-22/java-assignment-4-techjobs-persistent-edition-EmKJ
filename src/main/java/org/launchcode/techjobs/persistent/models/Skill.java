package org.launchcode.techjobs.persistent.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    @Size(min = 5, max = 255, message = "Description must be between 5 and 255 characters.")
    @NotBlank(message="Please enter a skill description")
    private String description;

    public Skill() {
    }

    public Skill( String description, List<Job> jobs) {
        super();
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
    
    public void addJob(Job job){
        this.jobs.add(job);
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }


}