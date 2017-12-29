package www.bawei.com.newobj;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;



/**
 * Created by dell on 2017/12/29.
 */

public class NewObj extends RelativeLayout {

  private MyClick myClick;

    public NewObj(Context context) {
        this(context, null);
    }

    public NewObj(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);

    }

    public NewObj(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater inflater = LayoutInflater.from(context);
//        View view = from.inflate(R.layout.newlayout, this, true);
        View view = inflater.inflate(R.layout.newlayout, this, true);
        TextView blak = (TextView) view.findViewById(R.id.blak);
        TextView title = view.findViewById(R.id.my_title);
        TextView next = view.findViewById(R.id.next);
       blak.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
               myClick.myclick(v);
           }
       });
        next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myClick.myclick(v);
            }
        });

    }

  public void setMyclick(MyClick click){
this.myClick=click;
  }
}
