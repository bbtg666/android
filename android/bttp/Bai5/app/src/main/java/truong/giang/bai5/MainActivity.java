package truong.giang.bai5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int[][] Bobai = {
            {R.drawable.ba,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6,R.drawable.b7,R.drawable.b8,R.drawable.b9,R.drawable.b10,R.drawable.bj,R.drawable.bq,R.drawable.bk},
            {R.drawable.ca,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,R.drawable.c6,R.drawable.c7,R.drawable.c8,R.drawable.c9,R.drawable.c10,R.drawable.cj,R.drawable.cq,R.drawable.ck},
            {R.drawable.aa,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10,R.drawable.aj,R.drawable.aq,R.drawable.ak},
            {R.drawable.coa,R.drawable.co2,R.drawable.co3,R.drawable.co4,R.drawable.co5,R.drawable.co6,R.drawable.co7,R.drawable.co8,R.drawable.co9,R.drawable.co10,R.drawable.c0j,R.drawable.coq,R.drawable.cok}
    };
    ImageButton imb1, imb2, imb3;
    Button btn;
    TextView txv;
    int sum = 0, check = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEven();
    }
    public void setControl(){
        imb1 = (ImageButton) findViewById(R.id.imb1);
        imb2 = (ImageButton) findViewById(R.id.imb2);
        imb3 = (ImageButton) findViewById(R.id.imb3);
        btn = (Button) findViewById(R.id.btnAgain);
        txv = (TextView) findViewById((R.id.txv));
    }
    public void setEven(){
        imb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imb1.setImageResource(Bobai[rows()][collums()]);
                check++;
                imb1.setEnabled(false);
                if (check == 3){
                    sum %= 10;
                    txv.setText("Score: " + sum);
                    check = 0;
                }
            }
        });
        imb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imb2.setImageResource(Bobai[rows()][collums()]);
                check++;
                imb2.setEnabled(false);
                if (check == 3){
                    sum %= 10;
                    txv.setText("Score: " + sum);
                    check = 0;
                }
            }
        });
        imb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imb3.setImageResource(Bobai[rows()][collums()]);
                check++;
                imb3.setEnabled(false);
                if (check == 3){
                    sum %= 10;
                    txv.setText("Score: " + sum);
                    check = 0;
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imb1.setEnabled(true);
                imb1.setImageResource(R.drawable.image006);
                imb2.setEnabled(true);
                imb2.setImageResource(R.drawable.image006);
                imb3.setEnabled(true);
                imb3.setImageResource(R.drawable.image006);
                txv.setText("Score: 0");
                sum = 0;
            }
        });
    }
    public int rows(){
        Random random = new Random();
        int ranDom = random.nextInt(4);
        return ranDom;
    }
    public int collums(){
        Random random = new Random();
        int ranDom = random.nextInt(13);
        if(ranDom <9 ) sum += ranDom + 1;
        return ranDom;
    }
}
