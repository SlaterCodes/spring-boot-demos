package codes.slater.springbootdemos.actuator;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Data {

    @Id
    private Integer id;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
