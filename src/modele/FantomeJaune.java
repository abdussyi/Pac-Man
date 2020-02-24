package modele;

public class FantomeJaune extends GameElement{
	
	FantomeJaune()
	{
		setPng("images/ghost3.png");
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
