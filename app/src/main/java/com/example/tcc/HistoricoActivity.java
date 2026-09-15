package com.example.tcc;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class HistoricoActivity extends AppCompatActivity {

    private ProgressBar progressHoje;
    private ProgressBar progressSexta;
    private ProgressBar progressQuinta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_historico);

        progressHoje = findViewById(R.id.progressHoje);
        progressSexta = findViewById(R.id.progressSexta);
        progressQuinta = findViewById(R.id.progressQuinta);

        animarBarra(progressHoje, 76);
        animarBarra(progressSexta, 95);
        animarBarra(progressQuinta, 43);
    }

    private void animarBarra(ProgressBar barra, int progressoFinal) {

        ObjectAnimator animacao = ObjectAnimator.ofInt(
                barra,
                "progress",
                0,
                progressoFinal
        );

        animacao.setDuration(1200);

        animacao.setInterpolator(
                new DecelerateInterpolator()
        );

        animacao.start();
    }
}