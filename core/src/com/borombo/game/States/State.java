package com.borombo.game.States;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.borombo.game.ClickMoreDemo;

/**
 * Created by Erwan on 21/02/2016.
 */
public abstract class State {
    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected  GameStateManager gsm;

    public State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera(ClickMoreDemo.WHIDTH, ClickMoreDemo.HEIGHT);
        cam.setToOrtho(false,ClickMoreDemo.WHIDTH, ClickMoreDemo.HEIGHT);
        cam.update();
        mouse = new Vector3();
    }

    protected abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
}
