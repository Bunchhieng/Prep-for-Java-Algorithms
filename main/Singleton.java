/**
 * Intent: 
 *      - Ensure a class has only one instance, and provide a global point of access of it
 *      - Encapsulated "just-in-time intitialization" or "intitialization on first use"
 */
public class Singleton {
    // Private constructor prevents instantiation from other classes
    private Singleton() {}

    /**
     * SingletonHolder is loaded on the first execution of 
     * Singleton.getInstance() or the first access to 
     * SingletonHolder.INSTANCE, not before
     */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
