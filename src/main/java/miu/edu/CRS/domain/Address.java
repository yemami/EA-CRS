package miu.edu.CRS.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor

public class Address {
    @Id
   @GeneratedValue
    private long id;
    private String street;
    private String city;
    private String postalCode;
    private String stateProvince;
    private String countryRegion;

    public Address(String street, String city, String postalCode, String stateProvince, String countryRegion) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.stateProvince = stateProvince;
        this.countryRegion = countryRegion;
    }
}
