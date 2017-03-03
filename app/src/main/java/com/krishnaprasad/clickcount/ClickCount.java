package com.krishnaprasad.clickcount;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ClickCount extends AppCompatActivity {

    TextView countValue,backCountValue;
    int count,backCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_count);
        setContentView(R.layout.activity_click_count);
        countValue = (TextView) this.findViewById(R.id.countValue);
        backCountValue = (TextView) this.findViewById(R.id.backCountValue);

    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_click_count);
            countValue = (TextView) this.findViewById(R.id.countValue);
            backCountValue = (TextView) this.findViewById(R.id.backCountValue);
            backCountValue.setText(String.valueOf(backCount));
            countValue.setText(String.valueOf(count));
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_click_count);
            countValue = (TextView) this.findViewById(R.id.countValue);
            backCountValue = (TextView) this.findViewById(R.id.backCountValue);
            backCountValue.setText(String.valueOf(backCount));
            countValue.setText(String.valueOf(count));

        }
    }
    public void increment(View Button) {
        count++;
        countValue.setText(String.valueOf(count));
    }

    protected void onStop() {
        super.onStop();
        backCount++;
        backCountValue.setText(String.valueOf(backCount));
    }

}
