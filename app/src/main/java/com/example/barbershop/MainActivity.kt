package com.example.barbershop

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.barbershop.databinding.ActivityMainBinding
import com.example.barbershop.view.Home
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.hide()

        binding.editbtLogin.setOnClickListener{

        val nome = binding.editNome.text.toString()
        val senha = binding.editSenha.text.toString()

        when{
            nome.isEmpty() ->{
                mesangem(it,"coloque seu nome!")
            }senha.isEmpty() ->{
                mesangem(it,"preencha a senha!")
            }senha.length <=5 ->{
                mesangem(it,"A senha precisa ter pelo menos 6 caracteres")
            }else->{
                navegarPraHome(nome)
            }


            }

        }


    }

private fun mesangem(view: View,mesangem: String ) {
    val Snackbar = Snackbar.make(view,mesangem,Snackbar.LENGTH_SHORT)
    Snackbar.setBackgroundTint(Color.parseColor("#FF0000"))
    Snackbar.setTextColor(Color.parseColor("#FFFFFF"))
    Snackbar.show()
}
    private fun navegarPraHome(nome: String){
        val intent = Intent (this,Home::class.java)
        intent.putExtra("nome",nome)
        startActivity(intent)
    }

}
