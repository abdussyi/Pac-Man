package modele;

public class Bouffe extends GameElement {
	
	
	
	public Bouffe()
	{
		setPng("images/superpellet.png");
	}
	
	
	
	public void setPng(String repertoirePng)
	{
		png=repertoirePng;
	}
	
	@Override
	public String getNomChose() {
		return "Bouffe ";
	}

	@Override
	public String getPng() {
		// TODO Auto-generated method stub
		return png;
	}
	
}
