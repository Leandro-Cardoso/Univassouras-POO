public class Car {
    String marca;
    String model;
    int year;
    boolean isRunning;
    int velocity;
    public Car(String marca, String model, int year) {
        this.marca = marca;
        this.model = model;
        this.year = year;
        this.isRunning = false;
        this.velocity = 0;
    }
    public void start() {
        if(!isRunning) {
            isRunning = true;
            System.out.println("Voce ligou o carro " + marca + " " + model + "...");
        }
        else {
            System.out.println("O carro " + marca + " " + model + " está ligado...");
        }
    }
    public void stop() {
        if(isRunning) {
            isRunning = false;
            velocity = 0;
            System.out.println("Voce desligou o carro" + marca + " " + model + "...");
        }
        else {
            System.out.println("O carro " + marca + " " + model + " está desligado...");
        }
    }
    public void drive(int distance) {
        if(isRunning) {
            velocity += distance;
            System.out.println("Velocidade: " + velocity);
        }
    }
}
