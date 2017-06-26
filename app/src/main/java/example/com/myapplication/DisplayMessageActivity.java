package example.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display_message2);

        // Get the message from the intent
        Intent intent = getIntent();
        String num1 = intent.getStringExtra("num1");
        String num2 = intent.getStringExtra("num2");



        if(num1.equals("2") && num2.equals("2")){
            ImageView image = new ImageView(this);
            image.setImageResource(R.drawable.funny);
            setContentView(image);
        }else{
            TextView textView = new TextView(this);
            textView.setGravity(Gravity.CENTER);
            textView.setTextSize(20);
            textView.setText("Both Numbers must be 2.");

            setContentView(textView);
        }


        //ViewGroup.LayoutParams params;
        //addContentView(textView,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        //final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle app bar item clicks here. The app bar
        // automatically handles clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
