package com.example.pc1_roggerjohanflores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import android.widget.Button
import android.widget.TextView

class ResultadoMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_main)

        val btnBack: Button=findViewById(R.id.btnBack)

        val prome = intent.getDoubleExtra("nota",0.00)
        val tvNotafinal: TextView=findViewById(R.id.tvNotafinal)
        val tvResultado: TextView=findViewById(R.id.tvResultado)



        tvNotafinal.text=prome.toString()

        if ( prome >= 10.5){
          tvResultado.text="APROBADO" }
        else{
          tvResultado.text="DESAPROBADO"
        }


        btnBack.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}