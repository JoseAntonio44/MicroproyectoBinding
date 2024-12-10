package com.example.microproyectobindingcalculadora

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.microproyectobindingcalculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.Suma.setOnClickListener{
            val num1 = binding.Numero1.text.toString().toDouble()
            val num2 = binding.Numero2.text.toString().toDouble()
            val resultado = num1 + num2
            binding.Resultado.text = resultado.toString()
        }

        binding.Resta.setOnClickListener{
            val num1 = binding.Numero1.text.toString().toDouble()
            val num2 = binding.Numero2.text.toString().toDouble()
            val resultado = num1 - num2
            binding.Resultado.text = resultado.toString()
        }

        binding.Multiplicacion.setOnClickListener{
            val num1 = binding.Numero1.text.toString().toDouble()
            val num2 = binding.Numero2.text.toString().toDouble()
            val resultado = num1 * num2
            binding.Resultado.text = resultado.toString()
        }

        binding.Division.setOnClickListener{
            val num1 = binding.Numero1.text.toString().toDouble()
            val num2 = binding.Numero2.text.toString().toDouble()
            val resultado = num1 / num2
            binding.Resultado.text = resultado.toString()
        }

    }
}