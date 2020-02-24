package modele;

public class SuperPellet extends GameElement {
	
	
	
	public SuperPellet()
	{
		setPng("images/superpellet.png");
	}
	
	
	
	public void setPng(String repertoirePng)
	{
		png=repertoirePng;
	}

	@Override
	public String getNomChose() {
		return "sprpllt";
	}

	@Override
	public String getPng() {
		// TODO Auto-generated method stub
		return png;
	}
	
}
