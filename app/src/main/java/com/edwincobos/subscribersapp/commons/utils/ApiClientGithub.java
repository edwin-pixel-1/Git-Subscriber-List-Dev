package com.edwincobos.subscribersapp.commons.utils;

import com.edwincobos.subscribersapp.commons.models.ItemUserList;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

/**
 * Created by edwin.cobos on 19/08/2016.
 */
public class ApiClientGithub {
    private static GithubApiInterface apiService;

    public static GithubApiInterface getApiService() {

        if(apiService == null){

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.GITHUB_BASE_URL)
                    .build();

            apiService = retrofit.create(GithubApiInterface.class);
        }

        return apiService;
    }

    /**
     * This interface define the end-points of service
     */
    public interface GithubApiInterface{

        @GET("repos/googlesamples/android-architecture/subscribers/")
        Call<List<ItemUserList>> getSubscribers();

    }

}