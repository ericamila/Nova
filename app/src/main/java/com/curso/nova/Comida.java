package com.curso.nova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class Comida extends AppCompatActivity {

    private static Float totalLiquido = 0f;
    private static Float totalSolido = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);
        setTitle("Consumo de comida:");

        TextView txvQtdComida = findViewById(R.id.tvComida);
        txvQtdComida.setText(" Convidados: "+Convidado.getQtdConvidados()+" pessoas \n \n " +
                " O total de alimentos sólidos necessários é: \n "+qtdSolido()+"kg \n \n" +
                " O total de líquido é: \n"+qtdLiquido()+"L");
    }

    public String qtdLiquido(){
        totalLiquido = Convidado.getQtdConvidados()* 1.5f;
        return  String.format("%.2f",totalLiquido);
    }

    public String qtdSolido(){
        totalSolido = Convidado.getQtdConvidados()* 0.6f;
        return  String.format("%.3f",totalSolido);
    }
}