package com.senai.organizasenai;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialToolbar toolbar = findViewById(R.id.toolbarTop);
        setSupportActionBar(toolbar);

        Button btnAbrirCadastro = findViewById(R.id.btnAbrirCadastro);
        btnAbrirCadastro.setOnClickListener(v -> {
            Intent intent = new Intent(
                MainActivity.this,
                CadastroActivity.class
            );
            startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(
            R.menu.menu_top,
            menu
        );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_config) {
            Toast.makeText(
                this,
                "Configurações selecionadas",
                Toast.LENGTH_SHORT
            ).show();
            return true;
        }

        if (item.getItemId() == R.id.menu_sobre) {
            Intent intent = new Intent(
                MainActivity.this,
                SobreActivity.class
            );
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}