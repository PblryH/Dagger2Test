package com.example.railkamalov.dagger2test;

import dagger.Module;
import dagger.Provides;

/**
 * Created by railkamalov on 20.07.16.
 */
@Module
public class GameModule {

    @Provides
    GameData providesGameData() {
        return new GameData();
    }

}
