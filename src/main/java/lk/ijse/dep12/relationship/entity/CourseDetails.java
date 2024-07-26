package lk.ijse.dep12.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course_details")
@IdClass(CourseDetailsPK.class)
public class CourseDetails {
    @Id
    @ManyToOne
    @JoinColumn(name = "course_code")
    private Course course;
    @Id
    @ManyToOne
    @JoinColumn(name = "module_code")
    private Module module;
}