package com.example.bharatinterncalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
CardView cardViewAc, cardViewDev, cardViewMul, cardViewDel, cardView7, cardView8, cardView9, cardViewMin, cardView4, cardView5, cardView6, cardViewAdd, cardView1, cardView2, cardView3, cardViewMod, cardViewDecimal, cardView0, cardViewPercentage, cardViewEquals;
TextView inputTxt, outputTxt;
String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView0 = findViewById(R.id.cardView0);
        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);
        cardView4 = findViewById(R.id.cardView4);
        cardView5 = findViewById(R.id.cardView5);
        cardView6 = findViewById(R.id.cardView6);
        cardView7 = findViewById(R.id.cardView7);
        cardView8 = findViewById(R.id.cardView8);
        cardView9 = findViewById(R.id.cardView9);
        cardViewAc = findViewById(R.id.cardViewAC);
        cardViewDev = findViewById(R.id.cardViewDiv);
        cardViewMul = findViewById(R.id.cardViewMul);
        cardViewDel = findViewById(R.id.cardViewDel);
        cardViewMin = findViewById(R.id.cardViewMin);
        cardViewAdd = findViewById(R.id.cardViewAdd);
        cardViewMod = findViewById(R.id.cardViewMod);
        cardViewDecimal = findViewById(R.id.cardViewDecimal);
        cardViewPercentage = findViewById(R.id.cardViewPercentage);
        cardViewEquals = findViewById(R.id.cardViewEquals);
        inputTxt = findViewById(R.id.input);
        outputTxt = findViewById(R.id.output);


        cardView0.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardView0, event);
                /* Handle other actions for this card view */
                return false;
            }
        });

        cardView1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardView1, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardView2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardView2, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardView3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardView3, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardView4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardView4, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardView5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardView5, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardView6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardView6, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardView7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardView7, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardView8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardView8, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardView9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardView9, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardViewAc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardViewAc, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardViewDev.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardViewDev, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardViewMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardViewMul, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardViewDecimal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardViewDecimal, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardViewPercentage.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(cardViewPercentage, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardViewDel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouchPink(cardViewDel, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardViewMin.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouchPink(cardViewMin, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardViewAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouchPink(cardViewAdd, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardViewMod.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouchPink(cardViewMod, event);
                // Handle other actions for this card view
                return false;
            }
        });

        cardViewEquals.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouchPink(cardViewEquals, event);
                // Handle other actions for this card view
                return false;
            }
        });


        cardView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+"0");
            }
        });

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+"1");
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+"2");
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+"3");
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+"4");
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+"5");
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+"6");
            }
        });

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+"7");
            }
        });

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+"8");
            }
        });

        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+"9");
            }
        });

        cardViewAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText("");
                outputTxt.setText("0");
            }
        });

        cardViewDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                int length = data.length();
                if (length > 0) {
                    // Remove the last character from the string
                    data = data.substring(0, length - 1);
                    inputTxt.setText(data);
                }
            }
        });

        cardViewDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+".");
            }
        });

        cardViewAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+" + ");
            }
        });

        cardViewMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+" - ");
            }
        });

        cardViewMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+" x ");
            }
        });

        cardViewDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+" / ");
            }
        });

        cardViewMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+" mod ");
            }
        });

        cardViewPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data+" % ");
            }
        });

        cardViewEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();

                data = data.replaceAll(" x ", "*");
                data = data.replaceAll(" % ", "/100");
                data = data.replaceAll(" / ", "/");
                data = data.replaceAll(" + ", "+");
                data = data.replaceAll(" - ", "-");
                data = data.replaceAll(" mod ", "%");


                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult = "";

                Scriptable scriptable = rhino.initSafeStandardObjects();
                finalResult = rhino.evaluateString(scriptable, data, "Javascript", 1, null).toString();

                if(inputTxt.getText().toString().equals("")){
                    outputTxt.setText("Enter Values");
                }
                else{
                    outputTxt.setText(finalResult);
                }
            }
        });

    }
    private void handleTouch(CardView cardView, MotionEvent event) {
        int defaultColor = ContextCompat.getColor(this, R.color.card_default_color);
        int clickedColor = ContextCompat.getColor(this, R.color.card_clicked_color);

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                // Finger is pressed, change background color
                cardView.setCardBackgroundColor(clickedColor);
                break;
            case MotionEvent.ACTION_UP:
                // Finger is lifted, revert back to default background color
                cardView.setCardBackgroundColor(defaultColor);
                break;
        }
    }

    private void handleTouchPink(CardView cardView, MotionEvent event) {
        int defaultColor = ContextCompat.getColor(this, R.color.card_default_pink);
        int clickedColor = ContextCompat.getColor(this, R.color.card_clicked_color);

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                // Finger is pressed, change background color
                cardView.setCardBackgroundColor(clickedColor);
                break;
            case MotionEvent.ACTION_UP:
                // Finger is lifted, revert back to default background color
                cardView.setCardBackgroundColor(defaultColor);
                break;
        }
    }
}