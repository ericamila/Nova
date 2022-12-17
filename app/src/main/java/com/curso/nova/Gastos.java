package com.curso.nova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Gastos extends AppCompatActivity {

    private static Float totalLiquido = 0f;
    private static Float totalSolido = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);
        setTitle("Estimativa de gasto:");

    TextView txvQtdComida = findViewById(R.id.tvGastos);
        txvQtdComida.setText(" Convidados: "+Convidado.getQtdConvidados()+" pessoas \n \n " +
                "O total de gastos com alimentos sólidos necessários é: \n R$ "+qtdSolido()+". \n \n" +
            " O total de líquido é: \n R$ "+qtdLiquido()+".");
    }

    public String qtdLiquido(){
        totalLiquido = Convidado.getQtdConvidados()* 1.5f*2.9f;
        return  String.format("%.2f",totalLiquido);
    }

    public String qtdSolido(){
        totalSolido = Convidado.getQtdConvidados()* 0.6f*18.7f;
        return  String.format("%.2f",totalSolido);
    }
}