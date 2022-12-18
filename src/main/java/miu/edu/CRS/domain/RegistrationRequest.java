package miu.edu.CRS.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class RegistrationRequest {
    @Id
    @GeneratedValue
    private long id;
}
