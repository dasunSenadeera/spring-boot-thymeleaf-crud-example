package com.thymeleaf.datauiapp.models;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Data
@Entity
public class Nationality {

    @Id
    private Integer id;
    private String name;
    private String capital;
    private String updatedBy;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date updatedOn;
}
