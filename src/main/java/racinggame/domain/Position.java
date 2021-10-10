package racinggame.domain;

public class Position {
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
}
