package com.api.parkingcontrol.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class ParkingSpotDto {
    @NotBlank
    private String parkingSpotNumber;
    @NotBlank
    @Size(max = 7)
    private String carLicensePlate;
    @NotBlank
    private String carBrand;
    @NotBlank
    private String carModel;
    @NotBlank
    private String carColor;
    @NotBlank
    private String responsibleName;
    @NotBlank
    private String apartment;
    @NotBlank
    private String block;
}
