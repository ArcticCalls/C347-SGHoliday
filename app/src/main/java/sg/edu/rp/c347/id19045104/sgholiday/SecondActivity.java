package sg.edu.rp.c347.id19045104.sgholiday;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvEventType;
    ArrayAdapter aa;
    ArrayList<Events> events;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = findViewById(R.id.lvEvent);
        tvEventType = findViewById(R.id.tvEventType);

        Intent i = getIntent();
        String type = i.getStringExtra("selectedEvent");
        tvEventType.setText(type);

        events = new ArrayList<Events>();

        if(type.equals("Secular")){
            events.add(new Events("New Year's Day","1 Jan"));
            events.add(new Events("Labour Day","1 May"));

        }else if(type.equals("Ethnic & Religion")){
            events.add(new Events("Chinese New Year","28 Jan - 29 Jan"));
            events.add(new Events("Good Friday","14 April"));
        }

    }
}
