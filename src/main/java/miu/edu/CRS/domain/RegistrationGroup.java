package miu.edu.CRS.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class RegistrationGroup {
    @Id
    @GeneratedValue
    private long id;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Student> students;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<AcademicBlock> academicBlocks;

    public RegistrationGroup(List<Student> students, List<AcademicBlock> academicBlocks) {
        this.students = students;
        this.academicBlocks = academicBlocks;
    }
}
