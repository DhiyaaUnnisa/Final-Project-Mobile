package com.example.movieapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder> {

    private List<TvShow> tvShows;

    public void setTvShows(List<TvShow> tvShows) {
        this.tvShows = tvShows;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TvShowAdapter.TvShowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        return new TvShowAdapter.TvShowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TvShowAdapter.TvShowViewHolder holder, int position) {
        TvShow tvShow = tvShows.get(position);
        holder.titleTextView.setText(tvShow.getTitle());
        holder.yearTextView.setText(tvShow.getReleaseDate());

        String imageUrl = "https://image.tmdb.org/t/p/w500/" + tvShow.getPosterPath();
        Picasso.get().load(imageUrl).into(holder.posterImageView);
    }

    @Override
    public int getItemCount() {
        return tvShows != null ? tvShows.size() : 0;
    }

    public static class TvShowViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView, yearTextView;
        public ImageView posterImageView;

        public TvShowViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.tv_tittle);
            posterImageView = itemView.findViewById(R.id.tv_image);
            yearTextView = itemView.findViewById(R.id.tv_year);
        }
    }

}
