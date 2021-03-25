package must.ac.ug.csce.patrickokello.pokelloxmlcolorswap;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.colortextview);
        Button tapbutton = findViewById(R.id.tapbutton);

        final Random random = new Random();

        tapbutton.setOnClickListener((v)->{
            float red = random.nextFloat();
            float green = random.nextFloat();
            float blue = random.nextFloat();
            textView.setText("COLOR: "+ "R"+String.valueOf(red)+"G"+String.valueOf(green)+"B"+String.valueOf(blue));
            textView.setTextColor(Color.rgb(red,green,blue));
        });
    }
}