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
public class GameStateDemo extends  State {
    private Texture background;
    private SimpleCircle circle;
    private RedBackground rbg;
    private Random random;

    public GameStateDemo(GameStateManager gsm) {
        super(gsm);
        rbg = new RedBackground();
        circle = new SimpleCircle(100, 300);
        random = new Random();
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()){
            Vector3 pos = new Vector3(random.nextInt(400) + 1, random.nextInt(630) + 80, 0);
            circle.setPosition(pos);
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
        sb.draw(circle.getTexture(), circle.getPosition().x, circle.getPosition().y);
        sb.end();
    }
}
