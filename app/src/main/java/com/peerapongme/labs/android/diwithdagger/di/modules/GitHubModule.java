package com.peerapongme.labs.android.diwithdagger.di.modules;

import com.peerapongme.labs.android.diwithdagger.di.scopes.UserScope;
import com.peerapongme.labs.android.diwithdagger.network.interfaces.GitHubApiInterface;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by peerapong on 8/19/16.
 */
@Module
public class GitHubModule {
    @Provides
    @UserScope
    public GitHubApiInterface provideGitHubInterface(Retrofit retrofit){
        return retrofit.create(GitHubApiInterface.class);
    }
}
