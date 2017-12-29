package www.bawei.com.newobj;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.UiThread;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements MyClick {
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            setContentView(R.layout.activity_main);
            init();
        }
    };
    private NewObj obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Thread() {
            @Override
            public void run() {
                Message message = new Message();
                handler.sendMessageDelayed(message, 1000);
            }
        }.start();


    }

    void init() {

        View view = getWindow().getDecorView();
        int fullscreen = View.SYSTEM_UI_FLAG_FULLSCREEN;
        view.setSystemUiVisibility(fullscreen);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        obj = findViewById(R.id.tit);
        obj.setMyclick(this);

    }

    @Override
    public void myclick(View v) {
        Intent intent = new Intent(MainActivity.this, TwoActiity.class);
        switch (v.getId()) {
            case R.id.blak:
                intent.putExtra("f", "我是返回，我的id是" + v.getId());
                break;
            case R.id.next:
                intent.putExtra("c", "我是next，我的id是" + v.getId());
                break;
        }
        startActivity(intent);
    }
}
