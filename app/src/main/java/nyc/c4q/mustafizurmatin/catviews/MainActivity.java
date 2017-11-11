package nyc.c4q.mustafizurmatin.catviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.mustafizurmatin.catviews.controller.Adapter;
import nyc.c4q.mustafizurmatin.catviews.model.Tigers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView tigerseRecyclerView = (RecyclerView) findViewById(R.id.tigers_recyclerview);

        List<Tigers> tigers = new ArrayList<>();
        tigers.add(new Tigers("Bengal ", "White ", 20));
        tigers.add(new Tigers("Siberian Tiger ", "Orange and White ", 50));
        tigers.add(new Tigers("South China Tiger ", "Orange and White ", 20));

        Adapter tigerAdapter = new Adapter(tigers);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        tigerseRecyclerView.setAdapter(tigerAdapter);
        tigerseRecyclerView.setLayoutManager(linearLayoutManager);


    }

}
