package com.example.a20200426radiobtn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioG;
    RadioButton rbtn1, rbtn2, rbtn3;
    ImageView avengers, mission_impossible, bat_man;
    Button sent;
    Animation alpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioG = (RadioGroup) findViewById(R.id.radioG);
        rbtn1 = (RadioButton) findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton) findViewById(R.id.rbtn2);
        rbtn3 = (RadioButton) findViewById(R.id.rbtn3);
        avengers = (ImageView) findViewById(R.id.avengers);
        mission_impossible = (ImageView) findViewById(R.id.mission_impossible);
        bat_man = (ImageView) findViewById(R.id.bat_man);
        sent = (Button) findViewById(R.id.button);

        alpha = AnimationUtils.loadAnimation(this,R.anim.img_anim);

        final Toast toast = Toast.makeText(this, "系統錯誤",Toast.LENGTH_LONG);

        sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (radioG.getCheckedRadioButtonId()){
                    case R.id.rbtn1 :
                        mission_impossible.setVisibility(View.INVISIBLE);
                        bat_man.setVisibility(View.INVISIBLE);
                        avengers.setVisibility(View.VISIBLE);
                        avengers.setAnimation(alpha);
                        break;
                    case R.id.rbtn2 :
                        avengers.setVisibility(View.INVISIBLE);
                        bat_man.setVisibility(View.INVISIBLE);
                        mission_impossible.setVisibility(View.VISIBLE);
                        mission_impossible.setAnimation(alpha);
                        break;
                    case R.id.rbtn3 :
                        avengers.setVisibility(View.INVISIBLE);
                        mission_impossible.setVisibility(View.INVISIBLE);
                        bat_man.setVisibility(View.VISIBLE);
                        bat_man.setAnimation(alpha);
                        break;
                    default:
                        toast.show();
                }
            }
        });


    }
}
