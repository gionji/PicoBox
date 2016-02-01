package com.giovanniburresi.picobox;


//        This file is part of Picobox.
//
//        Copyright (C) 2016 Giovanni Burresi <giovanniburresi@gmail.com>
//
//        Nome-Programma is free software: you can redistribute it and/or modify
//        it under the terms of the GNU General Public License as published by
//        the Free Software Foundation, either version 3 of the License, or
//        (at your option) any later version.
//
//        Nome-Programma is distributed in the hope that it will be useful,
//        but WITHOUT ANY WARRANTY; without even the implied warranty of
//        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//        GNU General Public License for more details.
//
//        You should have received a copy of the GNU General Public License
//        along with Nome-Programma.  If not, see <http://www.gnu.org/licenses/>.


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.net.URL;


public class PBMainActivity extends AppCompatActivity {

    FragmentManager fm;
    boolean secondoAvvio = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_01_splashscreen);



        secondoAvvio = getIntent().getBooleanExtra("SECONDO_AVVIO", false);
        new SplashscreenTimer().execute();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_pbmain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class SplashscreenTimer extends AsyncTask<URL, Integer, Long> {
        protected Long doInBackground(URL... urls) {
            int count = urls.length;
            long totalSize = 0;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            return totalSize;
        }


        protected void onPostExecute(Long result) {
            prosegui(null);
        }
    }


    public void prosegui(View v){

        if(secondoAvvio)
            startActivity(new Intent(this, Activity20_CloserToShow.class));
        else
            startActivity(new Intent(this, Activity02_Signin.class));
    }
}
