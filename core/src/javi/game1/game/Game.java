package javi.game1.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by javier on 01/03/2018.
 */

public class Game {

    Nave nave;

    public Game(){
        nave = new Nave();
    }


    public void pintar(SpriteBatch batch){
        nave.pintar(batch);

    }
}
