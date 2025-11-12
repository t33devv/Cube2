public class Cube {

    private int side;

    public Cube() {
        side = 1;
    }

    public Cube(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        } else {
            this.side = side;
        }
    }

    int getSide() {
        return this.side;
    }

    void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube side length cannot be less than 1!");
        } else {
            this.side = side;
        }
    }

    int calculateSurfaceArea() {
        int surfaceArea = this.side * this.side * 6;
        return surfaceArea;
    }

    int calculateVolume() {
        int surfaceArea = this.side * this.side * this.side;
        return surfaceArea;
    }

    @Override
    public String toString() {
        return "Cube{side=" + this.side + "}";
    }

}
