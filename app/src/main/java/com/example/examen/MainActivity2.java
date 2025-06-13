package com.example.examen;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2); // Assurez-vous que le fichier XML est bien nommé

        // Initialisation des vues
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        // Ajout d'un listener pour le bouton de connexion
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupération des champs email et mot de passe
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                // Validation des champs
                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(MainActivity2.this, "Veuillez entrer votre email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(MainActivity2.this, "Veuillez entrer votre mot de passe", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Vérifiez ici les informations d'identification (si nécessaire)
                // Par exemple : vous pouvez implémenter une logique pour comparer à une base de données
                if (email.equals("test@email.com") && password.equals("123456")) {
                    // Navigation vers MainActivity3 si les informations sont correctes
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(intent);
                } else {
                    // Affiche un message d'erreur si les informations sont incorrectes
                    Toast.makeText(MainActivity2.this, "Email ou mot de passe incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

