package com.tucine.cineclubadministration.Cineclub.dto.receive;

import com.tucine.cineclubadministration.Cineclub.model.CineclubType;
import com.tucine.cineclubadministration.Film.model.Film;
import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CineclubReceiveDto {
    private String name;
    private String address;
    private String phone;
    private String openInHours;
    private String socialReason;
    private String RUC;
    private String logoSrc;
    private String bannerSrc;
    private String state;
    private String description;
    private Integer capacity;
    private CineclubType cineclubType;
    private Long ownerId;
    public List<Film> films;
}
