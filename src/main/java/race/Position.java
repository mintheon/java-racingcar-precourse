package race;

public class Position implements Comparable<Position> {
    private int position;

    public Position() {
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void increasePosition() {
        position++;
    }

    @Override
    public int compareTo(Position target) {
        return this.position - target.position;
    }
}
