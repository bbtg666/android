package truong.giang.bai1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText editTen,editCMND,editBosung;
    CheckBox chkdocbao,chkdocsach,chkdoccode;
    Button btn;
    RadioGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEven();
    }
    public void setControl(){
        editTen=(EditText) findViewById(R.id.edtTen);
        editCMND=(EditText) findViewById(R.id.edtCMND);
        editBosung=(EditText) findViewById(R.id.edtBoSung);
        chkdocbao=(CheckBox) findViewById(R.id.ckbDocBao);
        chkdoccode=(CheckBox) findViewById(R.id.ckbDoccoding);
        chkdocsach=(CheckBox) findViewById(R.id.ckbXemSach);
        btn=(Button) findViewById(R.id.btnNhan);
        group=(RadioGroup) findViewById(R.id.rdgBC);
    }
    public void setEven() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShowInformation();
            }
        });
    }
    public void doShowInformation()
    {
        String ten=editTen.getText()+"";
        ten=ten.trim();
        if(ten.length()<3)
        {
            Toast.makeText(this, "Tên phải trên 3 ký tự", Toast.LENGTH_LONG).show();
            return;
        }

        String cmnd=editCMND.getText()+"";
        cmnd=cmnd.trim();
        if(cmnd.length()!=9)
        {
            Toast.makeText(this, "CMND phải đúng 9 ký tự", Toast.LENGTH_LONG).show();
            return;
        }

        String bang="";
        int id=group.getCheckedRadioButtonId();
        if(id==-1)
        {
            Toast.makeText(this, "Phải chọn bằng cấp", Toast.LENGTH_LONG).show();
            return;
        }
        RadioButton rad=(RadioButton) findViewById(id);
        bang=rad.getText()+"";

        chkdocbao.getText().toString();
        String sothich="";
        if(chkdocbao.isChecked())
            sothich+=chkdocbao.getText()+"\n";
        if(chkdocsach.isChecked())
            sothich+=chkdocsach.getText()+"\n";
        if(chkdoccode.isChecked())
            sothich+=chkdoccode.getText()+"\n";

        String bosung=editBosung.getText()+"";

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Thông tin cá nhân");
        builder.setCancelable(false);
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        String msg=ten+"\n";
        msg+= cmnd+"\n";
        msg+=bang+"\n";
        msg+=sothich;
        msg+="-----------------------------\n";
        msg+="Thông tin bổ sung:\n";
        msg+=bosung+ "\n";
        msg+="-----------------------------";
        builder.setMessage(msg);
        builder.create().show();
    }
}

