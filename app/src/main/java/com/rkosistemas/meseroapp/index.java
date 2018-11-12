package com.rkosistemas.meseroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class index extends AppCompatActivity {

    TextView txtResult;
    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        txtResult = (TextView) findViewById(R.id.txtResult);
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username = txtUsername.getText().toString();
//                String password = txtPassword.getText().toString();
//                LoginController loginController = new LoginController();
//                if(loginController.verifyUser("160080503", "1600870503")){
//                    txtResult.setText("Correcto");
//                } else {
//                    txtResult.setText("Fallo");
//                }
//            }
//        });
    }
}
