package com.example.senac.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editSenha,editEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // "Une a ariavel declarada acima com o campo no xml"
        editSenha = findViewById(R.id.editSenha);
        editEmail = findViewById(R.id.editEmail);
    }
    public void logar(View v){
        //atribui o valor do campo da tela para a variavel do tipo string
        String email = editEmail.getText().toString();

        if(email.equals("asas")) {
            //mensagem para exibicao de informações
            Toast.makeText( this,  "logado", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText( this,  "Falha ao logar", Toast.LENGTH_SHORT).show();
        }

    }
}
