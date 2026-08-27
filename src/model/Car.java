package model;

public class Car {
    String name;
    String model;
    int price = 1000;
    int weight = 1000;
    boolean isFormatic;
    String color;
    int power = 95;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 1000 && price < 1000000) {
            this.price = price;
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power > 95 && power < 12000) {
            this.power = power;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsFormatic() {
        return isFormatic;
    }

    public void setIsFormatic(boolean isFormatic) {
        this.isFormatic = isFormatic;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 1000 && weight < 4000) {
            this.weight = weight;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
