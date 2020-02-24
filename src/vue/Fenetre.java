package vue;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import controller.MonEcouteur;
import controller.WorldRenderer;
import modele.World;

public class Fenetre implements Screen {
    SpriteBatch batch;
    World world;
    WorldRenderer worldRenderer;
    float deltaTime;

    public Fenetre(World world)
    {
        this.world=world;
        world.imprimeMondeConsole();
        worldRenderer = new WorldRenderer(world);
        Gdx.input.setInputProcessor(new MonEcouteur(worldRenderer,world));
        batch = new SpriteBatch();
    }

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
                x=x+21;
            }
            y=y+21;
            x=0;
        }
        batch.end();
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float v) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        afficherTerrain(world);
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
