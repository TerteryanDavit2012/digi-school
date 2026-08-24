import model.Car;

public class test {
    public static void main(String[] args) {
        Car car = new Car();

        car.setName("BMW");
        car.setModel("X5");
        car.setPrice(50000);
        car.setWeight(2200);
        car.setColor("Black");
        car.setPower(300);
        car.setIsFormatic(true);

    Car car1 = new Car();

        car1.setName("porshe");
        car1.setModel("911gt3");
        car1.setPrice(100000);
        car1.setWeight(1400);
        car1.setColor("green");
        car1.setPower(1000);
        car1.setIsFormatic(false);

        Car car2 = new Car();
        car.setName("mercedes");
        car.setModel("c class");
        car.setPrice(50000);
        car.setWeight(2300);
        car.setColor("white");
        car.setPower(800);
        car.setIsFormatic(true);
    }
}
