package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;

    int condition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById (R.id.storyTextView);
        mButtonTop = (Button) findViewById (R.id.buttonTop);
        mButtonBottom = (Button) findViewById (R.id.buttonBottom);

        condition = 1;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick ( View v ) {
                if (condition == 1){
                    mStoryTextView.setText (R.string.T3_Story);
                    mButtonTop.setText (R.string.T3_Ans1);
                    mButtonBottom.setText (R.string.T3_Ans2);
                    condition++;
                } else if (condition == 2){
                    mStoryTextView.setText (R.string.T6_End);
                    mButtonTop.setVisibility (View.INVISIBLE);
                    mButtonBottom.setVisibility (View.INVISIBLE);
                } else if (condition == 3){
                    mStoryTextView.setText (R.string.T3_Story);
                    mButtonTop.setText (R.string.T3_Ans1);
                    mButtonBottom.setText (R.string.T3_Ans2);
                    condition += 2;
                } else if (condition == 5){
                    mStoryTextView.setText (R.string.T6_End);
                    mButtonTop.setVisibility (View.INVISIBLE);
                    mButtonBottom.setVisibility (View.INVISIBLE);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick ( View v ) {
                if (condition == 1){
                    mStoryTextView.setText (R.string.T2_Story);
                    mButtonTop.setText (R.string.T2_Ans1);
                    mButtonBottom.setText (R.string.T2_Ans2);
                    condition += 2;
                }else if (condition == 2){
                    mStoryTextView.setText (R.string.T5_End);
                    mButtonTop.setVisibility (View.INVISIBLE);
                    mButtonBottom.setVisibility (View.INVISIBLE);
                }else if (condition == 3){
                    mStoryTextView.setText (R.string.T4_End);
                    mButtonTop.setVisibility (View.INVISIBLE);
                    mButtonBottom.setVisibility (View.INVISIBLE);
                }else if (condition == 5){
                    mStoryTextView.setText (R.string.T5_End);
                    mButtonTop.setVisibility (View.INVISIBLE);
                    mButtonBottom.setVisibility (View.INVISIBLE);
                }
            }
        });
    }
}
