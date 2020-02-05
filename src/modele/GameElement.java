package modele;

//il se peut que ce soit une interface, affaire à suivre
public abstract class GameElement {
	
	protected String png;
	public abstract void setPng(String repertoirePng);
	public abstract String getNomChose();
	public abstract String getPng();
}
