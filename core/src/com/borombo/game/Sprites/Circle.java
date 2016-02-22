package com.borombo.game.Sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Erwan on 22/02/16.
 */
public abstract class Circle {

    protected Vector3 position;
    protected Texture texture;
    protected boolean isTouched = false;

    public Circle(int x, int y){
        position = new Vector3(x, y, 0);
    }

    public void update(float dt) {

    }

    public abstract void touched();

    public void setPosition(Vector3 pos) {
        position = pos;
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return texture;
    }

    public boolean isTouched() {
        return isTouched;
    }

    public void dispose() {
        texture.dispose();
    }
}
