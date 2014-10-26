package com.cottagewar.renders;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.cottagewar.maps.Map;

/**
 * Created by KLIPST on 26.10.2014.
 */
public class MapRenderer {
    private final Map map;

    public MapRenderer(Map map) {
        this.map = map;
    }

    public void render(Batch batch) {
        batch.begin();
        batch.end();
    }
}
