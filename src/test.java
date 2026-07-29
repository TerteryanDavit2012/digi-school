public class test {
    public static void main(String[] args) {
        PC pc = new PC();
        pc.operationSystem = "Windows";
        pc.processor = "Intel Core i7";
        pc.ram = 16;
        pc.graphicsCard = "Nvidia Geforce GTX 1050";
        pc.HDD = true;
        pc.SSD = false;
        pc.motherBoard = "Asus ROG Strix G14";

        System.out.println("PC specs");
        System.out.println();

        System.out.println("Operating System: " + pc.operationSystem);
        System.out.println("Processor: " + pc.processor);
        System.out.println("RAM: " + pc.ram);
        System.out.println("Graphics Card: " + pc.graphicsCard);
        System.out.println("Motherboard: " + pc.motherBoard);
        System.out.println("HDD: " + (pc.HDD ? "Yes" : "No"));
        System.out.println("SSD: " + (pc.SSD ? "Yes" : "No"));
    }
}
