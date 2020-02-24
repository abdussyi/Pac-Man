package modele;

public class Pellet extends GameElement {
	
	
	
	public Pellet()
	{
		setPng("images/pellet.png");
	}
	
	
	
	public void setPng(String repertoirePng)
	{
		png=repertoirePng;
	}

	@Override
	public String getNomChose() {
		return " pllt  ";
	}

	@Override
	public String getPng() {

		return png;
	}
	
}
