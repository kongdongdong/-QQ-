package dong.com.weixin.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import dong.com.weixin.R;

public class RegistActivity extends Activity {

    private TextView tv_title;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        initView();
    }

    private void initView() {
        tv_title = (TextView) findViewById(R.id.tv_title);

        tv_title.setText(R.string.regist_type_phone);
    }


}
