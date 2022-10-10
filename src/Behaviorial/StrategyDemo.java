package Behaviorial;

class GameSolver {

    static Position userMakeMove(ChessMoveStrategy strategy, Position position) {
        return strategy.makeMove(position);
    }
}

class Game {
    public static void main(String[] args) {

        Position pos = GameSolver.userMakeMove(new HumanChessMoveStrategy(),new Position(1,2));
        System.out.println("Human Makes Move to "+ pos.getX()+" "+ pos.getY());

        Position pos1= GameSolver.userMakeMove(new ComputerChessMoveStrategy(),new Position(11,21));
        System.out.println("Comp Makes Move "+ pos1.getX()+" "+ pos1.getY());
    }
}


class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

interface ChessMoveStrategy {
    Position makeMove(Position position);
}

class HumanChessMoveStrategy implements ChessMoveStrategy {
    @Override
    public Position makeMove(Position postion) {
        System.out.println("Human user Moves");
        return new Position(postion.getX(), postion.getY());
    }
}

class ComputerChessMoveStrategy implements ChessMoveStrategy {
    @Override
    public Position makeMove(Position position) {
        System.out.println("Computer user moves");
        return new Position(position.getX() + 1, position.getY() + 2);
    }
}







