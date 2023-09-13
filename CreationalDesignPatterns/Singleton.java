package CreationalDesignPatterns;


public class Singleton {

    /**
     * Only Static variables can be accessed from a static method
     */
    private static Singleton singleton;

    private Singleton() {
    }

    /**
     * Defining the method as Static
     * so that getInstance method can be accessed without creating an instance of CreationalDesignPatterns.Singleton Class
     */
    public synchronized static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


    /**
     * Both Singleton and static are stored on the Heap memory,
     * but static classes are stored in a special area of the Heap Memory called the High-Frequency Heap
     * (Objects in High Frequency Heap are not garbage collected by GC,
     * and hence static members are available throughout the application lifetime).*/
}






