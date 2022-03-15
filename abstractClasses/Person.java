package abstractClasses;

public abstract class Person {
    public abstract String getDescription1();
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
