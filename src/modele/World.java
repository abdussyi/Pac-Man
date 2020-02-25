package modele;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import vue.TextureFactory;

public class World {
	//Les champs
	// 28 colonne et 31 lignes
	private final static int COLONNES = 28;
	private final static int LIGNES = 31;
	private int ligneCourante, colonneCourante;
	private GameElement monde[][];
	public Pacman pacman;
	
	public World(String repertoireFichierMonde)
	{
		ligneCourante = 0;
		colonneCourante = 0;
		monde = new GameElement[LIGNES][COLONNES];
		//changer le try catch ici
		try {
			chargeurMondeDepuisFichiers(repertoireFichierMonde);
		} catch (IOException e) {
			e.printStackTrace();
		}

		//L'emplacement du pacman est faites manuellemeent
		pacman = new Pacman();
		//monde[23][14]=pacman;
		pacman.setCoord(23, 14);
	}
	
	public void setPacmanPosition(int x,int y)
	{
		pacman.setX(x);
		pacman.setY(y);
		//monde[x][y]=pacman;
	}
	
	public GameElement[][] getMonde() {
		return monde;
	}

	public void setMonde(GameElement[][] monde) {
		this.monde = monde;
	}
	
	public void setUneCaseMonde(int ligne, int colonne,GameElement chose)
	{
		getMonde()[ligne][colonne]=chose;
	}

	/*La ligne courante permet la construction de la grille du world un à un*/
	public void augmenterLigneColonneCourante()
	{
		if(colonneCourante != 27)
		{
			colonneCourante++;
		}
		else if(ligneCourante != 30)
		{
			ligneCourante++;
			colonneCourante=0;
		}
	}
	
	
	public void chargeurMondeDepuisFichiers(String repertoieFichier) throws IOException
	{
		
		//ces deux premieres variables permettent de remplir efficacement le tableau
		File csvFile = new File(repertoieFichier);
		if (csvFile.isFile()) {
			BufferedReader csvReader = new BufferedReader(new FileReader(repertoieFichier));
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(";");
			    for(int i =0;i<data.length;i++)
			    {
			    	int bitte = Integer.parseInt(data[i]);
			    	switch (bitte)
			    	
			    	{
			    	//on dessine un mur
			    	case 1 : setUneCaseMonde(ligneCourante,colonneCourante,new Mur());
			    	augmenterLigneColonneCourante();
			    	break;
			    	
			    	case 0 : setUneCaseMonde(ligneCourante,colonneCourante,new Vide());
			    	augmenterLigneColonneCourante();
			    	break;
			    	
			    	case 3 : setUneCaseMonde(ligneCourante,colonneCourante,new FantomeRouge());
			    	augmenterLigneColonneCourante();
			    	break;
			    	
			    	case 2 : setUneCaseMonde(ligneCourante,colonneCourante,new SuperPellet());
			    	augmenterLigneColonneCourante();
			    	break;
			    	
			    	case 4 : setUneCaseMonde(ligneCourante,colonneCourante,new Pellet());
			    	augmenterLigneColonneCourante();
			    	break;
			    	
			    	case 5 : setUneCaseMonde(ligneCourante,colonneCourante,new FantomeRose());
			    	augmenterLigneColonneCourante();
			    	break;
			    	
			    	case 6 : setUneCaseMonde(ligneCourante,colonneCourante,new FantomeBleu());
			    	augmenterLigneColonneCourante();
			    	break;

			    	case 7 : setUneCaseMonde(ligneCourante,colonneCourante,new FantomeJaune());
			    	augmenterLigneColonneCourante();
			    	break;
			    	}
			    }
			}
			csvReader.close();
		}
		else
			throw new IOException("Fichiers inaccessible");
	}
	
	public void imprimeMondeConsole()
	{
		for(int l=0;l<LIGNES;l++)
		{
			for(int c=0;c<COLONNES;c++)
			{
				System.out.print("["+getMonde()[l][c].getNomChose()+"]");
			}
			System.out.print("\n");
		}
	}
}
