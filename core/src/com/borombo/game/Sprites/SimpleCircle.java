package com.borombo.game.Sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Erwan on 22/02/16.
 */
public class SimpleCircle extends Circle {

    public SimpleCircle(int x, int y) {
        super(x, y);
        this.texture = new Texture("cercle.png");
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void touched() {

    }

    @Override
    public void setPosition(Vector3 pos) {

        this.position = pos;
    }

}
