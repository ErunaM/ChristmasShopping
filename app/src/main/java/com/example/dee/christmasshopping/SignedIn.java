package com.example.dee.christmasshopping;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import java.net.MalformedURLException;
import java.net.URL;

public class SignedIn extends AppCompatActivity {
    private TextView TVname,TVemail;
    private ImageView profilePicture;
    GoogleSignInAccount acct;
    private String name,email,pictureUrl;
  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signed_in);
        profilePicture = (ImageView)findViewById(R.id.profilePicture);
        TVname = (TextView)findViewById(R.id.Name);
        name = getIntent().getStringExtra("UserName");
        String url = getIntent().getStringExtra("Picture");


        TVname.setText(name);
        //profilePicture.setImageURI();

       // profilePicture.setImageURI();


    }
}
