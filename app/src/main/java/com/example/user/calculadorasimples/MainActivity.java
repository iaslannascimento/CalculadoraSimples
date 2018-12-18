package com.example.user.calculadorasimples;
//projeto calculadora simples, os valores aparecem no campo text todos inclusive os sinais;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {


    //campos do layout
    //botões
    Button botao1,botao2,botao3,botao4,botao5,botao6,botao7,botao8,botao9,botao0,mult,plus,menos,div,apagar,cancel;
    //campo de texto
    TextView valores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
}
