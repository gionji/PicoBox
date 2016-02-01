package com.giovanniburresi.picobox;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.giovanniburresi.picobox.imagegrid.ImageItem;

import java.net.URL;
import java.util.ArrayList;


public class FragmentShow extends Fragment{

    public FragmentShow() {
        // Required empty public constructor
    }

    ImageView immagine;
    boolean running = true;
    boolean paused = false;
    TypedArray imgs;

    @Override
    public void onPause() {
        super.onPause();
        running = false;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean running = true;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show, container, false);

        immagine = (ImageView) view.findViewById(R.id.imageView3);
        imgs = getResources().obtainTypedArray(R.array.image_malta_ids);

        new SplashscreenTimer().execute();

        final  ImageView button3 = (ImageView) view.findViewById(R.id.playpause);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(paused) {
                    paused = false;
                    button3.setImageResource(android.R.drawable.ic_media_pause);
                }
                else{
                    paused = true;
                    button3.setImageResource(android.R.drawable.ic_media_play);}
            }
        });

        return view;
    }

    private class SplashscreenTimer extends AsyncTask<URL, Integer, Long> {
        protected Long doInBackground(URL... urls) {
            int i = 0;
            while (running) {
                try {
                    if(!paused) publishProgress(i % 5);
                    i++;
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return 0L;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {

            immagine.setImageResource(imgs.getResourceId(values[0], -1) );
        }

        protected void onPostExecute(Long result) {

        }
    }
}
