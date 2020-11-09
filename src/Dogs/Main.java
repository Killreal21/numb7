package Dogs;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Buldog buldog=new Buldog("Max",1,"braun");
        System.out.println(buldog);
        buldog.golos();
        Taksa taksa=new Taksa("Rex",5,"black");
        System.out.println(taksa);
        taksa.sleep();
        buldog.eat();
        System.out.println("buldog hp="+buldog.hp);
        System.out.println("taksa hp="+taksa.hp);
    }
}
