package CreationalDesignPatterns.Singleton;

public class TestSingleton {

    /**
     * Since getInstance returns the same instance all the time, the hashcode will match in the two print statements
     **/
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}
