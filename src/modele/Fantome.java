package modele;

public class Fantome extends GameElement{
	
	Fantome()
	{
		setPng("images/ghost1");
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
