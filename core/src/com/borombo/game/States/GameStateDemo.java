package com.borombo.game.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.borombo.game.ClickMoreDemo;

/**
 * Created by Erwan on 21/02/2016.
 */
public class GameStateDemo extends  State {
    private Texture background;

    public GameStateDemo(GameStateManager gsm) {
        super(gsm);
        background = new Texture("fond.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, ClickMoreDemo.WHIDTH, ClickMoreDemo.HEIGHT);
        sb.end();
    }
}
