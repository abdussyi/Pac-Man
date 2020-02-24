package vue;


//on peut dire que cette classe est le jeu
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import controller.MonEcouteur;
import controller.WorldRenderer;
import modele.World;

public class MyGdxGame extends Game {


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
