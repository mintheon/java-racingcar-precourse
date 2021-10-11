package racinggame.domain;

public class Position implements Comparable<Position> {
    private int position;

    public Position() {
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void increase() {
        position++;
    }

    @Override
    public int compareTo(Position target) {
        return position - target.position;
    }
}
