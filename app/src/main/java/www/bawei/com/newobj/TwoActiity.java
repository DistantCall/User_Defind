package www.bawei.com.newobj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by dell on 2017/12/29.
 */

public class TwoActiity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.two_layout);
        TextView textView = (TextView) findViewById(R.id.tv1);
        Intent intent = getIntent();
        String f = intent.getStringExtra("f");
        String c = intent.getStringExtra("c");
textView.setText("我是Activity");
        Toast.makeText(TwoActiity.this,f+c,Toast.LENGTH_SHORT).show();



    }
}
