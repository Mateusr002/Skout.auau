package br.com.myskout.skout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class OutroMenuActivity extends AppCompatActivity {
//Criando a variável para botão FAB
    FloatingActionButton fabCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outro_menu);

        //Apresentar xml ao java
        fabCadastrar = findViewById(R.id.fabCadastrar);

        //Criando o clique no botão FAB
        fabCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(OutroMenuActivity.this, "Clique no botão cadastrar",
                        Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Instaciando o menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);



        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch ((item.getItemId())){
            case R.id.mParcAlterar:
                Toast.makeText(this, "Clique em alterar",
                        Toast.LENGTH_SHORT).show();
                break;
        }  switch ((item.getItemId())){
            case R.id.mParcExcluir:
                Toast.makeText(this, "Clique em excluir",
                        Toast.LENGTH_SHORT).show();
                break;
        }  switch ((item.getItemId())){
            case R.id.mParcPesquisar:
                Toast.makeText(this, "Clique em pesquisar",
                        Toast.LENGTH_SHORT).show();
                break;
        }  switch ((item.getItemId())){
            case R.id.mParcSair:
                Toast.makeText(this, "Clique em sair",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

