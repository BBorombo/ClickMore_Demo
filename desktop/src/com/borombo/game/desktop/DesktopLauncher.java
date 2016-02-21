package com.borombo.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.borombo.game.ClickMoreDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = ClickMoreDemo.WHIDTH;
		config.height = ClickMoreDemo.HEIGHT;
		config.title = ClickMoreDemo.TITLE;
		new LwjglApplication(new ClickMoreDemo(), config);
	}
}
