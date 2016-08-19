package com.peerapongme.labs.android.diwithdagger;

import android.app.Application;

import com.peerapongme.labs.android.diwithdagger.di.components.DaggerGitHubComponent;
import com.peerapongme.labs.android.diwithdagger.di.components.DaggerNetComponent;
import com.peerapongme.labs.android.diwithdagger.di.components.GitHubComponent;
import com.peerapongme.labs.android.diwithdagger.di.components.NetComponent;
import com.peerapongme.labs.android.diwithdagger.di.modules.AppModule;
import com.peerapongme.labs.android.diwithdagger.di.modules.GitHubModule;
import com.peerapongme.labs.android.diwithdagger.di.modules.NetModule;

/**
 * Created by peerapong on 8/19/16.
 */

public class DaggerApp extends Application {
    private NetComponent mNetComponent;
    private GitHubComponent mGitHubComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // Dagger%COMPONENT_NAME%
        mNetComponent = DaggerNetComponent.builder()
                // list of modules that are part of this component need to be created here too
                .appModule(new AppModule(this)) // This also corresponds to the name of your module: %component_name%Module
                .netModule(new NetModule("https://api.github.com"))
                .build();
        // If a Dagger 2 component does not have any constructor arguments for any of its modules,
        // then we can use .create() as a shortcut instead:
        // mNetComponent = DaggerNetComponent.create();

        mGitHubComponent = DaggerGitHubComponent.builder()
                .netComponent(mNetComponent)
                .gitHubModule(new GitHubModule())
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }

    public GitHubComponent getGitHubComponent() {
        return mGitHubComponent;
    }
}
