package com.peerapongme.labs.android.diwithdagger.network.interfaces;

import com.peerapongme.labs.android.diwithdagger.models.Repository;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by peerapong on 8/19/16.
 */

public interface GitHubApiInterface {
    @GET("/users/{userName}/repos")
    Call<List<Repository>> getRepository(@Path("userName") String userName);
}
