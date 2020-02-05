package modele;

public class Mur extends GameElement{
	
	public Mur()
	{
		setPng("bloc.png");
	}

	@Override
	public String getNomChose() {
		return "  Mur  ";
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
