package truong.giang.bai4;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    Button btn;
    CheckBox cbB, cbT, cbC;
    Random a= new Random();
    TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEven();
    }
    public void setControl(){
        rg = (RadioGroup) findViewById(R.id.rg);
        cbB = (CheckBox) findViewById(R.id.cbB);
        cbT = (CheckBox) findViewById(R.id.cbT);
        cbC = (CheckBox) findViewById(R.id.cbC);
        btn = (Button) findViewById(R.id.btnShow);
        txv = (TextView) findViewById(R.id.txvHt);
    }
    public void setEven(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuly();
            }
        });
    }
    public void xuly(){

        if(cbB.isChecked()) {
            txv.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            txv.setBackgroundColor(Color.TRANSPARENT);
        }
        if(cbC.isChecked()){
            txv.setGravity(Gravity.CENTER);
        }
        else{
            txv.setGravity(Gravity.NO_GRAVITY);
        }
        if(cbT.isChecked()){
            txv.setTextColor(Color.RED);
        }
        else{
            txv.setTextColor(Color.WHITE);
        }
        int ID = rg.getCheckedRadioButtonId();
        switch (ID) {
            case R.id.rdbOdd : txv.setText(OddEven(1)+" "); break;
            case R.id.rdbEven :txv.setText(OddEven(0)+" "); break;
            case R.id.rdbBoth :txv.setText(a.nextInt(1000000)+" ");
        }
    }
    public int OddEven(int i) {
        Random random = new Random();
        int ranDom = 1 + random.nextInt(1000000);
        if (ranDom % 2 == 0 && i == 0) {
            return ranDom;
        } else if (ranDom % 2 != 0 && i == 0){
            return ranDom - 1;
        }else if (ranDom%2 == 0 && i == 1){
            return ranDom - 1;
        }else {
            return ranDom;
        }
    }
}
