package com.programacion_ii_login.ui.listView;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.programacion_ii_login.R;

public class ListView extends AppCompatActivity {

    public ListView listView;
    String title[] = {"Mayor Monograma", "Perry the Platypus", "Pinky the Dog", "Peter the Panda"};
    String sTitle[] = {"Monograma", "Agente", "Agente", "Agente"};
    int images[] = {R.drawable.mm, R.drawable.perry, R.drawable.pinky, R.drawable.peter};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listView); //POR QUE ESTA TAN RARA

        new MyAdapter(this, title, sTitle, images);

        listView.

    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;//WHATS CONTEXT
        String rTitle[];
        String rDescription[];
        int rImages[];

        MyAdapter (Context c, String title[], String sTitle[], int images[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = sTitle;
            this.rImages = images;

        }
//NO ENTIENDOOOOO
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row;
        }
    }

}
