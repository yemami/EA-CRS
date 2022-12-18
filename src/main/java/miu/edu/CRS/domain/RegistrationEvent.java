package miu.edu.CRS.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class RegistrationEvent {
    @Id
    @GeneratedValue
    private long id;
    private LocalDate startDate;
    private LocalDate endDate;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<RegistrationGroup> registrationGroups = new ArrayList<>();

    public RegistrationEvent(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
