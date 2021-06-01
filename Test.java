public class Test {

    public static MessageBus mb;
    public static Publisher pub;
    public static Subscriber sub;

    public static void main(String[] args) {
        // create message bus
        mb = new MessageBus();

        // create subscriber
        sub = new Subscriber();

        // create publisher
        pub = new Publisher();

        // TODO wire together

        // test
        test();
    }

    public static test() {
        String message = "This is a test";
        System.out.println("Test send of message "+message);

        pub.publish(message);

    }
}
