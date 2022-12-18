package miu.edu.CRS.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor

public class AcademicBlock {
    @Id
    @GeneratedValue
    private long id;
    private String code;
    private String name;
    @Enumerated(EnumType.STRING)
    private Semester semester;
    private LocalDate startDate;
    private LocalDate endDate;

    public AcademicBlock(String code, String name, Semester semester, LocalDate startDate, LocalDate endDate) {
        this.code = code;
        this.name = name;
        this.semester = semester;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
