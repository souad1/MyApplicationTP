package com.example.pc.myapplicationtp;


import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter adap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Book> liste = new ArrayList<Book>();
        liste.add(new Book("Microsoft SQL Server 2012 Pocket Consultant", "William R. Stanek", "Developer's Library", "2012", "", R.drawable.ic_sqlpc_cover, R.drawable.ic_sqlpc));
        liste.add(new Book("UML 2.0 in a Nutshell UML 2.0", "Christopher Paolini", "Developer's Library", "2007", "", R.drawable.ic_androidfdcover, R.drawable.ic_androidfd));
        liste.add(new Book("Programming in Objective-C", " Steven John Metsker", "Developer's Library", "2007", "", R.drawable.ic_objectivecover, R.drawable.ic_objectivec));
        liste.add(new Book("Learning Agile", "Andrew Stellman", "Jennifer Greene", "2012", "", R.drawable.ic_agilecovrer, R.drawable.ic_agile));
        liste.add(new Book("Android UI Fundamentals: Develop & Design", "Jason Ostrander", "Developer's Library", "2012", "", R.drawable.ic_unixicover, R.drawable.ic_unixicon));


        listView = (ListView)findViewById(R.id.listView);
        adap = (CustomAdapter) listView.getAdapter();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Book bk = (Book) (adap.getItem(position));
                showDetail(bk);
                //Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG).show();
            }
        });
    }

    public boolean isTwoPane() {
        View view = findViewById(R.id.frameLayout);
        return (view != null);
    }

    public void showDetail(Book bk) {
        if (isTwoPane()) {
            DetailFragment detailFragment = new DetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("bk", bk);
            detailFragment.setArguments(bundle);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.frameLayout,detailFragment);
            ft.commit();

        }
        else {
            Intent intent = new Intent(this,DetailActivity.class);
            intent.putExtra("bk",bk);
            startActivity(intent);
        }

    }
}
