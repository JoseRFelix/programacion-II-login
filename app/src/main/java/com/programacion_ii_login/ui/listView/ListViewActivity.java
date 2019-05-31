package com.programacion_ii_login.ui.listView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import com.programacion_ii_login.data.model.Agent;
import com.programacion_ii_login.R;
import com.programacion_ii_login.ui.memberView.MemberViewActivity;

import java.util.HashMap;
import java.util.Map;


public class ListViewActivity extends AppCompatActivity {
    ListView listView;
    Agent[] agents = {
            new Agent("Mayor Monograma", "Monograma", R.drawable.mm, 130, 70, 60, "+1 809 458 9641", "mmg@gmail.com", "Fantino Falco #55, Santo Domingo, República Dominicana", createMap(18.476579, -69.929629)),
            new Agent("Carl", "Asistente", R.drawable.carl, 10, 0, 10, "+1 829 145 4876", "elpalomo@gmail.com", "Fantino Falco #68, Santo Domingo, República Dominicana", createMap(18.476485, -69.934362)),
            new Agent("Perry the Platypus", "Agente", R.drawable.perry, 300, 300, 0, "+1 829 854 7441", "agentep@gmail.com", "Agustin Lara #38, Santo Domingo, República Dominicana", createMap(18.477121, -69.933957)),
            new Agent("Pinky the Chihuahua", "Agente", R.drawable.pinky, 180, 120, 60, "+1 849 555 2525", "turealpinky@gmail.com", "David Masalles #39, Santo Domingo, República Dominicana", createMap(18.472926,-69.947686)),
            new Agent("Peter the Panda", "Agente", R.drawable.peter, 200, 100, 100, "+1 809 685 2541", "elpanda@gmail.com", "Fantino Falco #75, Santo Domingo, República Dominicana", createMap(18.476592,-69.934382))
    };

    private Map<String, Double> createMap(Double lat, Double lng){
        Map<String,Double> map = new HashMap<>();
        map.put("lat", lat);
        map.put("long", lng);
        return map;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logout_action, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_logout:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        listView = findViewById(R.id.listView);

        ListViewAdapter adapter = new ListViewAdapter(ListViewActivity.this, agents);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent memberIntent = new Intent(ListViewActivity.this, MemberViewActivity.class);
                memberIntent.putExtra("Agent", agents[position]);
                startActivity(memberIntent);
            }
        });
    }

    @Override
    public void onBackPressed () {}
}
