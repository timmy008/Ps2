package com.timmy008.ps2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int totalA = 0;
    private int totalB = 0;
    private TextView mTvA;
    private TextView mTvB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        mTvA = (TextView) findViewById(R.id.tv_a);
        mTvA.setText(getString(R.string.total, 0));
        mTvB = (TextView) findViewById(R.id.tv_b);
        mTvB.setText(getString(R.string.total, 0));
    }

    public void addA(View v) {
        ++totalA;
        mTvA.setText(getString(R.string.total, totalA));
    }

    public void addB(View v) {
        ++totalB;
        mTvB.setText(getString(R.string.total, totalB));
    }

    public void onReset(View v) {
        totalA = 0;
        totalB = 0;
        mTvA.setText(getString(R.string.total, totalA));
        mTvB.setText(getString(R.string.total, totalB));

    }
}
