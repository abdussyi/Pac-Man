package vue;

import com.badlogic.gdx.graphics.Texture;

//Cette classe est un singleton
public class TextureFactory {
	
	
	
	Texture tabTexture[];
	
	/**
     * une seule instance de TextureFactory car c'est un singleton
     */
    private static TextureFactory instance;
    
    
    
    public static TextureFactory getInstance() {
        if (instance == null) {
            instance = new TextureFactory();
        }
        return instance;
    }
    
	public TextureFactory()
	{
		tabTexture = new Texture[20];
		tabTexture[0] = new Texture("bloc.png");
		tabTexture[1] = new Texture("images/dark.png");
		tabTexture[2] = new Texture("images/pellet.png");
		tabTexture[3] = new Texture("images/ghost1.png");
		tabTexture[4] = new Texture("images.ghost2.png");
		tabTexture[5] = new Texture("images/ghost3.png");
		tabTexture[6] = new Texture("images/ghost4.png");
		tabTexture[7] = new Texture("images/superpellet.png");
		tabTexture[8] = new Texture("images/ghostDead.png");
		tabTexture[9] = new Texture("images/ghostEspacing.png");
		tabTexture[10] = new Texture("images/pacman-3.png");
		tabTexture[11] = new Texture("images/pacmanDown.png");
		tabTexture[12] = new Texture("images/pacmanDown-2.png");
		tabTexture[13] = new Texture("images/pacmanLeft.png");
		tabTexture[14] = new Texture("images/pacmanLeft-2.png");
		tabTexture[15] = new Texture("images/pacmanRight.png");
		tabTexture[16] = new Texture("images/pacmanRight-2.png");
		tabTexture[17] = new Texture("images/pacmanUp.png");
		tabTexture[18] = new Texture("images/pacmanUp-2.png");
		tabTexture[19] = new Texture("images/superpellet-2.png");
	}

	public Texture[] getTabTexture() {
		return tabTexture;
	}

	public void setTabTexture(Texture[] tabTexture) {
		this.tabTexture = tabTexture;
	}
	
	
	
}