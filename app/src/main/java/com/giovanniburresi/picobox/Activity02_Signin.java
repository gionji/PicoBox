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

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Activity02_Signin extends AppCompatActivity {

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_02_signin);

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

    public void login(View v){
        Intent i = new Intent(this, Activity_LoginAccess.class);
        i.putExtra("ACCESS_TYPE", "PicoBox");
        startActivity(i);
    }



    public void facebookSignin(View v){
        Intent i = new Intent(this, Activity_LoginAccess.class);
        i.putExtra("ACCESS_TYPE", "Facebook");
        startActivity(i);
    }



    public void tweeterSignin(View v){
        Intent i = new Intent(this, Activity_LoginAccess.class);
        i.putExtra("ACCESS_TYPE", "Tweeter");
        startActivity(i);
    }

    public void googleSignin(View v){
        Intent i = new Intent(this, Activity_LoginAccess.class);
        i.putExtra("ACCESS_TYPE", "Google+");
        startActivity(i);
    }
}
