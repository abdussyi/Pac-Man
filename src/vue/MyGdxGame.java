package vue;


//on peut dire que cette classe est le jeu
import com.badlogic.gdx.Game;

import com.badlogic.gdx.graphics.FPSLogger;

import modele.World;

public class MyGdxGame extends Game {
	FPSLogger fpsLogger;

	World world;
	
	@Override
	public void create () {

		world = new World("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/monde.csv");

		setScreen(new Fenetre(world));
	}
	


	//il faudrait peut etre creer world en boucle ici
	@Override
	public void render () {
		super.render();
	}

}
