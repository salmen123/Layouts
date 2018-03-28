package tn.esprit.salmen.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class LayoutsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        setTitle("Relative Layout");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_relative:
                setContentView(R.layout.activity_relative);
                setTitle("Relative Layout");
                break;
            case R.id.action_linear:
                setContentView(R.layout.activity_linear);
                setTitle("Linear Layout");
                break;
            case R.id.action_constraint:
                setContentView(R.layout.activity_constraint);
                setTitle("Constraint Layout");
                break;
            default:

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
