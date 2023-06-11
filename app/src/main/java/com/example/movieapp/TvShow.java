package com.example.movieapp;

import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TvShow {

    @SerializedName("name")
    private String title;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("first_air_date")
    private String releaseDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate != null ? releaseDate.split("-")[0] : "None";
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;

    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

}
