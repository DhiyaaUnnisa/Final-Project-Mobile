package com.example.movieapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TvShowApi {
    @GET("tv/popular")
    Call<TvShowResponse> getPopularTvShow(@Query("api_key") String apiKey);

    @GET("tv/{tv_id}")
    Call<TvShow> getTvShowDetails(@Path("tv_id") int tvShowId, @Query("api_key") String apiKey);
}
