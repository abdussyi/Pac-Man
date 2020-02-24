package modele;

public class Pacman extends GameElement{
	
	private int x,y;
	
	
	public Pacman()
	{
		setPng("images/pacmanRight.png");
		x=0;
		y=0;
	}
	
	public void setCoord(int x,int y)
	{
		setX(x);
		setY(y);
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
