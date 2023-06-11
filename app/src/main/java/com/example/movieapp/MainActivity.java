package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton btnMovies, btnTvShows, btnFavorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvToolbar = findViewById(R.id.tv_toolbar);
        btnMovies = findViewById(R.id.btn_movies);
        btnTvShows = findViewById(R.id.btn_tvShows);
        btnFavorite = findViewById(R.id.btn_favorites);

        FragmentManager fragmentManager = getSupportFragmentManager();

        MovieListFragment movieListFragment = new MovieListFragment();
        TvShowFragment tvShowsFragment = new TvShowFragment();
        FavoritesFragment favoritesFragment = new FavoritesFragment();

        Fragment fragment = fragmentManager.findFragmentByTag(MovieListFragment.class.getSimpleName());
        if (!(fragment instanceof MovieListFragment)) {
            fragmentManager
                    .beginTransaction()
                    .add(R.id.flFragment, movieListFragment, MovieListFragment.class.getSimpleName())
                    .commit();
        }

        btnMovies.setOnClickListener(view -> {
            tvToolbar.setText("Movies");
            Bundle bundle = getIntent().getExtras();
            movieListFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, movieListFragment).commit();
        });

        btnTvShows.setOnClickListener(view -> {
            tvToolbar.setText("Tv Shows");
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, tvShowsFragment).commit();
        });

        btnFavorite.setOnClickListener(view -> {
            tvToolbar.setText("Favorites");
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, favoritesFragment).commit();
        });

    }
}