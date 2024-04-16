package edu.neu.mgen;

public class TrailRecord {
    private int id;
    private String trail;

    // Constructor
    public TrailRecord(int id, String trail) {
        this.id = id;
        this.trail = trail;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID (optional, depending on your requirements)
    public void setId(int id) {
        this.id = id;
    }

    // Getter for Trail
    public String getTrail() {
        return trail;
    }

    // Setter for Trail (optional, depending on your requirements)
    public void setTrail(String trail) {
        this.trail = trail;
    }

    // Override toString() method to provide a string representation of the object
    @Override
    public String toString() {
        return "TrailRecord{" +
                "id=" + id +
                ", trail='" + trail + '\'' +
                '}';
    }
}

