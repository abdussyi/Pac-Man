package modele;

public class MovingGameElement extends GameElement {
    @Override
    public void setPng(String repertoirePng) {

    }

    Direction direction;

    @Override
    public String getPng() {
        return null;
    }


    @Override
    public String getNomChose() {
        return null;
    }

    public Direction getDirection(){ return direction;}
    public void setDirection(Direction d){ direction = d;}
}
