package tw.tcnr01.m0503;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class M0503 extends AppCompatActivity {

    private CheckBox chb01;
    private CheckBox chb02;
    private CheckBox chb03;
    private CheckBox chb04;
    private Button b001;
    private TextView t001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0503);
        setupViewcomponent();  //自定義方法
    }

    private void setupViewcomponent() {

         chb01=(CheckBox)findViewById(R.id.m0503_chb01);
         chb02=(CheckBox)findViewById(R.id.m0503_chb02);
         chb03=(CheckBox)findViewById(R.id.m0503_chb03);
         chb04=(CheckBox)findViewById(R.id.m0503_chb04);

         b001=(Button)findViewById(R.id.m0503_b001);

         t001=(TextView)findViewById(R.id.m0503_t001);


//        //設監聽

        b001.setOnClickListener(btn01OnClick);

    }
    private View.OnClickListener btn01OnClick=new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            String ans01 = getString(R.string.m0503_t001);

            if(chb01.isChecked())  ans01+=chb01.getText().toString()+" ";
            if(chb02.isChecked())  ans01+=chb02.getText().toString()+" ";
            if(chb03.isChecked())  ans01+=chb03.getText().toString()+" ";
            if(chb04.isChecked())  ans01+=chb04.getText().toString()+" ";



            t001.setText(ans01);


        }
    };

}