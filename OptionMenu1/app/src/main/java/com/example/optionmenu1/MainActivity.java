package com.example.optionmenu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem item1 = menu.add(0, 1, 0, "사과");
        item1 = menu.add(0, 2, 0, "포도");
        item1 = menu.add(0, 3, 0, "바나나");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.apple:
                Toast.makeText(getApplicationContext(), "사과", Toast.LENGTH_LONG).show();
                break;
            case R.id.grape:
                Toast.makeText(getApplicationContext(), "포도", Toast.LENGTH_LONG).show();
                break;
            case R.id.banana:
                Toast.makeText(getApplicationContext(), "바나나", Toast.LENGTH_LONG).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}