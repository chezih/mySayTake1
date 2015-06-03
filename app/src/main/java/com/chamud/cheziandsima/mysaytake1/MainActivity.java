package com.chamud.cheziandsima.mysaytake1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.chamud.cheziandsima.mysaytake1.Model.User;


public class MainActivity extends ActionBarActivity {

    TextView resultTextView;
    EditText idEditText;
    BL bl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = (TextView) findViewById(R.id.resultTextView);
        idEditText = (EditText) findViewById(R.id.idEditText);
        bl = new BL();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void getTheName(View view) {

       String id = idEditText.getText().toString();
        if (id.matches("")) {
            Toast.makeText(this, "Please type an ID", Toast.LENGTH_SHORT).show();
            return;
        }

        User user = bl.getUserByID(Integer.parseInt(idEditText.getText().toString()));
        resultTextView.setText(user.getName());


    }
}
