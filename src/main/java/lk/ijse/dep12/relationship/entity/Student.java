package lk.ijse.dep12.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    private String nic;
    private String name;
    private String address;
//    @OneToMany(mappedBy = "student", cascade = CascadeType.PERSIST)
//    private List<StudentContact> studentContactLists = new ArrayList<>();
//
//    public Student(String nic, String name, String address) {
//        this.nic = nic;
//        this.name = name;
//        this.address = address;
//    }
}
