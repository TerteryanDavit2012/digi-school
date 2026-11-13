import model.Resturant;
import service.ResturantService;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Resturant restaurant1 = new Resturant();
        restaurant1.setId(1);
        restaurant1.setName("Tavern Yerevan");
        restaurant1.setCuisine("ARMENIAN");
        restaurant1.setCity("YEREVAN");
        restaurant1.setRating(4.8);
        restaurant1.setAveragePrice(5000);
        restaurant1.setCapacity(200);
        restaurant1.setOpeningHour(10);
        restaurant1.setYearOpened(1998);
        restaurant1.setOpen(true);

        Resturant restaurant2 = new Resturant();
        restaurant2.setId(2);
        restaurant2.setName("Italian House");
        restaurant2.setCuisine("ITALIAN");
        restaurant2.setCity("GYUMRI");
        restaurant2.setRating(4.5);
        restaurant2.setAveragePrice(6500);
        restaurant2.setCapacity(100);
        restaurant2.setOpeningHour(9);
        restaurant2.setYearOpened(2005);
        restaurant2.setOpen(true);

        Resturant restaurant3 = new Resturant();
        restaurant3.setId(3);
        restaurant3.setName("Asian Food");
        restaurant3.setCuisine("ASIAN");
        restaurant3.setCity("VANADZOR");
        restaurant3.setRating(4.2);
        restaurant3.setAveragePrice(4000);
        restaurant3.setCapacity(150);
        restaurant3.setOpeningHour(11);
        restaurant3.setYearOpened(2015);
        restaurant3.setOpen(false);

        Resturant restaurant4 = new Resturant();
        restaurant4.setId(4);
        restaurant4.setName("Armenian Taste");
        restaurant4.setCuisine("ARMENIAN");
        restaurant4.setCity("YEREVAN");
        restaurant4.setRating(4.9);
        restaurant4.setAveragePrice(7500);
        restaurant4.setCapacity(300);
        restaurant4.setOpeningHour(12);
        restaurant4.setYearOpened(2010);
        restaurant4.setOpen(true);


        Resturant[] restaurants = {
                restaurant1,
                restaurant2,
                restaurant3,
                restaurant4
        };


        ResturantService service = new ResturantService();

        Scanner sc = new Scanner(System.in);
        Resturant restaurant = restaurant1;

        boolean isActive = true;

        while (isActive) {

            System.out.println();
            System.out.println("----------------MENU----------------");
            System.out.println("1: Choose Restaurant");
            System.out.println("2: Give Restaurant Info");
            System.out.println("3: Check Wether Your Budget Matches Restaurant");
            System.out.println("4: Check Wether You Can Visit");
            System.out.println("5: Calculate Group Cost");
            System.out.println("6: Check If Restaurant Matches Cuisine and City");
            System.out.println("7: Calculate Price Difference");
            System.out.println("8: Check Whether You Can Reserve");
            System.out.println("9: Get Remaning Seats");
            System.out.println("10: Check If Restaurant Is Suitable");
            System.out.println("11: Get Restaurant Quality");
            System.out.println("12: Calculate Final Bill");
            System.out.println("13: Check Spesial Offer");
            System.out.println("14: Exit");
            System.out.println("___________________________________");

            System.out.print("Choose an option: ");

            int menuChoice = sc.nextInt();

            switch (menuChoice) {

                case 1:

                    System.out.println("1: " + restaurant1.getName());
                    System.out.println("2: " + restaurant2.getName());
                    System.out.println("3: " + restaurant3.getName());
                    System.out.println("4: " + restaurant4.getName());

                    System.out.print("Choose restaurant: ");

                    int restaurantChoice = sc.nextInt();

                    switch (restaurantChoice) {

                        case 1:
                            restaurant = restaurant1;
                            break;

                        case 2:
                            restaurant = restaurant2;
                            break;

                        case 3:
                            restaurant = restaurant3;
                            break;

                        case 4:
                            restaurant = restaurant4;
                            break;

                        default:
                            System.out.println("no such choice.");
                            break;
                    }

                    System.out.println(
                            "Current restaurant: " + restaurant.getName()
                    );

                    break;

                case 2:
                    System.out.println("ID: " + restaurant.getId());
                    System.out.println("Name: " + restaurant.getName());
                    System.out.println("Cuisine: " + restaurant.getCuisine());
                    System.out.println("City: " + restaurant.getCity());
                    System.out.println("Rating: " + restaurant.getRating());
                    System.out.println(
                            "Average Price: "
                                    + restaurant.getAveragePrice()
                    );
                    System.out.println(
                            "Capacity: "
                                    + restaurant.getCapacity()
                    );
                    System.out.println(
                            "Opening Hour: "
                                    + restaurant.getOpeningHour()
                    );
                    System.out.println(
                            "Year Opened: "
                                    + restaurant.getYearOpened()
                    );
                    System.out.println(
                            "Open: "
                                    + restaurant.isOpen()
                    );

                    break;


                case 3:
                    System.out.print("Enter your max budget: ");

                    double maxBudget = sc.nextDouble();

                    boolean withinBudget =
                            service.isWithinBudget(
                                    restaurant,
                                    maxBudget
                            );

                    System.out.println(
                            "Within budget: "
                                    + withinBudget
                    );

                    break;


                case 4:
                    System.out.print("Enter people count: ");
                    int peopleCount = sc.nextInt();

                    System.out.print("Enter budget per prson: ");
                    double budgetPerPerson = sc.nextDouble();

                    boolean canVisit =
                            service.canVisit(
                                    restaurant,
                                    peopleCount,
                                    budgetPerPerson
                            );

                    System.out.println(
                            "Can visit: "
                                    + canVisit
                    );
                    break;


                case 5:
                    System.out.print("Enter people count: ");

                    int groupPeople = sc.nextInt();

                    double groupCost =
                            service.calculateGroupCost(
                                    restaurant,
                                    groupPeople
                            );

                    System.out.println(
                            "Total group cost: "
                                    + groupCost
                    );

                    break;

                case 6:
                    System.out.print(
                            "Enter cuisine (ITALIAN, ARMENIAN, ASIAN): "
                    );

                    String cuisine = sc.next();

                    System.out.print(
                            "Enter city (YEREVAN, GYUMRI, VANADZOR): "
                    );

                    String city = sc.next();

                    boolean matches =
                            service.matchesRestaurant(
                                    restaurant,
                                    cuisine,
                                    city
                            );

                    System.out.println(
                            "Matches: "
                                    + matches
                    );
                    break;


                case 7:
                    System.out.println(
                            "Comparing current restaurant with Restaurant 2"
                    );

                    double difference =
                            service.getPriceDifference(
                                    restaurant,
                                    restaurant2
                            );

                    System.out.println(
                            "Price difference: "
                                    + difference
                    );
                    break;


                case 8:
                    System.out.print(
                            "Enter already reserved seats: "
                    );
                    int reservedSeats = sc.nextInt();

                    System.out.print(
                            "Enter requested seats: "
                    );

                    int requestedSeats = sc.nextInt();

                    boolean canReserve =
                            service.canReserve(
                                    restaurant,
                                    reservedSeats,
                                    requestedSeats
                            );
                    System.out.println(
                            "Can reserve: "
                                    + canReserve
                    );
                    break;


                case 9:

                    System.out.print(
                            "Enter reserved seats: "
                    );

                    int reserved =
                            sc.nextInt();

                    int remaining =
                            service.getRemainingSeats(
                                    restaurant,
                                    reserved
                            );

                    System.out.println(
                            "Remaining seats: "
                                    + remaining
                    );

                    break;


                case 10:
                    System.out.print(
                            "Enter preferred cuisine: "
                    );
                    String preferredCuisine =
                            sc.next();

                    System.out.print(
                            "Enter maximum price: "
                    );

                    double maxPrice =
                            sc.nextDouble();

                    System.out.print(
                            "Enter minimum rating: "
                    );
                    double minRating =
                            sc.nextDouble();
                    boolean suitable =
                            service.isSuitable(
                                    restaurant,
                                    preferredCuisine,
                                    maxPrice,
                                    minRating
                            );
                    System.out.println(
                            "Restaurant suitable: "
                                    + suitable
                    );

                    break;


                case 11:

                    System.out.print(
                            "Enter minimum good rating: "
                    );

                    double minimumGoodRating =
                            sc.nextDouble();

                    String quality =
                            service.getRestaurantQuality(
                                    restaurant,
                                    minimumGoodRating
                            );
                    System.out.println(
                            "Restaurant quality: "
                                    + quality
                    );
                    break;

                case 12:
                    System.out.print(
                            "Enter people count: "
                    );

                    int billPeople =
                            sc.nextInt();

                    System.out.print(
                            "Enter discount percentage: "
                    );

                    double discount =
                            sc.nextDouble();

                    double finalBill =
                            service.calculateFinalBill(
                                    restaurant,
                                    billPeople,
                                    discount
                            );

                    System.out.println(
                            "Final bill: "
                                    + finalBill
                    );

                    break;


                case 13:

                    System.out.print(
                            "Is customer VIP? (true/false): "
                    );

                    boolean vip =
                            sc.nextBoolean();

                    System.out.print(
                            "Enter people count: "
                    );
                    int offerPeople =
                            sc.nextInt();

                    boolean specialOffer =
                            service.canGetSpecialOffer(
                                    restaurant,
                                    offerPeople,
                                    vip
                            );

                    System.out.println(
                            "Special offer: "
                                    + specialOffer
                    );

                    break;
                case 14:
                    isActive = false;

                    System.out.println(
                            "Program closed."
                    );

                    break;
                default:
                    System.out.println(
                            "Invalid Input, Please Try Again."
                    );
            }
        }

        sc.close();
    }
}

