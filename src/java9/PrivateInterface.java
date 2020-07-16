package java9;

public interface PrivateInterface {
    
    private static String staticPrivate() {
        return "static private";
    }
    
    private String instancePrivate() {
        return "instance private";
    }
    
    default void check() {
        String result = staticPrivate();
        PrivateInterface pvt = new PrivateInterface() {
            // anonymous class
        };
        result = pvt.instancePrivate();
    }
}


