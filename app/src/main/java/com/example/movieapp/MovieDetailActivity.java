package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetailActivity extends AppCompatActivity {

    public static final String EXTRA_USER = "extra_user";
    private ImageView ivSampul, ivPoster;
    private TextView tvTitle, tvReleaseData, tvSynopsis, tvDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        ivSampul = findViewById(R.id.iv_sampul);
        ivPoster = findViewById(R.id.iv_poster);
        tvTitle = findViewById(R.id.tv_title);
        tvReleaseData = findViewById(R.id.tv_releaseDate);
        tvSynopsis = findViewById(R.id.tv_synopsis);
        tvDescription = findViewById(R.id.tv_description);

        int id = getIntent().getIntExtra(EXTRA_USER, 0);
    }
}