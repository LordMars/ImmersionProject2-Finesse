package com.osalaam.immersionproj2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ResourcesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);

        /*mClassesButton = (Button) findViewById(R.id.main);
        mClassesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResourcesActivity.this, ClassesActivity.class);
                startActivity(intent);
            }
        });*/
    }
}
