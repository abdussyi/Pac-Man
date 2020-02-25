package modele;

public class FantomeRose extends MovingGameElement{
	
	FantomeRose()
	{
		setPng("images/ghost2.png");
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
