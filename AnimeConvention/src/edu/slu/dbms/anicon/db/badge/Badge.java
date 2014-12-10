package edu.slu.dbms.anicon.db.badge;

import java.util.Date;

/**
 *
 * @author Chris
 */
public class Badge {
    private int badgeId;
    private int daysLeft;
    private Date dateClaimed; // Check errors
    private int badgeNo;
    private int memberId;

    public Badge(int daysLeft, int badgeNo, int memberId) {
        this.daysLeft = daysLeft;
        this.badgeNo = badgeNo;
        this.memberId = memberId;
    }

    public Badge() {
      
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
     * @return the daysLeft
     */
    public int getDaysLeft() {
        return daysLeft;
    }

    /**
     * @param daysLeft the daysLeft to set
     */
    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
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
     * @return the badgeNo
     */
    public int getBadgeNo() {
        return badgeNo;
    }

    /**
     * @param badgeNo the badgeNo to set
     */
    public void setBadgeNo(int badgeNo) {
        this.badgeNo = badgeNo;
    }

    /**
     * @return the memberId
     */
    public int getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Badge{" + "badgeId=" + badgeId + ", daysLeft=" + daysLeft + ", dateClaimed=" + dateClaimed + ", badgeNo=" + badgeNo + ", memberId=" + memberId + '}';
    }
    
    
}
