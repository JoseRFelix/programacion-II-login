package com.programacion_ii_login.ui.listView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import com.programacion_ii_login.data.model.Agent;
import com.programacion_ii_login.R;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    Agent[] agents = {new Agent("Mayor Monograma", "Monograma", R.drawable.mm),
            new Agent("Carl", "Asistente", R.drawable.carl),
            new Agent("Perry the Platypus", "Agente", R.drawable.perry),
            new Agent("Pinky the Chihuahua", "Agente", R.drawable.pinky),
            new Agent("Peter the Panda", "Agente", R.drawable.peter)};

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
                if (position == 0) {
                    Toast.makeText(ListViewActivity.this, "Monograma", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Toast.makeText(ListViewActivity.this, "Asistente", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(ListViewActivity.this, "Agente", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(ListViewActivity.this, "Agente", Toast.LENGTH_SHORT).show();
                }
                if (position == 4) {
                    Toast.makeText(ListViewActivity.this, "Agente", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
