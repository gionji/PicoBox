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


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.giovanniburresi.picobox.R;


public class FragmentMap extends Fragment{

    public FragmentMap() {
        // Required empty public constructor
    }



    private Fragment instance = this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_map, container, false);

        ImageView button1 = (ImageView) view.findViewById(R.id.posto1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(instance.getActivity(), Activity23_SubGrid.class);
                i.putExtra("POSTO", 1);
                startActivity(i);
            }
        });

        ImageView button2 = (ImageView) view.findViewById(R.id.posto2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i = new Intent(instance.getActivity(), Activity23_SubGrid.class);
                i.putExtra("POSTO", 2);
                startActivity(i);
            }
        });

        ImageView button3 = (ImageView) view.findViewById(R.id.posto3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i = new Intent(instance.getActivity(), Activity23_SubGrid.class);
                i.putExtra("POSTO", 3);
                startActivity(i);
            }
        });

        return view;
    }


}
