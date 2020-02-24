package controller;

import modele.GameElement;
import modele.Mur;
import modele.Pacman;
import modele.Pellet;
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
	}
	
	public void updateDuPacman(World world)
	{
		
	}
	/*
	 public void updatePosition(float deltaTime) {
	        switch (mCurrentDirection) {
	            case LEFT:
	                mPosition.x -= (mSpeed * deltaTime);
	                break;
	            case RIGHT:
	                mPosition.x += (mSpeed * deltaTime);
	                break;
	            case UP:
	                mPosition.y -= (mSpeed * deltaTime);
	                break;
	            case DOWN:
	                mPosition.y += (mSpeed * deltaTime);
	                break;
	        }
	    }
	*/
	public void deplacementPacmanGauche(World world)
	{
		int x=world.pacman.getX();//futur coordonnée de 2pac
		int y=world.pacman.getY()-1;
		if(x<0||x>30||y<0||y>27)
			throw new IllegalArgumentException("Les coordonnée de pacman sont irrealisable");
		if(world.getMonde()[x][y] instanceof Mur )
			throw new IllegalArgumentException("Impossible de franchir le mur");
		//ici une fonction devrait update le terrain selon le deplacement
		
		world.getMonde()[world.pacman.getX()][world.pacman.getY()]=new Pellet();
		
		world.setPacmanPosition(world.pacman.getX(), world.pacman.getY()-1);
	}
	
	public void deplacementPacmanDroite(World world)
	{
		int x=world.pacman.getX();//futur coordonnée de 2pac
		int y=world.pacman.getY()+1;
		if(x<0||x>30||y<0||y>27)
			throw new IllegalArgumentException("Les coordonnée de pacman sont irrealisable");
		if(world.getMonde()[x][y] instanceof Mur )
			throw new IllegalArgumentException("Impossible de franchir le mur");
		//ici une fonction devrait update le terrain selon le deplacement
		
		world.getMonde()[world.pacman.getX()][world.pacman.getY()]=new Pellet();
		world.setPacmanPosition(world.pacman.getX(), world.pacman.getY()+1);
	}
	
	public void deplacementPacmanHaut(World world)
	{
		int x=world.pacman.getX()-1;//futur coordonnée de 2pac
		int y=world.pacman.getY();
		if(x<0||x>30||y<0||y>27)
			throw new IllegalArgumentException("Les coordonnée de pacman sont irrealisable");
		if(world.getMonde()[x][y] instanceof Mur )
			throw new IllegalArgumentException("Impossible de franchir le mur");
		//ici une fonction devrait update le terrain selon le deplacement
		
		world.getMonde()[world.pacman.getX()][world.pacman.getY()]=new Pellet();
		
		world.setPacmanPosition(world.pacman.getX()-1, world.pacman.getY());
	}
	
	public void deplacementPacmanBas(World world)
	{
		int x=world.pacman.getX()+1;//futur coordonnée de 2pac
		int y=world.pacman.getY();
		if(x<0||x>30||y<0||y>27)
			throw new IllegalArgumentException("Les coordonnée de pacman sont irrealisable");
		if(world.getMonde()[x][y] instanceof Mur )
			throw new IllegalArgumentException("Impossible de franchir le mur");
		//ici une fonction devrait update le terrain selon le deplacement
		
		world.getMonde()[world.pacman.getX()][world.pacman.getY()]=new Pellet();
		
		world.setPacmanPosition(world.pacman.getX()+1, world.pacman.getY());
	}
}