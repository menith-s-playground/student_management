package lk.ijse.dep12.relationship.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class RegistrationPK implements Serializable {
    private Student student;
    private User user;
    private Batch batch;
}