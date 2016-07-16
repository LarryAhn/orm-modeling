package com.zuperztar.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Ahn on 2016. 7. 16..
 */
@Entity
@Data
public class Start {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "description", nullable = false)
    private String description;

}
