package miu.edu.CRS.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Student extends Person{
    private long studentID;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Address homeAddress;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Address mailAddress;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Registration> registrations= new ArrayList<>();
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<RegistrationRequest> registrationRequests =new ArrayList<>();


    public Student(String firstName, String lastName, String email, long studentID, Address homeAddress, Address mailAddress) {
        super(firstName,lastName,email);
        this.studentID = studentID;
        this.homeAddress = homeAddress;
        this.mailAddress = mailAddress;
    }


}
