package com.example.railkamalov.dagger2test;

import javax.inject.Inject;

/**
 * Created by railkamalov on 20.07.16.
 */
public class GameSession {

    @Inject
    public GameData data;

    public GameSession() {
    }
}
