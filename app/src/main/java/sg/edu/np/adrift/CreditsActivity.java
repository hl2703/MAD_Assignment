package sg.edu.np.adrift;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CreditsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    }
}