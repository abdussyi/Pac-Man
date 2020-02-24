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
    
	private TextureFactory()
	{
		tabTexture = new Texture[20];
		tabTexture[0] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/bloc.png");
		tabTexture[1] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/dark.png");
		
		tabTexture[2] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/pellet.png");
		
		tabTexture[3] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/ghost1.png");
		
		tabTexture[4] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/ghost2.png");
		
		tabTexture[5] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/ghost3.png");
		
		tabTexture[6] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/ghost4.png");
		
		tabTexture[7] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/superpellet.png");
		
		tabTexture[8] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/ghostDead.png");
		
		tabTexture[9] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/ghostEscaping.png");
		
		tabTexture[10] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/pacman-3.png");
		
		tabTexture[11] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/pacmanDown.png");
		
		tabTexture[12] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/pacmanDown-2.png");
		
		tabTexture[13] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/pacmanLeft.png");
		
		tabTexture[14] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/pacmanLeft-2.png");
		
		tabTexture[15] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/pacmanRight.png");
		
		tabTexture[16] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/pacmanRight-2.png");
		
		tabTexture[17] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/pacmanUp.png");
		
		tabTexture[18] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/pacmanUp-2.png");
		
		tabTexture[19] = new Texture("/Users/samet/Downloads/LibGDX_mon_pacman/LibGDX/Projet/core/assets/images/superpellet-2.png");
	}

	public Texture[] getTabTexture() {
		return tabTexture;
	}

	public void setTabTexture(Texture[] tabTexture) {
		this.tabTexture = tabTexture;
	}
	
	public Texture getTextureSelonNom(String png)
	{
		if(png.equals("bloc.png"))
			return tabTexture[0];
		
		if(png.equals("images/dark.png"))
			return tabTexture[1];
		
		if(png.equals("images/pellet.png"))
			return tabTexture[2];
		
		if(png.equals("images/ghost1.png"))
			return tabTexture[3];
		
		if(png.equals("images/ghost2.png"))
			return tabTexture[4];
		
		if(png.equals("images/ghost3.png"))
			return tabTexture[5];
		
		if(png.equals("images/ghost4.png"))
			return tabTexture[6];
		
		if(png.equals("images/superpellet.png"))
			return tabTexture[7];
		
		if(png.equals("images/ghostDead.png"))
			return tabTexture[8];
		
		if(png.equals("images/ghostEspacing.png"))
			return tabTexture[9];
		
		if(png.equals("images/pacman-3.png"))
			return tabTexture[10];
		
		if(png.equals("images/pacmanDown.png"))
			return tabTexture[11];
		
		if(png.equals("images/pacmanDown-2.png"))
			return tabTexture[12];
		
		if(png.equals("images/pacmanLeft.png"))
			return tabTexture[13];
		
		if(png.equals("images/pacmanLeft-2.png"))
			return tabTexture[14];
		
		if(png.equals("images/pacmanRight.png"))
			return tabTexture[15];
		
		if(png.equals("images/pacmanRight-2.png"))
			return tabTexture[16];
		
		if(png.equals("images/pacmanUp.png"))
			return tabTexture[17];
		
		if(png.equals("images/pacmanUp-2.png"))
			return tabTexture[18];
		
		if(png.equals("images/superpellet-2.png"))
			return tabTexture[19];
		
		throw new IllegalArgumentException("Vous avez demandez une texture qui n'existe pas !");
	}
	
}