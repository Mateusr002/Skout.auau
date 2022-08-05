package br.com.myskout.skout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class CandidatosActivity extends AppCompatActivity {
    BottomAppBar bottomAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidatos);
        bottomAppBar = findViewById(R.id.BottomBarCandidatos);

        //Clicando nos itens de menu
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mBottomAlterar:
                        Toast.makeText(CandidatosActivity.this, "Clique em alterar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBottomExcluir:
                        Toast.makeText(CandidatosActivity.this, "Clique em excluir",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBottomSair:
                        Toast.makeText(CandidatosActivity.this, "Clique em sair",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });

        //Clicando em navegation
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CandidatosActivity.this, "Clique no ícone bottomBar",
                        Toast.LENGTH_SHORT).show();       }
        });

    }
}