package vue;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import controller.MonEcouteur;
import controller.WorldRenderer;
import modele.World;

public class Fenetre implements Screen {
    SpriteBatch batch;
    World world;
    WorldRenderer worldRenderer;
    float deltaTime;
    //on peut untiliser une animation pour la bouche de pacman
    Animation anil;
    public Fenetre(World world)
    {
        this.world=world;
        world.imprimeMondeConsole();
        worldRenderer = new WorldRenderer(world);
        Gdx.input.setInputProcessor(new MonEcouteur(worldRenderer,world));
        batch = new SpriteBatch();
    }

    public void DessinerTerrain(World world)
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
                x=x+21;
            }
            y=y+21;
            x=0;
        }
        batch.end();
    }

    public void dessinerPacman()
    {
        int x = world.pacman.getX();
        int y = world.pacman.getY();
        batch.begin();
        //à revoir ce coin
        Texture temp = TextureFactory.getInstance().getTextureSelonNom(world.pacman.getPng());
        //conversion en coordonnees ecran
        batch.draw(temp, y*21,(30-x)*21 );
        batch.end();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        DessinerTerrain(world);

        dessinerPacman();
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {

    }
}
