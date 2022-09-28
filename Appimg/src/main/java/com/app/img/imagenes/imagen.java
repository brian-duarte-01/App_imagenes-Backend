package com.app.img.imagenes;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Blob;

@Entity
@Data
public class imagen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String imagenes;

}
