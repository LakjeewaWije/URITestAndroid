package kliq.example.uri.uritestandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class URIActivity extends AppCompatActivity {
private TextView hostTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uri);
        hostTextView = (TextView) findViewById(R.id.host);
        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();
//        hostTextView.setText(data.getQueryParameter("name"));
    }
}
