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
public class CourseDetailsPK implements Serializable {
    private Course course;
    private Module module;
}
