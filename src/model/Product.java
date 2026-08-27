package model;

public class Product {
    private int id = 1;
    private String name;
    private String category;
    double price = 1;
    int quantity = 0;
    double discount = 0;
    double rating = 1;
    boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
        }
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == "food" || category == "toys" || category == "books") {
            this.category = category;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
        }
        this.quantity = quantity;

        if (quantity > 0) {
            this.active = true;
        }
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount < 0 || discount > 50) {
        }
        this.discount = discount;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating < 1 || rating > 5) {
        }
        this.rating = rating;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        if (quantity > 0 && !active) {
        }
        this.active = active;
    }
}
