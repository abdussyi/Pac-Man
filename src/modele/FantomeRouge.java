package modele;

public class FantomeRouge extends GameElement{
	
	FantomeRouge()
	{
		setPng("images/ghost1.png");
	}
	@Override
	public String getNomChose() {
		return "Fantome";
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
