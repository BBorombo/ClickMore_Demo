package com.borombo.game.Sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

import java.util.Random;

/**
 * Created by Erwan on 22/02/16.
 */
public abstract class Circle {

    protected Vector3 position;
    protected Texture texture;
    protected boolean isTouched = false;
    protected Random random;


    public Circle(Vector3 pos){
        position = pos;
        random = new Random();
    }

    public void update(float dt) {

    }

    public void setPosition() {
        Vector3 pos = new Vector3(random.nextInt(340), random.nextInt(610), 0);
        System.out.println("Position x : " + pos.x);
        System.out.println("Position y : " + pos.y);
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
