package com.example.studygage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonOfList = (Button) findViewById(R.id.GoToList);

        buttonOfList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StudyListFragment studylistfragment = new StudyListFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container_fragment, studylistfragment);
                fragmentTransaction.commit();

            }
        });




    }
}