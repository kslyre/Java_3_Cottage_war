package com.cottagewar.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by KLIPST on 26.10.2014.
 */
public class TutorialScreen extends AbstractGameScreen{
    Sprite backBtn;

    public TutorialScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();

        backBtn = new Sprite(new Texture(Gdx.files.internal("back.png"))) {{
            setX(300);
            setY(100);
        }};

        Gdx.input.setInputProcessor(new InputAdapter() {

            @Override
            public boolean touchDown(int screenX, int screenY, int pointer, int button) {
                screenY = 600 - screenY;

                Gdx.app.log("Game", screenX + ":" + screenY + " | ");

                if (backBtn.getBoundingRectangle().contains(screenX, screenY)) {
                    game.setScreen(new MainMenuScreen(game));
                    return true;
                }

                return false;
            }
        });
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        batch.begin();

        backBtn.draw(batch);

        batch.end();

    }

}
