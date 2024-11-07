package com.example.servicioatencioncliente.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.util.Date;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
    private Long id;

    private String customerName;
    private String issueDescription;
    private Date submissionDate;
    private String status;

    public Ticket() {}

    public Ticket(String customerName, String issueDescription, Date submissionDate, String status) {
        this.customerName = customerName;
        this.issueDescription = issueDescription;
        this.submissionDate = submissionDate;
        this.status = status;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
