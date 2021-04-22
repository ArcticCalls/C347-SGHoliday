package sg.edu.rp.c347.id19045104.sgholiday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> eventList;
    ArrayAdapter<String> aaEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lvTypes);
        eventList = new ArrayList();
        eventList.add("Secular");
        eventList.add("Ethnic & Religion");

        aaEvent = new ArrayAdapter(this, android.R.layout.simple_list_item_1, eventList);
        lv.setAdapter(aaEvent);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedEvent =eventList.get(position);

                //start the new activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("selectedEvent", selectedEvent);
                startActivity(intent);

            }
        });

    }
}