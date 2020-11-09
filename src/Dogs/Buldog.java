package Dogs;

public class Buldog extends Dog{

    public Buldog(String name, int age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
        hp=10;
    }

    public void golos(){
        System.out.println("Gav");
    }


    @Override
    void sleep() {
        hp+=10;
    }

    @Override
    void eat() {
        hp+=20;
    }

    @Override
    public String toString() {
        return "Buldog{" +
                "name='" + name + '\'' +", "+ "age="+age+
                ", color='" + color + '\'' +
                '}';
    }
}
