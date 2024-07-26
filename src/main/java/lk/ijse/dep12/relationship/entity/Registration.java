package lk.ijse.dep12.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "registration")
@IdClass(RegistrationPK.class)
public class Registration {
    @Id
    @ManyToOne
    @JoinColumn(name = "student_nic")
    private Student student;
    @Id
    @ManyToOne
    @JoinColumn(name = "username")
    private User user;
    @Id
    @ManyToOne
    @JoinColumn(name = "batch_id")
    private Batch batch;
    private Date date;
}