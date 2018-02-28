package javi.game1.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by javier on 01/03/2018.
 */

public class Nave {

    Texture img;
    int x= 50;
    int y = 50;
    public Nave(){

        img = new Texture("nave.png");


    }

    public void pintar(SpriteBatch batch){
        batch.draw(img,x,y);

    }

}
