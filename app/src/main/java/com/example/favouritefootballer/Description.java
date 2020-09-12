package com.example.favouritefootballer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Description extends AppCompatActivity {

    FootballerExpert fe = new FootballerExpert();
    TextView description;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        bindView();
        descriptionView();
    }

    private void bindView()
    {
        description = findViewById(R.id.textView_description);
    }

    private void descriptionView()
    {
        Intent intent = getIntent();
        index = intent.getIntExtra("index",0);
        description.setText(fe.getDescription(index));
    }

    public void onClickSendMail(View view)
    {
        Intent email = new Intent(Intent.ACTION_SEND);

        String receiver = fe.getEmailId(index);

        email.putExtra(Intent.EXTRA_EMAIL, new String[]{receiver});
        email.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.subject));
        email.putExtra(Intent.EXTRA_TEXT, getString(R.string.message));

        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an email client: "));
    }
}