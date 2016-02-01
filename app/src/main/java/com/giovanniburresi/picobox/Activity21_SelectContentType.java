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


import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Activity21_SelectContentType extends AppCompatActivity {

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_21_selectcontenttype);

    }


    public void foto(View v){
        Intent i = new Intent(this, Activity22_ShowContents.class);
        i.putExtra("CONTENT_TYPE", "Foto");
        startActivity(i);
    }

    public void video(View v){
        Intent i = new Intent(this, Activity22_ShowContents.class);
        i.putExtra("CONTENT_TYPE", "Foto");
        startActivity(i);
    }

    public void audio(View v){
        Intent i = new Intent(this, Activity22_ShowContents.class);
        i.putExtra("CONTENT_TYPE", "Foto");
        startActivity(i);
    }

    public void files(View v){
        Intent i = new Intent(this, Activity22_ShowContents.class);
        i.putExtra("CONTENT_TYPE", "Foto");
        startActivity(i);
    }
}
