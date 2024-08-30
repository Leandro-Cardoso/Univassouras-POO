public class Main {
    public static void main(String[] args) {
        Car uno = new Car("Fiat", "Uno", 2015);
        System.out.println(uno.marca);
        uno.start();
        uno.drive(30);
        uno.drive(50);
        uno.drive(20);
    }
}
