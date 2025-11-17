package com.example.s70712_lab3_task1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        txtResult = findViewById(R.id.txtResult);
    }
    public void sayHello(View view) {
        String name = edtName.getText().toString().trim();

        if (name.isEmpty()) {
            Toast.makeText(this, "Please enter your name",
                    Toast.LENGTH_SHORT).show();
        } else {
            txtResult.setText("Hello, " + name + "!");
        }
    }
    public void clearText(View view) {

        edtName.setText("");

        txtResult.setText("");

        Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show();
    }
}