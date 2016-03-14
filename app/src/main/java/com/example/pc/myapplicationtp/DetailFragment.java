package com.example.pc.myapplicationtp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by pc on 06/03/2016.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, null);
        Bundle bundle = getArguments();
        if (bundle!=null) {
            Book bk =(Book) (bundle.getSerializable("bk"));
            TextView titre = (TextView) (view.findViewById(R.id.title1));
            titre.setText(bk.getTitle());
            TextView authors = (TextView) (view.findViewById(R.id.authors1));
            authors.setText(bk.getAuthors());
            TextView editor= (TextView) (view.findViewById(R.id.editors1));
            editor.setText(bk.getEditor());
            TextView summary= (TextView) (view.findViewById(R.id.summary));
            summary.setText(bk.getSummary());
            TextView year= (TextView) (view.findViewById(R.id.year));
            year.setText(bk.getYear());
            ImageView cover = (ImageView) (view.findViewById(R.id.imageView));
            cover.setImageResource(bk.getCover());
        }


        return view;
    }

}
