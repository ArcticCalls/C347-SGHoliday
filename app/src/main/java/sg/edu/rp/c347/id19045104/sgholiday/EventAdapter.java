package sg.edu.rp.c347.id19045104.sgholiday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<Events> {

    private ArrayList<Events> events;
    private Context context;
    private TextView tvEvents;

    public EventAdapter(Context context, int resource, ArrayList<Events> objects){
        super(context,resource,objects);
        events = objects;
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvEvents = rowView.findViewById(R.id.tvEvents);


        Events currentEvent = events.get(position);

        tvEvents.setText(currentEvent.getEventName());

        return rowView;
    }


}
