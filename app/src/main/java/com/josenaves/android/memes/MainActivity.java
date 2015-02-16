package com.josenaves.android.memes;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends ActionBarActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private static final String[] DATA_SET = {"LOL", "TrollFace", "Forever Alone", "Okay Guy", "Me Gusta", "Poker Face", "Derpina", "Fuck Yeah"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.card_list);
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        List<String> list = new ArrayList<>();
        for (String s : DATA_SET) list.add(s);
        mAdapter = new MemeAdapter(list);
        mRecyclerView.setAdapter(mAdapter);
    }

}
