package vue;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



import controller.MonEcouteur;
import controller.WorldRenderer;
import modele.World;

public class Fenetre implements Screen {
    SpriteBatch batch;
    World world;
    WorldRenderer worldRenderer;


    //pour le pacman
    private float elapsedTime=0;

    public int getCpt() {
        return cpt;
    }

    private int cpt = 0;
    //.04f est le temps
    private final float frameLength = .07f;
    //on peut untiliser une animation pour la bouche de pacman

    private int xtoadd=0;
    private int ytoadd=0;

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

    }

    //à voir si le deplacer dans world renderer n'est pas plus approprié
    private void handleFrame(float delta) {
        elapsedTime += delta;
        while (elapsedTime > frameLength) {
            cpt = (cpt + 1) % 4;
            elapsedTime -= frameLength;
            if (cpt == 0) worldRenderer.updatePacman();
        }
    }

    public void dessinerPacman()
    {
        //ici faut faire le changement de texture changement de texture
        int x = (30 - world.pacman.getL())*21;
        int y = world.pacman.getC()*21;
        world.pacman.setNextTextureDuMoment(cpt);

        xtoadd = (int)(world.pacman.getDirL() * ((cpt) * 21 / 4));
        ytoadd = (int)(world.pacman.getDirC() * ((cpt) * 21 / 4));

        if (worldRenderer.isMooveallowed())
        {
            System.out.println(x);
            System.out.println(y);
            x+= xtoadd;
            y+= ytoadd;
            System.out.println(x);
            System.out.println(y);
        }

        //à revoir ce coin
        Texture temp = world.pacman.getTextureDuMoment();


        //conversion en coordonnees ecran

        batch.draw(temp,y,x);
        //batch.draw(temp, y*21,(30-x)*21 );
        //batch.draw(temp,y*21,(30-x)*21, 21, 21);

    }



    @Override
    public void show() {

    }




    /*
    ici, à ma grande stupefaction, le delta est deja initialisé par le systeme.
    Delta est le temps qui est passé depuis le dernier render(en seconde evidement)
    */
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        handleFrame(delta);
        batch.begin();
        DessinerTerrain(world);

        dessinerPacman();
        batch.end();
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
