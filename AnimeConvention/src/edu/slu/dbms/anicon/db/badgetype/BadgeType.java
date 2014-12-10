
package edu.slu.dbms.anicon.db.badgetype;

/**
 *
 * @author chris
 */
public class BadgeType {
    private int badgeNo;
    private double amount;
    private String badgeName;
    private String badgeDesc;
    private int noOfDays;
    private String freebies;

    /**
     * @return the badgeNumber
     */
    public int getBadgeNumber() {
        return badgeNo;
    }

    /**
     * @param badgeNumber the badgeNumber to set
     */
    public void setBadgeNumber(int badgeNumber) {
        this.badgeNo = badgeNumber;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the badgeName
     */
    public String getBadgeName() {
        return badgeName;
    }

    /**
     * @param badgeName the badgeName to set
     */
    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    /**
     * @return the badgeDesc
     */
    public String getBadgeDesc() {
        return badgeDesc;
    }

    /**
     * @param badgeDesc the badgeDesc to set
     */
    public void setBadgeDesc(String badgeDesc) {
        this.badgeDesc = badgeDesc;
    }

    /**
     * @return the noOfDays
     */
    public int getNoOfDays() {
        return noOfDays;
    }

    /**
     * @param noOfDays the noOfDays to set
     */
    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    /**
     * @return the freebies
     */
    public String getFreebies() {
        return freebies;
    }

    /**
     * @param freebies the freebies to set
     */
    public void setFreebies(String freebies) {
        this.freebies = freebies;
    }

    @Override
    public String toString() {
        return "BadgeType{" + "badgeNo=" + badgeNo + ", amount=" + amount + ", badgeName=" + badgeName + ", badgeDesc=" + badgeDesc + ", noOfDays=" + noOfDays + ", freebies=" + freebies + '}';
    }
    
}
