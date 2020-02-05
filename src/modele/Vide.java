package modele;

public class Vide extends GameElement {
	
	public Vide()
	{
		setPng("images/dark.png");
	}

	@Override
	public String getNomChose() {
		return " Vide  ";
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
