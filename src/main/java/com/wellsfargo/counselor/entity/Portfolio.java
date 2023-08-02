package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long portfolioId;

    @Column(nullable = false)
    private String creationDate;

    @ManyToOne
    @JoinColumn(name = "client_id") // The foreign key column name in the 'address' table
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(String creationDate) {
        this.creationDate = creationDate;

    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }


}