package no.kds.academy.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="trainingSession")
public class TrainingSession implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;

    public TrainingSession(){
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
