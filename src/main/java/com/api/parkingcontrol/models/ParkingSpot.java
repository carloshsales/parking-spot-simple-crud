package com.api.parkingcontrol.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_parking_spot")
@Data
public class ParkingSpot implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String carLicensePlate;
    @Column(nullable = false, length = 50)
    private String carBrand;
    @Column(nullable = false, length = 20)
    private String carModel;
    @Column(nullable = false, length = 20)
    private String carColor;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 200)
    private String responsibleName;
    @Column(nullable = false, length = 50)
    private String apartment;
    @Column(nullable = false, unique = true, length = 50)
    private String block;
}
