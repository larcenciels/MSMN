package net.winnerawan.miesetan;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import net.winnerawan.helper.SetanTextView;
import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends ActionBarActivity {
    @InjectView(R.id.button_signin) Button bSign;
    @InjectView(R.id.link_register) SetanTextView tvReg;
    @InjectView(R.id.button_guest) Button bGuest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        //button sign in -> form login
        bSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(login);
            }
        });
        //text link to register -> from register
        tvReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(register);
            }
        });
        //button guest -> menu guest != users (members)
        bGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here my code
                //update later
            }
        });
    }
}
