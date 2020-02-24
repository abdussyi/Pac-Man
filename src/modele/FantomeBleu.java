package modele;

public class FantomeBleu extends GameElement{
	
	FantomeBleu()
	{
		setPng("images/ghost4.png");
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
