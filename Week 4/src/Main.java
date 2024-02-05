public class Main {

    // Add your method here
    public static void describe(String colour, Priority level) {
        switch(level) {
        case LOW:
            System.out.println(colour + " indicates low priority");
            break;
        case MEDIUM:
            System.out.println(colour + " indicates medium priority");
            break;
        case HIGH:
            System.out.println(colour + " indicates high priority");
            break;
        }
    }

    public static void main(String[] args) {
        describe("Red", Priority.HIGH);
        describe("Orange", Priority.MEDIUM);
        describe("Blue", Priority.MEDIUM);
        describe("Green", Priority.LOW);
    }
}
