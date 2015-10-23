package nl.hsleiden.test3.scrollviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MeerInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String lockValue = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Log.d("lock nummer", lockValue);
    }

}
