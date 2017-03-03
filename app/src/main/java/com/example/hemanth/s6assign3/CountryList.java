package com.example.hemanth.s6assign3;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Hemanth on 28-02-2017.
 */

public class CountryList extends ListFragment {

    String[] websites = new String[] {
            "You Tube",
            "Blogger",
            "FaceBook",
            "Twitter",
            "Quora",

    };

    // Array of integers points to images stored in /res/drawable/
    int[] icons = new int[]{


            R.mipmap.yt,
            R.mipmap.b,
            R.mipmap.fb,
            R.mipmap.tw,
            R.mipmap.qu,
    };

    // Array of strings to store currencies
    String[] currency = new String[]{
            "YouTube is an American video-sharing website.",
            "Blogger is a blog-publishing service that allows multi-user blogs with time-stamped entries.",
            "Facebook (FB) is an American for-profit corporation and online social media and social networking service.",
            "Twitter is an online news and social networking service.",
            "Quora is a question-and-answer site where questions are asked, answered, edited and organized by its community of users.",

    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Each row in the list stores country name, currency and flag
        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 5; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();

            hm.put("txt", "" + websites[i]);
            hm.put("cur", "" + currency[i]);
            //hm.put("flag", Integer.toString(icons[i]));
            hm.put("flag",Integer.toString(icons[i]));
            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = {"flag", "txt", "cur"};

        // Ids of views in listview_layout
        int[] to = {R.id.flag, R.id.txt, R.id.cur};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.listview_layout, from, to);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
