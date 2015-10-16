package nl.hsleiden.test1.testapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPage1(View v){
        Log.d("pagina 1 openen", "jaaaa");
        startActivity(new Intent(this, Page1Activity.class));
    }

    public void openPage2(View v){
        Log.d("pagina 2 openen", "jaaaa");
        startActivity(new Intent(this, Page2Activity.class));
    }
}
