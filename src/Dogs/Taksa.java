package Dogs;

public class Taksa extends Dog{

    public Taksa(String name, int age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
        hp=10;
    }
    @Override
    void sleep() {
        hp+=10;
    }

    @Override
    void eat() {
        hp+=15;
    }

    @Override
    public String toString() {
        return "Taksa{" +
                "name='" + name + '\'' +", "+ "age="+age+
                ", color='" + color + '\'' +
                '}';
    }
}
