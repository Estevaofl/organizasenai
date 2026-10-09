package com.senai.organizasenai;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.MaterialToolbar;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        MaterialToolbar toolbar = findViewById(R.id.toolbarCadastro);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        EditText edtTarefa = findViewById(R.id.edtTarefa);
        Button btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {
            String tarefa = edtTarefa.getText().toString().trim();

            if (tarefa.isEmpty()) {
                edtTarefa.setError("Digite a descrição da tarefa");
                return;
            }

            Toast.makeText(
                CadastroActivity.this,
                "Tarefa registrada!",
                Toast.LENGTH_SHORT
            ).show();

            finish();
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
