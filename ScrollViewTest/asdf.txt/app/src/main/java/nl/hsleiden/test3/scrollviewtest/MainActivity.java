package nl.hsleiden.test3.scrollviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    // ListView Clicked item index
    int itemPosition;

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";


    // ListView Clicked item value
    String itemValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[]{
                "Yale Oplegslot",
                "Nemef bezetslot",
                "Nacht oplegslot",
                "Fiam insteekpenslot",
                "Cilinderslot",
                "Economy badkamerslot",
                "Zaso penslot",
                "ART5 pro-tect slot"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                itemPosition = position + 1;

                // ListView Clicked item value
                itemValue = (String) listView.getItemAtPosition(position);

                TextView newtext = (TextView) findViewById(R.id.lockInfoField);
                newtext.setText("Dit is een " + itemValue + ". Dit slot staat op de " + itemPosition + "e plaats in de lijst. Met dit slot kan je deuren op slot doen.");

                Button btn = (Button) findViewById(R.id.moreInfoButton);
                btn.setEnabled(true);
                btn.setClickable(true);
            }

        });
    }

    public void openMeerInfo(View view) {
        Log.d("De meer knop", "is succesvol ingedrukt!");
        Intent intent = new Intent(this, MeerInfoActivity.class);
        intent.putExtra(EXTRA_MESSAGE, itemValue);
        startActivity(intent);
    }

}
