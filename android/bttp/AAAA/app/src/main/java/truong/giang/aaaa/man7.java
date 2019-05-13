package truong.giang.aaaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class man7 extends AppCompatActivity {

    ArrayAdapter adapter;
    ArrayList<String> KQ;
    ListView lvKQ;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man7);
        setControl();
        setEven();
    }

    private void setEven() {
        KQ = new ArrayList<>();
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dulieu");
        String ten = bundle.getString("Ten");
        String cau1 = bundle.getString("cau1");
        String cau2 = bundle.getString("cau2");
        String cau3 = bundle.getString("cau3");
        String cau4 = bundle.getString("cau4");
        String cau5 = bundle.getString("cau5");

        tv.setText("Kết quả của " + ten + " là: ");


        if(cau1 != null){
            if(cau1.equalsIgnoreCase( "Con chó")) {
                KQ.add("Câu 1 đúng!");
            }else {
                KQ.add("Câu 1 sai!");
            }
        }else {
            KQ.add("Câu 1 chưa có làm!!!");
        }
        if(cau2 != null){
            if(cau2.equalsIgnoreCase( "Con gà Con người ")) {
                KQ.add("Câu 2 đúng!");
            }else {
                KQ.add("Câu 2 sai!");
            }
        }else {
            KQ.add("Câu 2 chưa có làm!!!");
        }
        if(cau3 != null){
            if(cau3.equalsIgnoreCase( "Đúng Đúng Hên xui ")) {
                KQ.add("Câu 3 đúng!");
            }else {
                KQ.add("Câu 3 sai!");
            }
        }else {
            KQ.add("Câu 3 chưa có làm!!!");
        }
        if(cau4 != null){
            if(cau4.equalsIgnoreCase( "true false true ")) {
                KQ.add("Câu 4 đúng!");
            }else {
                KQ.add("Câu 4 sai!");
            }
        }else {
            KQ.add("Câu 4 chưa có làm!!!");
        }
        if(cau5 != null){
            if(cau5.equalsIgnoreCase( "true true true ")) {
                KQ.add("Câu 5 đúng!");
            }else {
                KQ.add("Câu 5 sai!");
            }
        }else {
            KQ.add("Câu 5 chưa có làm!!!");
        }

        adapter = new ArrayAdapter(man7.this, android.R.layout.simple_list_item_1, KQ);
        lvKQ.setAdapter(adapter);
    }

    private void setControl() {
        lvKQ = findViewById(R.id.lvKQ);
        tv = findViewById(R.id.textView);
    }
    private Bundle NhanDuLieu(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dulieu");
        return bundle;
    }
}
