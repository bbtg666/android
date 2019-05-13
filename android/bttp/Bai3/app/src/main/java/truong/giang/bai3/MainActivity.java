package truong.giang.bai3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioButton rdbB, rdbC, rdbD, rdbR, rdbP;
    RadioGroup rg;
    ImageView imvAnh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEven();

    }
    public void setControl(){
        rg = (RadioGroup) findViewById(R.id.rdg);
        imvAnh = (ImageView) findViewById(R.id.imvAnh);
    }
    public void setEven(){
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id = checkedId;
                if( id == R.id.rdbBird)
                {
                    imvAnh.setImageResource(R.drawable.bird);
                }
                if( id == R.id.rdbCat)
                {
                    imvAnh.setImageResource(R.drawable.cat);
                }
                if( id == R.id.rdbDog)
                {
                    imvAnh.setImageResource(R.drawable.dog);
                }
                if( id == R.id.rdbTho)
                {
                    imvAnh.setImageResource(R.drawable.rabbit);
                }
                if( id == R.id.rdbPig)
                {
                    imvAnh.setImageResource(R.drawable.pig);
                }

            }
        });

    }

}
