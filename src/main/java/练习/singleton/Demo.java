package 练习.singleton;

public class Demo {
    public static void main(String[] args) {
        Singleton uniqueInstance = Singleton.getUniqueInstance();
        System.out.println("uniqueInstance = " + uniqueInstance);

        Long id;
        IdGeneratorV1 instance1 = IdGeneratorV1.getInstance();
        id = instance1.getId();
        IdGeneratorV2 instance2 = IdGeneratorV2.getInstance();
        id = instance2.getId();

    }
}
