package com.example.samd_lab_7; 
  import android.app.Activity; import android.os.Bundle; import android.view.View; import android.widget.AdapterView; 
import android.widget.AdapterView.OnItemClickListener; import android.widget.ListView; 
 import java.util.ArrayList; import java.util.HashMap; 
 
public class MainActivity extends Activity { 
    static final String KEY_SONG = "song"; // parent node     static final String KEY_ID = "id";     static final String KEY_TITLE = "title";     static final String KEY_ARTIST = "artist";     static final String KEY_DURATION = "duration";     static final String KEY_THUMB_URL = "thumb_url"; 
    ListView list; 
    LazyAdapter adapter; 
 
    @Override 
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);         setContentView(R.layout.activity_main); 
        ArrayList<HashMap<String, String>> songsList = new ArrayList<HashMap<String,                 String>>(); 
        for (int i = 0; i < 30; i++) { 
            HashMap<String, String> map = new HashMap<String, String>();             map.put(KEY_ID, getResources().getStringArray(R.array.id)[i]);             map.put(KEY_TITLE, getResources().getStringArray(R.array.title)[i]);             map.put(KEY_ARTIST, getResources().getStringArray(R.array.artist)[i]);             map.put(KEY_DURATION, 
getResources().getStringArray(R.array.duration)[i]);             songsList.add(map); 
        } 
        list = (ListView) findViewById(R.id.list);         adapter = new LazyAdapter(this, songsList);         list.setAdapter(adapter); 
        list.setOnItemClickListener(new OnItemClickListener() {             @Override 
            public void onItemClick(AdapterView<?> parent, View view,                                     int position, long id) { 
            } 
        }); 
    } 
} 
