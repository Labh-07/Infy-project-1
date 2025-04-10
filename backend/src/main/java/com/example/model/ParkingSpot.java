package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "parking_spots")
public class ParkingSpot {
    @Id
    private String id;                // Auto-generated by MongoDB
    private String parkingId;         // Custom Parking ID (e.g., P-A234)
    private String flatNumber;        // Associated Flat Number
    private String block;             // Block (A, B, etc.)
    private String status;            // Available or Occupied

    // Default Constructor
    public ParkingSpot() {
    }

    // Parameterized Constructor
    public ParkingSpot(String parkingId, String flatNumber, String block, String status) {
        this.parkingId = parkingId;
        this.flatNumber = flatNumber;
        this.block = block;
        this.status = status;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParkingId() {
        return parkingId;
    }

    public void setParkingId(String parkingId) {
        this.parkingId = parkingId;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
