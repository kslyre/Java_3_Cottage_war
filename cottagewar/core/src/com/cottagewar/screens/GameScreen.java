package com.cottagewar.screens;

import com.badlogic.gdx.Game;
import com.cottagewar.maps.Map;
import com.cottagewar.renders.MapRenderer;

/**
 * Created by KLIPST on 26.10.2014.
 */
public class GameScreen extends AbstractGameScreen {
    private MapRenderer mapRenderer;

    public GameScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();

        mapRenderer = new MapRenderer(new Map());
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        mapRenderer.render(batch);
    }
}
