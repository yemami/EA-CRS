package miu.edu.CRS.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class CourseOffering {
    @Id
    @GeneratedValue
    private long id;
    private String code;
    private int capacity;
    private int availableSeat;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Faculty faculty;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<RegistrationRequest> registrationRequests = new ArrayList<>();
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Course> courses= new ArrayList<>();
    @ManyToOne(cascade = CascadeType.PERSIST)
    private AcademicBlock academicBlock;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Registration> registrations= new ArrayList<>();

    public CourseOffering(String code, int capacity, int availableSeat) {
        this.code = code;
        this.capacity = capacity;
        this.availableSeat = availableSeat;
    }

    public boolean addCourse( Course course){
        return courses.add(course);
    }

}
