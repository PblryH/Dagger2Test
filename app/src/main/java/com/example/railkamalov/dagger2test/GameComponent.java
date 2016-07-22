package com.example.railkamalov.dagger2test;

import dagger.Component;

/**
 * Created by railkamalov on 20.07.16.
 */
@Component(modules = GameModule.class)
public interface GameComponent {
    void inject(GameSession obj);
}
