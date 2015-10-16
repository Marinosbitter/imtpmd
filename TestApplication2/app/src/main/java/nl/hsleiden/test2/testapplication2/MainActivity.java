package nl.hsleiden.test2.testapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void openActivity1(View view){
        Log.d("Open Activity 1", "Welja");
        startActivity(new Intent(this, SubActivity1.class));
    }

    public void openActivity2(View view){
        Log.d("Open Activity 2", "Welja");
        startActivity(new Intent(this, SubActivity2.class));
    }
}
