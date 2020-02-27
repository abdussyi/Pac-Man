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
			switch (keycode) {
			case Keys.LEFT:
				if (world.pacman.getDirection()!=Direction.Neutre)
					world.pacman.setProchaineDirection(Direction.Left);
				else
					world.pacman.setDirection(Direction.Left);
				break;
			case Keys.RIGHT:
				if (world.pacman.getDirection()!=Direction.Neutre)
					world.pacman.setProchaineDirection(Direction.Right);
				else
					world.pacman.setDirection(Direction.Right);
				break;
			case Keys.UP:
				if (world.pacman.getDirection()!=Direction.Neutre)
					world.pacman.setProchaineDirection(Direction.Up);
				else
					world.pacman.setDirection(Direction.Up);
				break;
			case Keys.DOWN:
				if (world.pacman.getDirection()!=Direction.Neutre)
					world.pacman.setProchaineDirection(Direction.Down);
				else
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
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}
	
}
