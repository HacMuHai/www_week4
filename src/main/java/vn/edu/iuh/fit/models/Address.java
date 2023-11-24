package vn.edu.iuh.fit.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class Address {
    @Id
    @Column(columnDefinition = "UUID")
    private UUID id;
    private String city;
    private Short country;
    private String number;
    private String street;
    private String zipcode;

    public Address(UUID id) {
        this.id = id;
    }
}
