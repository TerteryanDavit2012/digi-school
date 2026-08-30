package service;
import model.Resturant;

public class ResturantService {
    public boolean isWithinBudget(Resturant restaurant, double maxBudget) {
        if (restaurant.getAveragePrice() <= maxBudget && restaurant.isOpen()) {
            return true;
        }

        return false;
    }


    public Resturant getBetterRestaurant(Resturant restaurant1, Resturant restaurant2) {

        if (restaurant1.getRating() > restaurant2.getRating()) {
            return restaurant1;
        }

        if (restaurant2.getRating() > restaurant1.getRating()) {
            return restaurant2;
        }

        if (restaurant1.getAveragePrice() <= restaurant2.getAveragePrice()) {
            return restaurant1;
        }

        return restaurant2;
    }


    public boolean canVisit(Resturant restaurant, int peopleCount, double budgetPerPerson) {

        if (restaurant.isOpen()
                && peopleCount > 0
                && peopleCount <= restaurant.getCapacity()
                && budgetPerPerson >= restaurant.getAveragePrice()) {

            return true;
        }

        return false;
    }


    public double calculateGroupCost(Resturant restaurant, int peopleCount) {

        double total = restaurant.getAveragePrice() * peopleCount;

        if (peopleCount >= 20) {
            total = total * 0.85;
        } else if (peopleCount >= 10) {
            total = total * 0.90;
        } else if (peopleCount >= 5) {
            total = total * 0.95;
        }

        return total;
    }


    public boolean matchesRestaurant(Resturant restaurant, String cuisine, String city) {

        switch (cuisine) {
            case "ITALIAN":
            case "ARMENIAN":
            case "ASIAN":

                switch (city) {
                    case "YEREVAN":
                    case "GYUMRI":
                    case "VANADZOR":

                        if (restaurant.getCuisine().equals(cuisine)
                                && restaurant.getCity().equals(city)) {
                            return true;
                        }
                }
        }

        return false;
    }


    public double getPriceDifference(Resturant restaurant1, Resturant restaurant2) {

        double difference = restaurant1.getAveragePrice()
                - restaurant2.getAveragePrice();

        if (difference < 0) {
            difference = -difference;
        }

        return difference;
    }


    public boolean canReserve(Resturant restaurant, int reservedSeats, int requestedSeats) {

        int remainingSeats = restaurant.getCapacity() - reservedSeats;

        if (restaurant.isOpen()
                && requestedSeats > 0
                && requestedSeats <= remainingSeats) {

            return true;
        }

        return false;
    }


    public int getRemainingSeats(Resturant restaurant, int reservedSeats) {

        if (reservedSeats < 0) {
            return restaurant.getCapacity();
        }

        if (reservedSeats >= restaurant.getCapacity()) {
            return 0;
        }

        return restaurant.getCapacity() - reservedSeats;
    }
    public boolean isSuitable(Resturant restaurant, String preferredCuisine,
                              double maxPrice, double minRating) {
        if (restaurant.getCuisine() == preferredCuisine
                && restaurant.getAveragePrice() <= maxPrice
                && restaurant.getRating() >= minRating
                && restaurant.isOpen()) {
            return true;
        }

        return false;
    }


    public Resturant recommendRestaurant(Resturant restaurant1,
                                         Resturant restaurant2,
                                         double maxPrice,
                                         String preferredCuisine) {

        boolean restaurant1Suitable =
                restaurant1.getAveragePrice() <= maxPrice;

        boolean restaurant2Suitable =
                restaurant2.getAveragePrice() <= maxPrice;

        if (!restaurant1Suitable && !restaurant2Suitable) {
            return null;
        }

        if (restaurant1Suitable && !restaurant2Suitable) {
            return restaurant1;
        }

        if (restaurant2Suitable && !restaurant1Suitable) {
            return restaurant2;
        }

        boolean restaurant1Preferred =
                restaurant1.getCuisine().equals(preferredCuisine);

        boolean restaurant2Preferred =
                restaurant2.getCuisine().equals(preferredCuisine);

        if (restaurant1Preferred && !restaurant2Preferred) {
            return restaurant1;
        }

        if (restaurant2Preferred && !restaurant1Preferred) {
            return restaurant2;
        }

        if (restaurant1.getRating() > restaurant2.getRating()) {
            return restaurant1;
        }

        if (restaurant2.getRating() > restaurant1.getRating()) {
            return restaurant2;
        }

        if (restaurant1.getAveragePrice() <= restaurant2.getAveragePrice()) {
            return restaurant1;
        }

        return restaurant2;
    }


    public String getRestaurantQuality(Resturant restaurant,
                                       double minimumGoodRating) {

        if (restaurant.getRating() >= 4.5) {
            return "Excellent";
        }

        if (restaurant.getRating() >= minimumGoodRating) {
            return "Good";
        }

        if (restaurant.getRating() >= 3.0) {
            return "Average";
        }

        return "Poor";
    }


    public double calculateFinalBill(Resturant restaurant,
                                     int peopleCount,
                                     double discountPercent) {

        double total =
                restaurant.getAveragePrice() * peopleCount;

        if (discountPercent >= 0 && discountPercent <= 50) {
            total = total - total * discountPercent / 100;
        }

        return total;
    }


    public boolean canGetSpecialOffer(Resturant restaurant,
                                      int peopleCount,
                                      boolean vipCustomer) {

        if (vipCustomer && peopleCount >= 2) {
            return true;
        }

        if (peopleCount >= 10
                && restaurant.getRating() >= 4.0) {
            return true;
        }

        return false;
    }
}