package com.peerapongme.labs.android.diwithdagger.di.components;

import com.peerapongme.labs.android.diwithdagger.MainActivity;
import com.peerapongme.labs.android.diwithdagger.di.modules.GitHubModule;
import com.peerapongme.labs.android.diwithdagger.di.scopes.UserScope;

import dagger.Component;

/**
 * Created by peerapong on 8/19/16.
 */
@UserScope
@Component(dependencies = NetComponent.class, modules = GitHubModule.class)
public interface GitHubComponent {
    void inject(MainActivity mainActivity);
}
