class Singleton{
    private Singleton(){
        System.out.println("Instance is created");
    }

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}

public class SingletonDemo {
    public static void main(String[] args) {
        // Singleton obj = Singleton.getInstance();
    }
}
