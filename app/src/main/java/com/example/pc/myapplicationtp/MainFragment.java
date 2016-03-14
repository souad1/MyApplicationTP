package com.example.pc.myapplicationtp;



import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by pc on 06/03/2016.
 */



import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainFragment extends Fragment {

    CustomAdapter adap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,null);
        ArrayList<Book> liste = new ArrayList<Book>();
        liste.add(new Book("Microsoft SQL Server 2012 Pocket Consultant", "William R. Stanek", "Developer's Library", "2012", "", R.drawable.ic_sqlpc_cover, R.drawable.ic_sqlpc));
        liste.add(new Book("UML 2.0 in a Nutshell UML 2.0", "Christopher Paolini", "Developer's Library", "2007", "", R.drawable.ic_androidfdcover, R.drawable.ic_androidfd));
        liste.add(new Book("Programming in Objective-C", " Steven John Metsker", "Developer's Library", "2007", "", R.drawable.ic_objectivecover, R.drawable.ic_objectivec));
        liste.add(new Book("Learning Agile", "Andrew Stellman", "Jennifer Greene", "2012", "", R.drawable.ic_agilecovrer, R.drawable.ic_agile));
        liste.add(new Book("Android UI Fundamentals: Develop & Design", "Jason Ostrander", "Developer's Library", "2012", "", R.drawable.ic_unixicover, R.drawable.ic_unixicon));
        // adap = new ArrayAdapter(this, android.R.layout.simple_list_item_1 , liste);
        adap = new CustomAdapter(getActivity(), liste);
        ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(adap);
        return view;
    }


}

