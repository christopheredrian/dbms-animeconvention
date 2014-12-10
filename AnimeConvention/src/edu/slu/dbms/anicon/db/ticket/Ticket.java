/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.slu.dbms.anicon.db.ticket;

import java.util.Date;

/**
 *
 * @author Chris
 */
public class Ticket {

    private int ticketNo;
    private double price;
    private String status;
    private Date dateClaimed;
    private int payId;
    private int badgeId;
    private int eventId;

    public Ticket() {
    }

    public Ticket(int ticketNo, double price, String status, int eventId) {
        this.ticketNo = ticketNo;
        this.price = price;
        this.status = status;
        this.eventId = eventId;
    }

    /**
     * @return the ticketNo
     */
    public int getTicketNo() {
        return ticketNo;
    }

    /**
     * @param ticketNo the ticketNo to set
     */
    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the dateClaimed
     */
    public Date getDateClaimed() {
        return dateClaimed;
    }

    /**
     * @param dateClaimed the dateClaimed to set
     */
    public void setDateClaimed(Date dateClaimed) {
        this.dateClaimed = dateClaimed;
    }

    /**
     * @return the payId
     */
    public int getPayId() {
        return payId;
    }

    /**
     * @param payId the payId to set
     */
    public void setPayId(int payId) {
        this.payId = payId;
    }

    /**
     * @return the badgeId
     */
    public int getBadgeId() {
        return badgeId;
    }

    /**
     * @param badgeId the badgeId to set
     */
    public void setBadgeId(int badgeId) {
        this.badgeId = badgeId;
    }

    /**
     * @return the eventId
     */
    public int getEventId() {
        return eventId;
    }

    /**
     * @param eventId the eventId to set
     */
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Override
    public String toString() {
        return "Ticket{" + "ticketNo=" + ticketNo + ", price=" + price + ", status=" + status + ", dateClaimed=" + dateClaimed + ", payId=" + payId + ", badgeId=" + badgeId + ", eventId=" + eventId + '}';
    }
    
    
    
}
