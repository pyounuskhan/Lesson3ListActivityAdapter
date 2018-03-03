package ifirst.co.lesson3listactivityadapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] countries = new String[]{"China", "France", "Germany", "India", "Russia", "United Kingdom", "United States",
                "Pakistan", "Zimbabwe", "UAE", "Kuwait", "Poland", "Iran", "Iraq",
                "Uzakistan", "Colombo", "Toronto", "Spain", "Egypt", "Denmark", "Australia"};
        ListAdapter countryAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, countries);
        setListAdapter(countryAdapter);
        getListView().setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent,
                                            View view, int position, long id) {
                        String s = ((TextView) view).getText() + " " + position;
                        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}