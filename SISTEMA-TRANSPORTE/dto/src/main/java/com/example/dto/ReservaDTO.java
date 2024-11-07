package com.example.dto;

import java.util.Date;

public class ReservaDTO {
    private Long id;
    private Long clientId;
    private Long busId;
    private Date reservationDate;
    private String status;

    // Constructor
    public ReservaDTO(Long id, Long clientId, Long busId, Date reservationDate, String status) {
        this.id = id;
        this.clientId = clientId;
        this.busId = busId;
        this.reservationDate = reservationDate;
        this.status = status;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
