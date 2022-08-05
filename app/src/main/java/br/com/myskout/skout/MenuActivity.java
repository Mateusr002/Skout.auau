package br.com.myskout.skout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    //declarando variáveis dos componentes
    CardView cardPerfil, cardVagas,
            cardCandidatos,
            cardRecrutamento, cardTalentos,
            cardParceiros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //apresentado as variáveis xml para o java
        cardPerfil = findViewById(R.id.cardPerfil);
        cardRecrutamento = findViewById(R.id.cardPerfil);
        cardCandidatos = findViewById(R.id.cardPerfil);
        cardVagas = findViewById(R.id.cardPerfil);
        cardTalentos = findViewById(R.id.cardPerfil);
        cardParceiros = findViewById(R.id.cardPerfil);


        //os componentes recebendo o evento de click
        cardPerfil.setOnClickListener(this);
        cardRecrutamento.setOnClickListener(this);
        cardCandidatos.setOnClickListener(this);
        cardVagas.setOnClickListener(this);
        cardTalentos.setOnClickListener(this);
        cardParceiros.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cardPerfil:
                startActivity(new Intent(
                        getApplicationContext(),
                        perfilActivity.class

                ));
                finish();
                break;
            case R.id.cardRecrutamento:
                startActivity(new Intent(
                        getApplicationContext(),
                        RecrutadoresActivity.class

                ));
                finish();
                break;
            case R.id.cardCandidatos:
                startActivity(new Intent(
                        getApplicationContext(),
                        CandidatosActivity.class


                ));
                finish();
                break;
            case R.id.cardVagas:
                startActivity(new Intent(
                        getApplicationContext(),
                        vagasActivity.class


                ));
                finish();
                break;
            case R.id.cardTalento:
                startActivity(new Intent(
                        getApplicationContext(),
                        TalentosActivity.class

                ));
                finish();
                break;
            case R.id.cardParceiros:
                startActivity(new Intent(
                        getApplicationContext(),
                        ParceirosActivity.class

                ));
                finish();
                break;
        }
    }
}