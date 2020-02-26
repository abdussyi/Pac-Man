package modele;

import com.badlogic.gdx.graphics.Texture;

import vue.TextureFactory;

public class Pacman extends MovingGameElement{
	
	private int l, c;
	private Direction direction;
	private Texture textureDuMoment;

	private int dirL;
	private int dirC;
	private int vie;

	public void setDirX(int dirL) {
		this.dirL = dirL;
	}

	public void setDirY(int dirC) {
		this.dirC = dirC;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getDirL() {
		return dirL;
	}

	public int getDirC() {
		return dirC;
	}

	public int getVie() {
		return vie;
	}

	private Texture neutre;
	private Texture droite1;
	private Texture droite2;
	private Texture gauche1;
	private Texture gauche2;
	private Texture haut1;
	private Texture haut2;
	private Texture bas1;
	private Texture bas2;
	
	public Pacman()
	{
		setPng("images/pacmanRight.png");
		l =0;
		c =0;
		setDirection(Direction.Neutre);


		neutre = textureDuMoment=TextureFactory.getInstance().getTextureSelonNom("images/pacman-3.png");
        droite1 = textureDuMoment=TextureFactory.getInstance().getTextureSelonNom("images/pacmanRight.png");
        droite2 = textureDuMoment=TextureFactory.getInstance().getTextureSelonNom("images/pacmanRight-2.png");
        gauche1 = textureDuMoment=TextureFactory.getInstance().getTextureSelonNom("images/pacmanLeft.png");
        gauche2 = textureDuMoment=TextureFactory.getInstance().getTextureSelonNom("images/pacmanLeft-2.png");
        haut1 = textureDuMoment=TextureFactory.getInstance().getTextureSelonNom("images/pacmanUp.png");
        haut2 = textureDuMoment=TextureFactory.getInstance().getTextureSelonNom("images/pacmanUp-2.png");
        bas1 = textureDuMoment=TextureFactory.getInstance().getTextureSelonNom("images/pacmanDown.png");
        bas2 = textureDuMoment=TextureFactory.getInstance().getTextureSelonNom("images/pacmanDown-2.png");


        textureDuMoment=neutre;
	}
	
	public void setCoord(int l,int c)
	{
		setL(l);
		setC(c);
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Direction getDirection() {
		return direction;
	}

	public int getL() {
		return l;
	}
	public void setL(int x) {
		this.l = x;
	}
	public int getC() {
		return c;
	}
	public void setC(int y) {
		this.c = y;
	}
	@Override
	public String getNomChose() {
		return "PacMan ";
	}

	@Override
	public void setPng(String repertoirePng) {
		png=repertoirePng;
	}

	@Override
	public String getPng() {
		return png;
	}

    public Texture getTextureDuMoment() {
        return textureDuMoment;
    }


	public void setNextTextureDuMoment(int cpt) {
		switch(cpt) {
			case 0:
				textureDuMoment = textureDuMoment;
				break;
			case 1:
				switch (direction) {
					case Up:
						textureDuMoment = haut1;
						break;
					case Down:
						textureDuMoment = bas1;
						break;
					case Left:
						textureDuMoment = gauche1;
						break;
					case Right:
						textureDuMoment = droite1;
						break;
					default:
						break;
				}
				break;
			case 2:
				switch (direction) {
					case Up:
						textureDuMoment = haut2;
						break;
					case Down:
						textureDuMoment = bas2;
						break;
					case Left:
						textureDuMoment = gauche2;
						break;
					case Right:
						textureDuMoment = droite2;
						break;
					default:
						break;
				}
				break;
			case 3:
				switch (direction) {
					case Up:
						textureDuMoment = haut1;
						break;
					case Down:
						textureDuMoment = bas1;
						break;
					case Left:
						textureDuMoment = gauche1;
						break;
					case Right:
						textureDuMoment = droite1;
						break;
					default:
						break;
				}
				break;
		}
	}

/*
    public void setNextTextureDuMoment() {
        switch(direction)
        {
            case Neutre:
                textureDuMoment=neutre;
                break;
            case Right:
                //je me permet le === car texture factory est un singleton
                if (textureDuMoment != droite1 && textureDuMoment != droite2)
                    textureDuMoment=droite1;
                else
                    {
                    if (textureDuMoment == droite1 )
                        textureDuMoment = droite2;
                    else
                        textureDuMoment = droite1;
                    }
                break;
            case Left:
                if (textureDuMoment != gauche1&& textureDuMoment != gauche2)
                    textureDuMoment=gauche1;
                else
                {
                    if (textureDuMoment == gauche1)
                        textureDuMoment = gauche2;
                    else
                        textureDuMoment = gauche1;
                }
                break;
            case Up:
				if (textureDuMoment != haut1&& textureDuMoment != haut2)
					textureDuMoment=haut1;
				else
				{
					if (textureDuMoment == haut1)
						textureDuMoment = haut2;
					else
						textureDuMoment = haut1;
				}
				break;
            case Down:
				if (textureDuMoment != bas1&& textureDuMoment != bas2)
					textureDuMoment=bas1;
				else
				{
					if (textureDuMoment == bas1)
						textureDuMoment = bas2;
					else
						textureDuMoment = bas1;
				}
				break;
        }
    }*/
}
