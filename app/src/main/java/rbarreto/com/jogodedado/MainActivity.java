package rbarreto.com.jogodedado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_dado;
    TextView textViewResultado;
    int ult_result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView_dado = findViewById(R.id.image_view_dado);
        textViewResultado  =findViewById(R.id.text_view_resultado);
        textViewResultado.setText("");
    }

    public void jogar(View v)
    {
        int sorteado = getRandomInt(1,6);
        while(sorteado == ult_result)
        {
            sorteado = getRandomInt(1,6);;
        }

        this.ult_result = sorteado;

        switch (sorteado)
        {
            case 1:
                imageView_dado.setImageResource(R.drawable.dado1);
                break;
            case 2:
                imageView_dado.setImageResource(R.drawable.dado2);
                break;
            case 3:
                imageView_dado.setImageResource(R.drawable.dado3);
                break;
            case 4:
                imageView_dado.setImageResource(R.drawable.dado4);
                break;
            case 5:
                imageView_dado.setImageResource(R.drawable.dado5);
                break;
            default: // 6
                imageView_dado.setImageResource(R.drawable.dado6);
                break;
        }

        textViewResultado.setText("Resultado: "+sorteado);

    }

    public static int getRandomInt(int min, int max) {
        Random random = new Random();

        return random.nextInt((max - min) + 1) + min;
    }

}
