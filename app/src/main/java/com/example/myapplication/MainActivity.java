package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btClear;
    Button btCounter;
    private int Cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //各ボタンのIDを所得する
        btClear = findViewById(R.id.button_clear);
        btCounter = findViewById(R.id.button_counter);

        //カウンターボタンのテキストサイズを設定する
        btCounter.setTextSize(24f);

        //各ボタンのリスナークラスを尊く
        btClear.setOnClickListener(new clearListener());
        btCounter.setOnClickListener(new counterListener());


    }

    //クリアボタンのリスナークラスを作る
    private class clearListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Cnt=0; //カウントをクリア

        }
    }

    //カウンターボタンのクラス
    private class counterListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Cnt++; //カウンターインクリメント
            btCounter.setText(String.valueOf(Cnt));
        }
    }

}