package controller;

import modele.Mur;
import modele.World;

//S'assure de l'affichage du monde sur le screen courant
public class WorldRenderer {
	
	World world;
	boolean left,right,up,down;
	
	public WorldRenderer(World world)
	{
		this.world=world;
		left=false;
		right=false;
		up=false;
		down=false;
		setMooveallowed(false);
	}
	private boolean mooveallowed;

	public boolean isMooveallowed() {
		return mooveallowed;
	}

	public void setMooveallowed(boolean mooveallowed) {
		this.mooveallowed = mooveallowed;
	}


	public void deplacementPacmanGauche(World world)
	{
		int x=world.pacman.getL();//futur coordonnée de 2pac
		int y=world.pacman.getC()-1;
		if(x<0||x>30||y<0||y>27)
		{
			world.pacman.setDirY(0);
			setMooveallowed(false);
			throw new IllegalArgumentException("Les coordonnée de pacman sont irrealisable");
		}
		if(world.getMonde()[x][y] instanceof Mur )
		{
			world.pacman.setDirY(0);
			setMooveallowed(false);
			throw new IllegalArgumentException("Impossible de franchir le mur");
		}
		setMooveallowed(true);
		world.pacman.setDirY(-1);
		world.pacman.setDirX(0);
		world.setPacmanPosition(x, y);
	}
	
	public void deplacementPacmanDroite(World world)
	{
		int x=world.pacman.getL();//futur coordonnée de 2pac
		int y=world.pacman.getC()+1;
		if(x<0||x>30||y<0||y>27)
		{
			setMooveallowed(false);
			world.pacman.setDirY(0);
			throw new IllegalArgumentException("Les coordonnée de pacman sont irrealisable");
		}
		if(world.getMonde()[x][y] instanceof Mur )
		{
			setMooveallowed(false);
			world.pacman.setDirY(0);
			throw new IllegalArgumentException("Impossible de franchir le mur");
		}
		setMooveallowed(true);
		world.pacman.setDirY(1);
		world.pacman.setDirX(0);
		world.setPacmanPosition(x, y);
	}
	
	public void deplacementPacmanHaut(World world)
	{
		int x=world.pacman.getL()-1;//futur coordonnée de 2pac
		int y=world.pacman.getC();
		if(x<0||x>30||y<0||y>27)
		{
			world.pacman.setDirX(1);
			setMooveallowed(false);
			throw new IllegalArgumentException("Les coordonnée de pacman sont irrealisable");
		}
		if(world.getMonde()[x][y] instanceof Mur )
		{
			world.pacman.setDirX(0);
			setMooveallowed(false);
			throw new IllegalArgumentException("Impossible de franchir le mur");
		}
		setMooveallowed(true);
		world.pacman.setDirX(1);
		world.pacman.setDirY(0);
		world.setPacmanPosition(x, y);
	}
	
	public void deplacementPacmanBas(World world)
	{
		int x=world.pacman.getL()+1;//futur coordonnée de 2pac
		int y=world.pacman.getC();
		if(x<0||x>30||y<0||y>27)
		{
			world.pacman.setDirX(0);
			setMooveallowed(false);
			throw new IllegalArgumentException("Les coordonnée de pacman sont irrealisable");
		}
		if(world.getMonde()[x][y] instanceof Mur )
		{
			world.pacman.setDirX(0);
			setMooveallowed(false);
			throw new IllegalArgumentException("Impossible de franchir le mur");
		}
		world.pacman.setDirX(-1);
		world.pacman.setDirY(0);
		setMooveallowed(true);

		world.setPacmanPosition(x, y);
	}


	//il faudrait une fonction qui puisse verifier si on peut deplacer 2pac, histoire d'eviter les exceptions
	public void updatePacman()
	{
		try {
			switch (world.pacman.getDirection())
			{
				case Left:
					deplacementPacmanGauche(world);
					break;
				case Up:
					deplacementPacmanHaut(world);
					break;
				case Down:
					deplacementPacmanBas(world);
					break;
				case Right:
					deplacementPacmanDroite(world);
					break;
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}