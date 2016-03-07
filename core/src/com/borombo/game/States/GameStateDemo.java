package com.borombo.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.borombo.game.ClickMoreDemo;
import com.borombo.game.Sprites.RedBackground;
import com.borombo.game.Sprites.SimpleCircle;

import java.util.Random;

/**
 * Created by Erwan on 21/02/2016.
 */
public class GameStateDemo extends State {
    private Texture background;
    private SimpleCircle circle;
    private RedBackground rbg;

    public GameStateDemo(GameStateManager gsm) {
        super(gsm);
        rbg = new RedBackground();
        Vector3 pos = new Vector3(100, 300, 0);
        circle = new SimpleCircle(pos);
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()){
            this.circle.touched();

        }
    }

    @Override
    public void update(float dt) {
        handleInput();
        circle.update(dt);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(rbg.getTexture(), 0, 0, ClickMoreDemo.WHIDTH, ClickMoreDemo.HEIGHT);
        sb.draw(circle.getRegionCourante(), circle.getPosition().x, circle.getPosition().y);

        sb.end();
    }
}
