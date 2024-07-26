package lk.ijse.dep12.relationship.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_contact")
public class StudentContact {
    private Student student;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private String contact;

}
