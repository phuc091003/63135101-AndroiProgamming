package ntu.P63135101;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import nt21.test.R;

public class MainActivity extends AppCompatActivity {
    private EditText heighInput;
    private EditText weighInput;
    private Button calculateButton;
    private TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        heighInput = findViewById(R.id.heightInput);
        weighInput = findViewById(R.id.weightInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultText = findViewById(R.id.resultText);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }
    public void calculateBMI(){
        String heighStr = heighInput.getText().toString();
        String weighStr = weighInput.getText().toString();

        if(heighStr.isEmpty() || weighStr.isEmpty()){
            resultText.setText("Hãy nhập chiều cao và cân nặng.");
            return;
        }
        float height = Float.parseFloat(heighStr)/100; // doi ve don vi met
        float weight = Float.parseFloat(weighStr);
        float bmi = weight/(height*height);
        String result;
    }
}