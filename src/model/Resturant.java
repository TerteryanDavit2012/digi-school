package model;

public class Resturant {
    private int id = 1;
    private String name = "II";
    private String cuisine = "ARMENIAN";
    private String city = "II";
    private double rating = 0;
    private double averagePrice = 1;
    private int capacity = 1;
    private int openingHour = 0;
    private int yearOpened = 1900;
    private boolean open = false;

    public Resturant() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 2 && name.length() <= 100) {
            this.name = name;
        }
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        switch (cuisine) {
            case "ITALIAN":
            case "ARMENIAN":
            case "ASIAN":
                this.cuisine = cuisine;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && city.length() >= 2 && city.length() <= 80) {
            this.city = city;
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        }
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        if (averagePrice > 0) {
            this.averagePrice = averagePrice;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity >= 1 && capacity <= 1000) {
            this.capacity = capacity;
        }
    }

    public int getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(int openingHour) {
        if (openingHour >= 0 && openingHour <= 23) {
            this.openingHour = openingHour;
        }
    }

    public int getYearOpened() {
        return yearOpened;
    }

    public void setYearOpened(int yearOpened) {
        if (yearOpened >= 1900 && yearOpened <= 2026) {
            this.yearOpened = yearOpened;
        }
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
