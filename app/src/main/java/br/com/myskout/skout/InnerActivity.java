package br.com.myskout.skout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InnerActivity extends AppCompatActivity {
    //Aqui nos declaramos as variáveis que irão receber o xml
    EditText edtUsuario, edtSenha;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Abrir o meu layout
        setContentView(R.layout.activity_inner);
        //Apresentar as variáveis java para xml
        edtUsuario = findViewById(R.id.edtUsuário);
        edtSenha = findViewById(R.id.edtSenha);
        btnEntrar = findViewById(R.id.btnEntrar);

        //criando a ação do botão entrar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pegando o que o usuário digitar para validação

                String usuario, senha;

                usuario = edtUsuario.getText().toString();
                senha = edtSenha.getText().toString();


                //validando o usuário

                if (usuario.equals("Senac") && senha.equals("Senac")) ;
                {

                    startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(),
                            "Usuário ou senha incorreto",
                            Toast.LENGTH_SHORT).show();


                }
            }


        });

    }

    //criando o metódo para limpar janela
    public void LimparJanela() {
        edtUsuario.setText("");
        edtSenha.setText("");
        edtUsuario.requestFocus();
    }


    public void SairSistema(View view) {
        finish();
    }
}
