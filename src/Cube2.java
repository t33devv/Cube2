public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
        this.color = "black";
    }

    public Cube2(int side, String color) {
        this();
        basicCube.setSide(side);
        this.color = color;
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public void setSide(int side) {
        basicCube.setSide(side);
    }

    //the following methods have been started for you, but need to be completed
    public int calculateVolume() { return basicCube.calculateVolume();}
    public int calculateSurfaceArea() { return basicCube.calculateSurfaceArea();}
    public Cube2 add(Cube2 otherCube) {
        boolean pyth = Math.sqrt(this.getSide() * this.getSide() + otherCube.getSide() * otherCube.getSide()) % 1 == 0;
        if (!pyth) {
            throw new IllegalArgumentException();
        }

        return new Cube2((int) Math.sqrt(this.getSide() * this.getSide() + otherCube.getSide() * otherCube.getSide()), this.getColor());
    }


    public Cube2 minus(Cube2 otherCube) {
        boolean pyth = Math.sqrt(this.getSide() * this.getSide() - otherCube.getSide() * otherCube.getSide()) % 1 == 0;
        if (!pyth) {
            throw new IllegalArgumentException();
        }

        return new Cube2((int) Math.sqrt(this.getSide() * this.getSide() - otherCube.getSide() * otherCube.getSide()), this.getColor());
    }



    public boolean equals(Cube2 otherCube) {
        if (otherCube.getSide() == this.getSide()) {
            if (otherCube.getColor().equals(this.getColor())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Cube{side=" + this.getSide() + ", color=\"" + this.getColor() + "\"}";
    }

    public String getColor() {
        return color;
    }
}
