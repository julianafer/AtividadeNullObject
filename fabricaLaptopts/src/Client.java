import model.Laptop;
import service.LaptopFactory;

public class Client {

    public static void main(String[] args) {
        LaptopFactory LF = new LaptopFactory();

        Laptop l1 = LF.createLaptop("Gamer");
        Laptop l2 = LF.createLaptop("Normal");
        Laptop l3 = LF.createLaptop(null);

        System.out.println("Laptop 1: Gamer ");
        l1.runTests();
        System.out.println("Laptop 2: Normal");
        l2.runTests();
        System.out.println("Laptop 3: Null ");
        l3.runTests();

    }

}
