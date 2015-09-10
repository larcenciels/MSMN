package net.winnerawan.miesetan;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import com.readystatesoftware.systembartint.SystemBarTintManager;

import net.winnerawan.helper.SQLiteHandler;
import net.winnerawan.helper.SessionManager;
import net.winnerawan.helper.SetanEditText;
import net.winnerawan.helper.SetanTextView;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class RegisterActivity extends ActionBarActivity {
    @InjectView(R.id.tool_bar) Toolbar toolbar;
    @InjectView(R.id.button_register) Button register;
    @InjectView(R.id.txt_fullname) SetanEditText txtFullname;
    @InjectView(R.id.txt_email) SetanEditText txtEmail;
    @InjectView(R.id.txt_password) SetanEditText txtPassword;
    @InjectView(R.id.link_to_login) SetanTextView tv_Sign;
    private SQLiteHandler db;
    private SessionManager session;
    private ProgressDialog pDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.inject(this);
        setSupportActionBar(toolbar);

        //fix toolbar size dll
        toolbar.setPadding(0, getStatusBarHeight(), 0, 0);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        // enable status bar tint
        tintManager.setStatusBarTintEnabled(true);
        // enable navigation bar tint
        tintManager.setNavigationBarTintEnabled(true);
        // set the transparent color of the status bar, 20% darker
        tintManager.setTintColor(Color.parseColor("#20000000"));

    }
    // A method to find height of the status bar
    public int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
}
