package com.cottagewar.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.cottagewar.CottageWar;

/**
 * Created by KLIPST on 26.10.2014.
 */
public class MainMenuScreen extends AbstractGameScreen {
    Sprite newGameBtn;
    Sprite tutorialBtn;
    Sprite exitBtn;

    public MainMenuScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();

        newGameBtn = new Sprite(new Texture(Gdx.files.internal("newGame.png"))) {{
            setX(300);
            setY(300);
        }};

        tutorialBtn = new Sprite(new Texture(Gdx.files.internal("tutorial.png"))) {{
            setX(300);
            setY(225);
        }};

        exitBtn = new Sprite(new Texture(Gdx.files.internal("exit.png"))) {{
            setX(300);
            setY(150);
        }};

        Gdx.input.setInputProcessor(new InputAdapter() {

            @Override
            public boolean touchDown(int screenX, int screenY, int pointer, int button) {
                screenY = 600 - screenY;

                Gdx.app.log("Game", screenX + ":" + screenY + " | " + exitBtn.getBoundingRectangle().toString());

                if (newGameBtn.getBoundingRectangle().contains(screenX, screenY)) {
                    game.setScreen(new GameScreen(game));
                    return true;
                }

                if (tutorialBtn.getBoundingRectangle().contains(screenX, screenY)) {
                    game.setScreen(new TutorialScreen(game));
                    return true;
                }

                if (exitBtn.getBoundingRectangle().contains(screenX, screenY)) {
                    Gdx.app.exit();
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

        newGameBtn.draw(batch);
        tutorialBtn.draw(batch);
        exitBtn.draw(batch);

        batch.end();

    }
}
