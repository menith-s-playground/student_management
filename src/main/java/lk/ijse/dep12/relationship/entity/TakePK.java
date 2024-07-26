package lk.ijse.dep12.relationship.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TakePK implements Serializable {
    private Batch batch;
    private Student student;
    private Module module;
}
