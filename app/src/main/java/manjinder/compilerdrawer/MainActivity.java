package manjinder.compilerdrawer;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    int i=0,j=0,k=0;
    TextView textView1,textView2,textView3;
    RelativeLayout line1,line2,line3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Ques= (Button) findViewById(R.id.question);
        line1=(RelativeLayout) findViewById(R.id.linear1);
        line2=(RelativeLayout) findViewById(R.id.linear2);
        line3=(RelativeLayout)findViewById(R.id.linear3);


        textView1=(TextView)findViewById(R.id.text1);
        textView2=(TextView)findViewById(R.id.text2);
        textView3=(TextView)findViewById(R.id.text3);

        mDrawerLayout =(DrawerLayout)findViewById(R.id.drawer);
        mToggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        line1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if (i == 0) {
                    Log.d("", "onClick: ");
                    textView1.setVisibility(View.VISIBLE);
                    textView1.setText("hello how are youdkvsuhinfva asdvoih yvhisdgu dsizchio zdvps dsijvhi zxis ;odshv osh;oh vocgxi ooivhdhofvy hxi;h xhcjo xchvo xcihvob hodfvihsoifu xocfihso sofdhoazj zsodhcfov zsodfhiozshdfo o sdoihvfihodsf bozdhfo hio odzho");
                    i = 1;
                }
                else{
                    textView1.setVisibility(View.GONE);
                    i=0;
                }
            }
        });


        line2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j==0) {
                    Log.d("", "onClick: ");
                    textView2.setVisibility(View.VISIBLE);
                    textView2.setText(" how are youniovns sdvifyos fyovi odsivho sfhos osvusfdo osjfsddh vos vfdshhvaw ofwo voios voafsjsd vosfhosdv osdfhoshosad cohsfdovh o LDHDSOI FSOHV O DO");
               j=1;
                }
                else {
                    textView2.setVisibility(View.GONE);
                    j=0;
                }

            }

        });

        line3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k==0) {
                    Log.d("", "onClick: ");
                    textView3.setVisibility(View.VISIBLE);
                    textView3.setText(" how are youniovns sdvifyos fyovi odsivho sfhos osvusfdo osjfsddh vos vfdshhvaw ofwo voios voafsjsd vosfhosdv osdfhoshosad cohsfdovh o LDHDSOI FSOHV O DO");
                    k=1;
                }
                else {
                    textView3.setVisibility(View.GONE);
                    k=0;
                }

            }

        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
