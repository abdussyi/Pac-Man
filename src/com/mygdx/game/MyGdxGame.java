package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import modele.World;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	public void afficherTerrain()
	{
		batch.begin();
		int i=0;
		int j=0;
		img = new Texture("bloc.png");
		for(i=0;i<961;i=i+31)
		{
			for(i=0;i<868;i=i+31)
			{
				batch.draw(img, 0, 0);
			}
		}
		batch.end();
	}
	
	
	@Override
	public void create () {
		World MondeDeFilsDePute = new World("monde.csv");
		MondeDeFilsDePute.imprimeMondeConsole();
		img = new Texture("bloc.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch = new SpriteBatch();
		batch.begin();
		int i,j;
		int x=0;
		int y=0;
		for(i=0;i<31;i++)
		{
			for(j=0;j<28;j++)
			{
				batch.draw(img, x, y);
				y=y+48;
			}
			x=x+48;
			y=0;
		}
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
