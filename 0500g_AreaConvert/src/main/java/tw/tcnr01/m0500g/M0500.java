package tw.tcnr01.m0500g;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class M0500 extends AppCompatActivity{

    private EditText e001;
    private Button b001;
    private TextView t003;
    private TextView t005;
    private TextView t007;

    private String ans;
//    private String ans2;
//    private String ans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0500);
        setupViewcomponent();  //自定義方法
    }

    private void setupViewcomponent() {
        //定義配置碼
        e001 = (EditText)findViewById(R.id.m0500_e001);

        b001=(Button)findViewById(R.id.m0500_b001);
        t003=(TextView)findViewById(R.id.m0500_t003);
        b001.setOnClickListener(B001on);

        t005=(TextView)findViewById(R.id.m0500_t005);
        t007=(TextView)findViewById(R.id.m0500_t007);

    }

    private View.OnClickListener B001on=new View.OnClickListener() {
    @Override
    public void onClick(View v) {
//        DecimalFormat   pondsFormat = new DecimalFormat("0.00000");
        DecimalFormat poodsFormat = new DecimalFormat( "0.00000"); //宣告 格式化( 小數後5位，不足補0)
        if(e001.getText().toString().length()>0){

//            ans1 = poodsFormat.format(Float.parseFloat(e001.getText().toString())*0.00034);

            ans = poodsFormat.format(Float.parseFloat(e001.getText().toString())*0.00034);
            t003.setText(ans);
            ans = poodsFormat.format(Float.parseFloat(e001.getText().toString())*3.31);
            t005.setText(ans);
            ans = poodsFormat.format(Float.parseFloat(e001.getText().toString())*0.0331);
            t007.setText(ans);

        }else{

            t003.setText("輸入空白!!");
            t005.setText("輸入空白!!");
            t007.setText("輸入空白!!");
        }
    }
};
}