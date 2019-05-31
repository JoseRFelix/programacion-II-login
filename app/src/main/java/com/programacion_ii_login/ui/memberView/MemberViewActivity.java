package com.programacion_ii_login.ui.memberView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.programacion_ii_login.R;
import com.programacion_ii_login.data.model.Agent;

import org.w3c.dom.Text;

public class MemberViewActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        Agent agent = (Agent) getIntent().getSerializableExtra("Agent");

        final ImageView memberPicture = findViewById(R.id.memberPicture);

        final TextView memberName = findViewById(R.id.memberName);
        final TextView missionsText = findViewById(R.id.missionsText);
        final TextView successfulMissionsText = findViewById(R.id.successfulMissionsText);
        final TextView failedMissionsText = findViewById(R.id.failedMissionsText);

        final TextView emailText = findViewById(R.id.emailText);
        final TextView phoneText = findViewById(R.id.phoneText);
        final TextView addressText = findViewById(R.id.addressText);

        final Button backButton = findViewById(R.id.member_back_button);


        memberPicture.setImageResource(agent.getImage());

        memberName.setText(agent.getName());
        missionsText.setText(agent.getMissions()+"");
        successfulMissionsText.setText(agent.getSuccess()+"");
        failedMissionsText.setText(agent.getFails()+"");

        emailText.setText(agent.getEmail());
        phoneText.setText(agent.getPhone());
        addressText.setText(agent.getAddress());

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
