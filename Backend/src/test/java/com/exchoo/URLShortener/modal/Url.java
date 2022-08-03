package com.exchoo.URLShortener.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor //Bu alttaki üçü Lombok kütüphanesinden geliyor. Set get constructor methodlarını yazmış oluyoruz.
@NoArgsConstructor
@Data
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String shortUrl;
    private String orginalUrl;

}
