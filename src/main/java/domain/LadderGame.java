package domain;

public class LadderGame {
    private final Players players;
    private final Ladder ladder;

    public LadderGame(Players players, Ladder ladder) {
        this.players = players;
        this.ladder = ladder;
    }

    public boolean moveRight(Line line, Position position) {
        if (position.getIndex() == line.getPointsSize()) {
            return false;
        }
        if (line.isMovablePoint(position.getIndex())) {
            position.moveRight();
            return true;
        }
        return false;
    }

    public boolean moveLeft(Line line, Position position) {
        if (position.getIndex() == 0) {
            return false;
        }
        if (line.isMovablePoint(position.getIndex() - 1)) {
            position.moveLeft();
            return true;
        }
        return false;
    }

    public void move(Line line, Position position) {
        if (moveRight(line, position)) {
            return;
        }
        moveLeft(line, position);
    }

}