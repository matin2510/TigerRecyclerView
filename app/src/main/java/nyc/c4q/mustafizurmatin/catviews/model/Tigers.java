package nyc.c4q.mustafizurmatin.catviews.model;

/**
 * Created by c4q on 11/11/17.
 */

public class Tigers {
    String breed;
    int size;
    String color;

    public Tigers(String breed, String color,int size) {
        this.breed = breed;
        this.color=color;
        this.size=size;
    }

    public String getBreed() {
        return breed;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
