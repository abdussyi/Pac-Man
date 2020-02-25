package modele;

public class Pacman extends MovingGameElement{
	
	private int l, c;
	Direction direction;
	
	public Pacman()
	{
		setPng("images/pacmanRight.png");
		l =0;
		c =0;
		setDirection(Direction.Neutre);
	}
	
	public void setCoord(int x,int y)
	{
		setL(x);
		setC(y);
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Direction getDirection() {
		return direction;
	}

	public int getL() {
		return l;
	}
	public void setL(int x) {
		this.l = x;
	}
	public int getC() {
		return c;
	}
	public void setC(int y) {
		this.c = y;
	}
	@Override
	public String getNomChose() {
		return "PacMan ";
	}

	@Override
	public void setPng(String repertoirePng) {
		png=repertoirePng;
	}

	@Override
	public String getPng() {
		return png;
	}
	

}
