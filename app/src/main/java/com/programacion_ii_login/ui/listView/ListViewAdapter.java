package com.programacion_ii_login.ui.listView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.programacion_ii_login.R;
import com.programacion_ii_login.data.model.Agent;

public class ListViewAdapter extends ArrayAdapter<String>{
    private Context context;
    private Agent[] agents;

    ListViewAdapter (Context c, Agent[] agents) {
        super(c, R.layout.row, R.id.textView1);
        this.context = c;
        this.agents = agents;
    }

    @Override
    public int getCount() {
        return agents.length;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        view = inflater.inflate(R.layout.row, null);

        ImageView images = view.findViewById(R.id.image);
        TextView myTitle =  view.findViewById(R.id.textView1);
        TextView myDescription = view.findViewById(R.id.textView2);

        images.setImageResource(agents[position].getImage());
        myTitle.setText(agents[position].getName());
        myDescription.setText(agents[position].getTitle());

        return view;
    }
}
