package controller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

import modele.Direction;
import modele.World;

public class MonEcouteur implements InputProcessor {
	
	WorldRenderer worldRenderer;
	World world;
	
	public MonEcouteur(WorldRenderer worldRenderer, World world)
	{
		this.worldRenderer = worldRenderer;
		this.world = world;
	}
	
	
	//cette fonction devrait set seulement la direction
	@Override
	public boolean keyDown(int keycode) {
		try {
			//selon la touche appuyer, pacman sera déplacé je sais pas ou
			switch (keycode) {
			case Keys.LEFT:
				world.pacman.setPng("images/pacmanLeft.png");
				//while(!(Gdx.input.isKeyPressed(Keys.RIGHT))||!(Gdx.input.isKeyPressed(Keys.UP))||!(Gdx.input.isKeyPressed(Keys.DOWN)))
					//worldRenderer.deplacementPacmanGauche(world);
				world.pacman.setDirection(Direction.Left);
				break;
			case Keys.RIGHT:
				world.pacman.setPng("images/pacmanRight.png");
				//worldRenderer.deplacementPacmanDroite(world);
				world.pacman.setDirection(Direction.Right);
				break;
			case Keys.UP:
				world.pacman.setPng("images/pacmanUp.png");
				//worldRenderer.deplacementPacmanHaut(world);
				world.pacman.setDirection(Direction.Up);
				break;
			case Keys.DOWN:
				world.pacman.setPng("images/pacmanDown.png");
				//worldRenderer.deplacementPacmanBas(world);
				world.pacman.setDirection(Direction.Down);
				break;
			}
		} catch (IllegalArgumentException e) {
			
		}
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
