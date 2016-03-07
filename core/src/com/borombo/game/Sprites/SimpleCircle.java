package com.borombo.game.Sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.graphics.g2d.Animation;



/**
 * Created by Erwan on 22/02/16.
 */
public class SimpleCircle extends Circle {

    private static final float duree_animation = 0.15f;
    private static final int nb_image_animation = 2;
    private TextureRegion regionCourante;
    private Animation animation;
    private float temps;
    private TextureRegion t2 = new TextureRegion(new Texture("+1.png"));
    private TextureRegion t1 = new TextureRegion(new Texture("cercle.png"));


    public SimpleCircle(Vector3 pos) {
        super(pos);
        temps = -1;
        regionCourante = t1;
    }

    public  void touched(){
        this.isTouched = true;
        this.temps = 0;
        this.regionCourante = t2;
    }

    @Override
    public void update(float dt) {
        if (this.temps < duree_animation && this.temps != -1 && isTouched)
            this.temps += dt;

        if(this.temps >= duree_animation)
            endAnimation();
    }

    public void endAnimation(){
        this.temps = -1;
        isTouched = false;
        this.regionCourante = t1;
        setPosition();
    }


    public TextureRegion getRegionCourante(){ return this.regionCourante; }


}
