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

    public Portfolio(Client client, String creationDate) {
        this.client = client;
        this.creationDate = creationDate;

    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getCLient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }


}