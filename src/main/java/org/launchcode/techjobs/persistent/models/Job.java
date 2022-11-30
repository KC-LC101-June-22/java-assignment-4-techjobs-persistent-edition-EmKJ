package org.launchcode.techjobs.persistent.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer) {
        super();
        this.employer = anEmployer;
    }

    // Getters and setters.
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkill(Skill skill){
        this.skills.add(skill);
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
