package modele;

public enum Direction {
    Neutre(0), Left(1), Right(2), Up(3), Down(4);
    int direction;

    Direction( int d){
        direction = d;
    }

    public int getDirection(){
        return direction;
    }

    public void setDirection(int d){
        direction = d;
    }
}
