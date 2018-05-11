package com.bob.mygit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_feature_1;
    private Button btn_feature_2;
    private Button btn_feature_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"gitgit",Toast.LENGTH_SHORT).show();
        Log.d("ysx","完成第一个功能");
        btn_feature_1 = (Button) findViewById(R.id.btn_feature_1);
        btn_feature_2 = (Button) findViewById(R.id.btn_feature_2);
        btn_feature_4 = (Button) findViewById(R.id.btn_feature_4);
    }

    /**
     * feature-1
     * display HelloWorld
     * @param view
     */
    public void feature1(View view) {
        if (btn_feature_1.getText().toString().equals("功能1")) {
            btn_feature_1.setText(R.string.feature_1_dis);
        } else {
            btn_feature_1.setText(R.string.feature_1);
        }
    }

    /**
     * feature-2
     * display HelloAndroid
     * @param view
     */
    public void feature2(View view) {
        if (btn_feature_2.getText().toString().equals("功能2")) {
            btn_feature_2.setText(R.string.feature_2_dis);
        } else {
            btn_feature_2.setText(R.string.feature_2);
        }
    }


    /**
     * feature-4
     * display Hello
     * @param view
     */
    public void feature4(View view) {
        btn_feature_4.setText(R.string.feature_4_dis);
    }
}
