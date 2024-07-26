package lk.ijse.dep12.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_contact")
public class StudentContact {
    @ManyToOne
    @JoinColumn(name = "student_nic")
    private Student student;

    @Id
    private String contact;

}
