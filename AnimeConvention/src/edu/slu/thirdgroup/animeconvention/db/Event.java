package edu.slu.thirdgroup.animeconvention.db;

/**
 *
 * @author chris
 */
public class Event {

    private int eventId;
    private String eventName;
    private String eventDesc;
    private String eventType;
    private String location;
    private int slots;
    private boolean ongoing;

    public boolean isOngoing() {
        return ongoing;
    }

    public void setOngoing(boolean ongoing) {
        this.ongoing = ongoing;
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

    /**
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * @return the eventDesc
     */
    public String getEventDesc() {
        return eventDesc;
    }

    /**
     * @param eventDesc the eventDesc to set
     */
    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    /**
     * @return the eventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType the eventType to set
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the slots
     */
    public int getSlots() {
        return slots;
    }

    /**
     * @param slots the slots to set
     */
    public void setSlots(int slots) {
        this.slots = slots;
    }
}
