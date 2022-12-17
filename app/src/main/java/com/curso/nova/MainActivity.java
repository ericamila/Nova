package com.curso.nova;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.navigation.ui.AppBarConfiguration;

import com.curso.nova.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

    }

    public void sendMap(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.lista_convidados) {
            Intent intent = new Intent(this, Convidados.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.controle_gastos) {
            Intent intent = new Intent(this, Gastos.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.calculo_comida) {
            Intent intent = new Intent(this, Comida.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}