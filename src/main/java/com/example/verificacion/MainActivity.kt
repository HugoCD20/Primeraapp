package com.example.verificacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton: Button = findViewById(R.id.boton1)
        boton.setOnClickListener {
            calcularedad()
        }
    }
    private fun calcularedad(){
        val numero: EditText=findViewById(R.id.edad)
        val resultado: TextView = findViewById(R.id.mostrar)
        val edad = numero.text.toString()
        if(edad.isEmpty()) {
            resultado.text = "Ingresa tu edad"
            return
        }else{
            try{
                val edad1=edad.toString().toInt()
                if(edad1>=18){
                    resultado.text="Eres mayor de edad"
                }else{
                    resultado.text="No eres mayor de edad"
                }
            }catch (e:NumberFormatException){
                resultado.text = "No es una edad valida"
                return
            }

        }
    }
}