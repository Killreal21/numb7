package dishes;

public class Plate extends Dish{

    int radius;
    int deep;
    double volume;

    @Override
    void clearing() {
        clear++;
    }

    public Plate(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
        calcVolume();
    }

    @Override
    public void calcVolume() {
        volume = radius * deep;
    }


}