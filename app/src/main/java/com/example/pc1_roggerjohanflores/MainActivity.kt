package com.example.pc1_roggerjohanflores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etnExamparcial: EditText = findViewById(R.id.etnExamparcial)
        val etnExamenfinal: EditText = findViewById(R.id.etnExamenfinal)
        val etnPEP: EditText = findViewById(R.id.etnPEP)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener {

            this.promedio(etnExamparcial.text.toString().toDouble(),etnExamenfinal.text.toString().toDouble(),etnPEP.text.toString().toDouble())

        }

    }

    private fun promedio(etnExampar: Double, etnExamfinal: Double, etnPEP: Double){

        val prom :Double=(etnExampar*0.20+etnExamfinal*0.20+etnPEP*0.60)


        this.sendCalculator(prom)

    }

    private fun sendCalculator(prom: Double)
    {
        val intent = Intent(this,ResultadoMainActivity::class.java)
        intent.putExtra("nota",prom)
        startActivity(intent)
    }


}