package com.cottagewar.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.cottagewar.CottageWar;

/**
 * Создает конфигурацию приложения и запускает его
 */


public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Cottage war";
        config.width = 800;
        config.height = 600;
		new LwjglApplication(new CottageWar(), config);
	}
}
