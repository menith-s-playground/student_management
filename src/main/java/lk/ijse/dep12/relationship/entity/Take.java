package lk.ijse.dep12.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "take")
public class Take {
    @EmbeddedId
    private TakePK takePK;
    @Id
    @ManyToOne
    @JoinColumn(name = "batch_id")
    private Batch batch;
    @Id
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @Id
    @ManyToOne
    @JoinColumn(name = "module_code")
    private Module module;
}
