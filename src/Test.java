import model.Resturant;
import service.ResturantService;

public class Test {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 7, -5, 7, 7, 8, 9, 8, 12, 13};

        Resturant r1 = new Resturant();
        r1.setName("II");
        r1.setCuisine("ARMENIAN");
        r1.setCity("II");
        r1.setYearOpened(2020);
        r1.setOpen(true);
        r1.setAveragePrice(10);
        r1.setCapacity(10);
        r1.setOpeningHour(10);
        r1.setRating(10);

        ResturantService r = new ResturantService();
        r.printResturant(r1);
        int y = arr[0];
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > y) {
               y = arr[x];
            }

        }

        System.out.println(y);
    }
}
