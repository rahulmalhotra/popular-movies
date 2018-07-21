package com.example.rahulmalhotra.popularmovies.PopularMovieAdapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.rahulmalhotra.popularmovies.MovieDetail;
import com.example.rahulmalhotra.popularmovies.PopularMovieObjects.Movie;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Movie> movies;

    public ImageAdapter(Context context, ArrayList<Movie> moviesList) {
        mContext = context;
        movies = moviesList;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if(view==null) {
            imageView  = new ImageView(mContext);
            imageView.setPadding(8,8,8,8);
            imageView.setAdjustViewBounds(true);
//            imageView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(mContext, MovieDetail.class);
//                    intent.putExtra("movie", movies.get(view.getId()));
//                    mContext.startActivity(intent);
//                }
//            });
        }
        else {
            imageView = (ImageView) view;
        }

        Picasso.with(mContext)
                .load(movies.get(i).getPosterPath())
                .resize(500, 500)
                .centerInside()
                .into(imageView);
        return imageView;
    }
}
