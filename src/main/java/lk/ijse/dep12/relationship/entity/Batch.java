package lk.ijse.dep12.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "batch")
public class Batch {
    @Id
    @Column(name = "batch_id")
    private String batchId;
    private String duration;
    @ManyToOne
    @JoinColumn(name = "course_code")
    private Course course;
    private BigDecimal fee;
}