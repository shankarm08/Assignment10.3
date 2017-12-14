package com.wedddingapp.shankar.assignmentten;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by shan on 12/12/2017.
 */

public class PlayersFragment extends ListFragment {
    String[] players={"Youtube","eblogger",};
    int[] images={R.drawable.youtubenew,R.drawable.ebloggerneww};
    ArrayList<HashMap<String, String>> data=new ArrayList<HashMap<String,String>>();
    SimpleAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        //MAP
        HashMap<String, String> map=new HashMap<String, String>();
        //FILL
        for(int i=0;i<players.length;i++)
        {
            map=new HashMap<String, String>();
            map.put("Player", players[i]);
            map.put("Image", Integer.toString(images[i]));
            data.add(map);
        }

        String[] from={"Player","Image"};
        //IDS OF VIEWS
        int[] to={R.id.nameTxt,R.id.imageView1,};
        //ADAPTER
        adapter=new SimpleAdapter(getActivity(), data, R.layout.model, from, to);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    }
