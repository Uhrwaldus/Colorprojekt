public class Colours {
    int r;
    int g;
    int b;

    public Colours(int red, int green, int blue) {
        set(red, green, blue);


    }

    //sets default black(Default constructor)
    public Colours() {
        this.r = 0;
        this.g = 0;
        this.b = 0;

    }

    //copy
    public Colours(Colours copy) {
        set(copy.r, copy.g, copy.b);


    }
//uses normalize to make a minimum and maximum number
    public void set(int r, int g, int b) {
        int r2 = normalize(r);
        int g2 = normalize(g);
        int b2 = normalize(b);

        this.r = r2;
        this.g = g2;
        this.b = b2;


    }
//Return RED GREEN BLUE OR BLACk, if neither return colourcode
    public String toString() {
        if (this.r == 255 && this.g == 0 && this.b == 0) {
            return "[RED]";

        }
        if (this.r == 0 && this.g == 255 && this.b == 0) {
            return "[GREEN]";

        }
        if (this.r == 0 && this.g == 0 && this.b == 255) {
            return "[BLUE]";

        }
        if (this.r == 0 && this.g == 0 && this.b == 0) {
            return "[BLACK]";

        }
        return String.format("[%d, %d, %d]", this.r, this.g, this.b);
}

    //checks from copy constructor compares, and gives false or true statement
    public boolean equals(Colours copy) {
        return this.r == copy.r && this.g == copy.g && this.b == copy.b;
    }

    private int normalize(int value) {
        if (value < 0) {
            return 0;
        }
        if (value > 255) {
            return 255;
        }


        return value;
    }
}
