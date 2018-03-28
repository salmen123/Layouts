package tn.esprit.salmen.layouts;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView head, body, leftHand, rightHand, leftLeg, RightLeg, logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logo = (ImageView) findViewById(R.id.sim);
        head = (ImageView) findViewById(R.id.head);
        body = (ImageView) findViewById(R.id.body);
        leftHand = (ImageView) findViewById(R.id.left_hand);
        rightHand = (ImageView) findViewById(R.id.right_hand);
        leftLeg = (ImageView) findViewById(R.id.left_leg);
        RightLeg = (ImageView) findViewById(R.id.right_leg);

        startAnim();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent i = new Intent(SplashActivity.this, LayoutsActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }

    private void startAnim() {
        animate(head, R.anim.bounce);
        animate(leftHand, R.anim.bounce);
        animate(rightHand, R.anim.bounce);
        animate(body, R.anim.zoom_in);
        animate(leftLeg, R.anim.bounce);
        animate(RightLeg, R.anim.bounce);
        animate(logo, R.anim.top_in);
    }

    private void animate(ImageView img , int id) {
        Animation a = AnimationUtils.loadAnimation(this, id);
        a.reset();
        img.clearAnimation();
        img.startAnimation(a);
    }
}
