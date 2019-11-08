package com.example.invuya.Profil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.invuya.R;

public class FaqActivity extends AppCompatActivity {
    LinearLayout expandableView, expandableView2,expandableView3,expandableView4,
        expandableView5,expandableView6,expandableView7,expandableView8,
            expandableView9,expandableView10;

    Button arrowBtn, arrowBtn2,arrowBtn3,arrowBtn4,arrowBtn5,arrowBtn6,arrowBtn7,arrowBtn8,arrowBtn9,
            arrowBtn10;
    CardView cardView, cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,
            cardView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        expandableView = findViewById(R.id.expandableView);
        expandableView2 = findViewById(R.id.expandableView2);
        expandableView3 = findViewById(R.id.expandableView3);
        expandableView4 = findViewById(R.id.expandableView4);
        expandableView5 = findViewById(R.id.expandableView5);
        expandableView6 = findViewById(R.id.expandableView6);
        expandableView7 = findViewById(R.id.expandableView7);
        expandableView8 = findViewById(R.id.expandableView8);
        expandableView9 = findViewById(R.id.expandableView9);
        expandableView10 = findViewById(R.id.expandableView10);

        arrowBtn = findViewById(R.id.arrowBtn);
        arrowBtn2 = findViewById(R.id.arrowBtn2);
        arrowBtn3 = findViewById(R.id.arrowBtn3);
        arrowBtn4 = findViewById(R.id.arrowBtn4);
        arrowBtn5 = findViewById(R.id.arrowBtn5);
        arrowBtn6 = findViewById(R.id.arrowBtn6);
        arrowBtn7 = findViewById(R.id.arrowBtn7);
        arrowBtn8 = findViewById(R.id.arrowBtn8);
        arrowBtn9 = findViewById(R.id.arrowBtn9);
        arrowBtn10 = findViewById(R.id.arrowBtn10);

        cardView = findViewById(R.id.cardView);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);
        cardView4 = findViewById(R.id.cardView4);
        cardView5 = findViewById(R.id.cardView5);
        cardView6 = findViewById(R.id.cardView6);
        cardView7 = findViewById(R.id.cardView7);
        cardView8 = findViewById(R.id.cardView8);
        cardView9 = findViewById(R.id.cardView9);
        cardView10 = findViewById(R.id.cardView10);
    }

    public void faq1(View view) {
        if (expandableView.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
            expandableView.setVisibility(View.VISIBLE);
            arrowBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
            expandableView.setVisibility(View.GONE);
            arrowBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }

    public void faq2(View view) {
        if (expandableView2.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
            expandableView2.setVisibility(View.VISIBLE);
            arrowBtn2.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
            expandableView2.setVisibility(View.GONE);
            arrowBtn2.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }

    public void faq3(View view) {
        if (expandableView3.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
            expandableView3.setVisibility(View.VISIBLE);
            arrowBtn3.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
            expandableView3.setVisibility(View.GONE);
            arrowBtn3.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }

    public void faq4(View view) {
        if (expandableView4.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
            expandableView4.setVisibility(View.VISIBLE);
            arrowBtn4.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
            expandableView4.setVisibility(View.GONE);
            arrowBtn4.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }

    public void faq5(View view) {
        if (expandableView5.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
            expandableView5.setVisibility(View.VISIBLE);
            arrowBtn5.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
            expandableView5.setVisibility(View.GONE);
            arrowBtn5.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }

    public void faq6(View view) {
        if (expandableView6.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
            expandableView6.setVisibility(View.VISIBLE);
            arrowBtn6.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
            expandableView6.setVisibility(View.GONE);
            arrowBtn6.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }

    public void faq7(View view) {
        if (expandableView7.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
            expandableView7.setVisibility(View.VISIBLE);
            arrowBtn7.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
            expandableView7.setVisibility(View.GONE);
            arrowBtn7.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }

    public void faq8(View view) {
        if (expandableView8.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
            expandableView8.setVisibility(View.VISIBLE);
            arrowBtn8.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
            expandableView8.setVisibility(View.GONE);
            arrowBtn8.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }

    public void faq9(View view) {
        if (expandableView9.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
            expandableView9.setVisibility(View.VISIBLE);
            arrowBtn9.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
            expandableView9.setVisibility(View.GONE);
            arrowBtn9.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }

    public void faq10(View view) {
        if (expandableView10.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(cardView10, new AutoTransition());
            expandableView10.setVisibility(View.VISIBLE);
            arrowBtn10.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(cardView10, new AutoTransition());
            expandableView10.setVisibility(View.GONE);
            arrowBtn10.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }
}
