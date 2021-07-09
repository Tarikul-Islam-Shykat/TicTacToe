package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class input extends AppCompatActivity {

    Button next;
    EditText name1, name2;
    String first_player,second_player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_input);

        LottieAnimationView lottieAnimationView = findViewById(R.id.am2_loading);

        name1= findViewById(R.id.edt_enter_Name1);
        name2 =  findViewById(R.id.edt_enter_Name2);

        next = findViewById(R.id.am2_next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeKeyBoard();
                first_player = name1.getText().toString();
                second_player = name2.getText().toString();

                if(first_player.equals("") && second_player.equals(""))
                {
                    Toast.makeText(input.this, "Please enter name", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    // this will play the animation
                    lottieAnimationView.playAnimation();
                    lottieAnimationView.loop(false);
                    lottieAnimationView.setSpeed(2);

                    final Intent intent = new Intent(input.this, MainActivity.class);

                    intent.putExtra("playerOne",first_player);
                    intent.putExtra("playerTwo",second_player);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(intent);
                            finish();
                        }
                    },1200);

                }




            }
        });
    }
    private void closeKeyBoard()
    {
        View view = this.getCurrentFocus();
        if(view!=null)
        {
            InputMethodManager manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            manager.hideSoftInputFromWindow(view.getWindowToken(),0);
        }
    }
}