package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    ImageView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private  String startGame="X";
    int b1 = 5,b2 = 5,b3 = 5,b4 = 5,b5 = 5,b6 = 5,b7 = 5,b8 = 5,b9 = 5, xCount=0,yCount =0,i=0;
    private TextView scoreX,scoreY;
    private Button reset;
    String firstPlayer,secondPlayer;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //to delete the title baR
        requestWindowFeature(Window.FEATURE_NO_TITLE);

// remove the notification bar or the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        setContentView(R.layout.activity_main);



        btn1= findViewById(R.id.buttonImage1);
        btn2 = findViewById(R.id.buttonImage2);
        btn3 = findViewById(R.id.buttonImage3);
        btn4 = findViewById(R.id.buttonImage4);
        btn5 = findViewById(R.id.buttonImage5);
        btn6 = findViewById(R.id.buttonImage6);
        btn7 = findViewById(R.id.buttonImage7);
        btn8 = findViewById(R.id.buttonImage8);
        btn9 = findViewById(R.id.buttonImage9);

        scoreX= findViewById(R.id.am1_txt_scoreX);
        scoreY = findViewById(R.id.am1_txt_scoreY);

        firstPlayer = getIntent().getStringExtra("playerOne");
        secondPlayer = getIntent().getStringExtra("playerTwo");

        scoreX.setText(firstPlayer+" : "+xCount);
        scoreY.setText(secondPlayer+" : "+yCount);


        reset = findViewById(R.id.am1_btn_reset);

        dialog = new Dialog(this);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetValues();
                resetButton();
                enabledButton();
                xCount =0;
                yCount =0;
                //scoreX.setText("Score X : "+String.valueOf(xCount));
                //scoreY.setText("Score O : "+String.valueOf(yCount));
                scoreX.setText(firstPlayer+" : "+xCount);
                scoreY.setText(secondPlayer+" : "+yCount);

            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X"))
                {
                    btn1.setImageResource(R.drawable.cross);
                    b1=1;
                    i++;
                }
                else
                {
                    btn1.setImageResource(R.drawable.circle);
                    b1=0;
                    i++;
                }
                btn1.setEnabled(false);
                choosePlayer();
                winningGame();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X"))
                {
                    btn2.setImageResource(R.drawable.cross);
                    b2=1;
                    i++;
                }
                else
                {
                    btn2.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                btn2.setEnabled(false);
                choosePlayer();
                winningGame();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X"))
                {
                    btn3.setImageResource(R.drawable.cross);
                    b3=1;
                    i++;
                }
                else
                {
                    btn3.setImageResource(R.drawable.circle);
                    b3=0;
                    i++;
                }btn3.setEnabled(false);

                choosePlayer();
                winningGame();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X"))
                {
                    btn4.setImageResource(R.drawable.cross);
                    b4=1;
                    i++;
                }
                else
                {
                    btn4.setImageResource(R.drawable.circle);
                    b4=0;
                    i++;
                }
                btn4.setEnabled(false);
                choosePlayer();
                winningGame();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X"))
                {
                    btn5.setImageResource(R.drawable.cross);
                    b5=1;
                    i++;
                }
                else
                {
                    btn5.setImageResource(R.drawable.circle);
                    b5=0;
                    i++;
                }
                btn5.setEnabled(false);
                choosePlayer();
                winningGame();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X"))
                {
                    btn6.setImageResource(R.drawable.cross);
                    b6=1;
                    i++;
                }
                else
                {
                    btn6.setImageResource(R.drawable.circle);
                    b6=0;
                    i++;
                }btn6.setEnabled(false);

                choosePlayer();
                winningGame();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X"))
                {
                    btn7.setImageResource(R.drawable.cross);
                    b7=1;
                    i++;
                }
                else
                {
                    btn7.setImageResource(R.drawable.circle);
                    b7=0;
                    i++;
                }btn7.setEnabled(false);

                choosePlayer();
                winningGame();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X"))
                {
                    btn8.setImageResource(R.drawable.cross);
                    b8=1;
                    i++;
                }
                else
                {
                    btn8.setImageResource(R.drawable.circle);
                    b8=0;
                    i++;
                }btn8.setEnabled(false);

                choosePlayer();
                winningGame();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X"))
                {
                    btn9.setImageResource(R.drawable.cross);
                    b9=1;
                    i++;
                }
                else
                {
                    btn9.setImageResource(R.drawable.circle);
                    b9=0;
                    i++;
                }
                btn9.setEnabled(false);

                choosePlayer();
                winningGame();
            }
        });

    }

    // enabling the button again to play
    private void enabledButton() {
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
    }

    private  void choosePlayer()
    {
        if(startGame.equals("X"))
        {
            startGame="O";
        }
        else {
            startGame ="X";
        }
    }

    private  void winningGame()
    {
        if((b1 == 1) && b2 ==1 && b3==1)
        {
            XwinningMessage();
        }

        else if((b4 == 1) && b5 ==1 && b6==1)
        {
            XwinningMessage();
        }
        else if((b7== 1) && b8 ==1 && b9==1)
        {
            XwinningMessage();
        }

        else if((b1 == 1) && b4 ==1 && b7==1)
        {
            XwinningMessage();
        }

        else if((b2 == 1) && b5 ==1 && b8==1)
        {
            XwinningMessage();
        }

        else if((b3 == 1) && b6 ==1 && b9==1)
        {
            XwinningMessage();
        }
        else if((b1 == 1) && b5 ==1 && b9==1)
        {
            XwinningMessage();
        }
        else if((b3 == 1) && b5 ==1 && b7==1)
        {
            XwinningMessage();
        }

        else if(b1==0 && b2==0 && b3==0)
        {
            YwinningMessage();
        }
        else if(b4==0 && b5==0 && b6==0)
        {
            YwinningMessage();
        }
        else if(b7==0 && b8==0 && b9==0)
        {
            YwinningMessage();
        }
        else if(b1==0 && b4==0 && b7==0)
        {
            YwinningMessage();
        }
        else if(b2==0 && b5==0 && b8==0)
        {
            YwinningMessage();
        }
        else if(b3==0 && b6==0 && b9==0)
        {
            YwinningMessage();
        }
        else if(b1==0 && b5==0 && b9==0)
        {
            YwinningMessage();
        }
        else if(b3==0 && b5==0 && b7==0)
        {
            YwinningMessage();
        }

        else
        {
            if(i==9)
            {
                noOneWIns();
            }
        }




    }

    private void resetValues() {
        b1 = 5;b2 = 5;b3 = 5;b4 = 5;b5 = 5;b6 = 5;b7 = 5;b8 = 5;b9 = 5;i=0;
    }

    private void resetButton()
    {
        btn1.setImageDrawable(null);
        btn2.setImageDrawable(null);
        btn3.setImageDrawable(null);
        btn4.setImageDrawable(null);
        btn5.setImageDrawable(null);
        btn6.setImageDrawable(null);
        btn7.setImageDrawable(null);
        btn8.setImageDrawable(null);
        btn9.setImageDrawable(null);
    }

    private  void XwinningMessage()
    {
        dialog.setContentView(R.layout.win_x_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Button play_again = dialog.findViewById(R.id.am1_button);
        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                resetButton();
                resetValues();
            }
        });
        dialog.show();
        xCount++;
        scoreX.setText(firstPlayer+" : "+xCount);
        enabledButton();
    }

    private  void YwinningMessage()
    {
        dialog.setContentView(R.layout.win_y_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Button play_again = dialog.findViewById(R.id.am1_o_playAgain);
        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                resetButton();
                resetValues();
            }
        });
        dialog.show();
        yCount++;
        scoreY.setText(secondPlayer+" : "+yCount);
        enabledButton();
    }

    private  void noOneWIns() {
        dialog.setContentView(R.layout.lose_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Button no = dialog.findViewById(R.id.am1_lose_playAgain);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                resetButton();
                resetValues();
            }
        });
        dialog.show();
        enabledButton();
    }



    @Override
    protected void onDestroy() {
        // if we clicked the back button than it will completely shut down the app
        super.onDestroy();
    }


}
//min
