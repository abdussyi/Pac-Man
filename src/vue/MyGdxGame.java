package vue;


//on peut dire que cette classe est le jeu
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import controller.MonEcouteur;
import controller.WorldRenderer;
import modele.World;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	World world;
	WorldRenderer worldRenderer;
	OrthographicCamera camera;
	float deltaTime;
	
	public void afficherTerrain(World world)
	{
		batch.begin();
		int i,j;
		int x=0;
		int y=0;
		for(i=30;i>=0;i--)
		{

			for(j=0;j<28;j++)
			{
				Texture temp = TextureFactory.getInstance().getTextureSelonNom(world.getMonde()[i][j].getPng());
				batch.draw(temp, x, y);
				x=x+27;
			}
			y=y+27;
			x=0;
		}
		batch.end();
	}
	
	
	public void EventDeplacement()
	{
		//cette fonction qui tournera en boucle dans le render permettra de deplacer notre Pacman OLD ////// OLD
		//Il devra capter d'une facon ou d'une autre les touches appuy� sur le clavier OLD ////// OLD
		//Cette fonction detecte un evenement de touche, envoie cette information au controller
		boolean isRightPressed = Gdx.input.isKeyPressed(Keys.RIGHT);
		
	}
	
	@Override
	public void create () {
		world = new World("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/monde.csv");
		world.imprimeMondeConsole();
		worldRenderer = new WorldRenderer(world);
		Gdx.input.setInputProcessor(new MonEcouteur (worldRenderer,world));
		camera=new OrthographicCamera();
		
		batch = new SpriteBatch();
		
	}
	
	@Override
	public void resize(int width, int height)
	{
		camera.setToOrtho(false,width,height);
	}

	//il faudrait peut etre creer world en boucle ici
	@Override
	public void render () {
		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix(camera.combined);
		afficherTerrain(world);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
