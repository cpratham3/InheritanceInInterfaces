//Dynamic method dispatch example
public class Main {

    public static void main(String[] args) {
        Phone P1 = new Phone();
        P1.Greet();
        Phone P2 = new SmartPhone();
        P2.Greet();
        P1.Name();
        P2.Name();
        // P2.Camera();     We cannot run this method



    }
}