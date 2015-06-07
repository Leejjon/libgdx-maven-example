package com.badlogic.test.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.badlogic.test.core.Test;

public class TestDesktop {
	public static void main (String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Test(), config);
	}
}
