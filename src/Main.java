public class Main {
    public static void main(String[] args) {
        // Skapa en klass som kan användas för att representera ett rationellt tal
        // Klassen skall spara två heltal täljaren och nämnaren

        RatNum num1 = new RatNum();
        num1.p = 5;
        num1.q = 9;

        RatNum num2 = new RatNum();
        num2.p = 1;
        num2.q = 3;

        RatNum num3 = new RatNum();
        num3.p = 7;
        num3.q = 12;

        System.out.format("%d/%d", num1.p, num1.q);
    }
}

class RatNum {
    // p / q
    int p;
    int q;
}