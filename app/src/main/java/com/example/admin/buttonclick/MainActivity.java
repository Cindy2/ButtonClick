package com.example.admin.buttonclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mButton,mButton0,mButton1,mButton2,mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.hello);
//        mButton0 = (Button) findViewById(R.id.button);
//        mButton1 = (Button) findViewById(R.id.click1);
//        mButton2 = (Button) findViewById(R.id.click2);
//        mButton3 = (Button) findViewById(R.id.click3);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You click hello word", Toast.LENGTH_SHORT).show();
            }
        });
//        mButton0.setOnClickListener((View.OnClickListener) this);
    }
//    @Override
//    public void onClick(View v){
//        System.out.print("第二个按钮被点击了");
//    }
    public void ButtonClick(View v){
        int id = v.getId();
        switch (id){
            case R.id.click1:
                System.out.print("520");
                break;
            case R.id.click2:
                System.out.print("1314");
                break;
            case R.id.click3:
                System.out.print("666");
                break;
        }
    }


}
