package com.peerapongme.labs.android.diwithdagger.di.components;

import android.content.SharedPreferences;

import com.peerapongme.labs.android.diwithdagger.di.modules.AppModule;
import com.peerapongme.labs.android.diwithdagger.di.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by peerapong on 8/19/16.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    // downstream components need these exposed with the return type
    // method name does not really matter
    Retrofit retrofit();

    OkHttpClient okHttpClient();

    SharedPreferences sharedPreferences();
}
