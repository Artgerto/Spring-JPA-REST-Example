package com.building.project.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Table(name = "apartment_price_stats")
@EntityListeners(AuditingEntityListener.class)
@Entity
public class ApartmentPriceStats implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "idapartment")
    private Long idApartment;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date;

    @Column(name = "price")
    private BigDecimal price;

    public ApartmentPriceStats(){ }

    public ApartmentPriceStats(Long idApartment, Date date, BigDecimal price) {
        this.idApartment = idApartment;
        this.date = date;
        this.price = price;
    }

    public Long getIdApartment() {
        return idApartment;
    }

    public void setIdApartment(Long idApartment) {
        this.idApartment = idApartment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
