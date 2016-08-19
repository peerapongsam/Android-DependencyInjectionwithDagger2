package com.peerapongme.labs.android.diwithdagger.di.components;

import com.peerapongme.labs.android.diwithdagger.MainActivity;
import com.peerapongme.labs.android.diwithdagger.di.modules.AppModule;
import com.peerapongme.labs.android.diwithdagger.di.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by peerapong on 8/19/16.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity mainActivity);
}
