package com.example.cdv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    private companion object{
        const val CICLO_PDM = "CICLO_PDM"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v(CICLO_PDM, "OnCreate: Iniciando ciclo completo")
    }

    override fun onStart() {
        super.onStart()
        Log.v(CICLO_PDM, "onStart: Iniciando ciclo visível")
    }

    override fun onResume() {
        super.onResume()
        Log.v(CICLO_PDM, "onResume: Iniciando ciclo em primeiro plano")
    }

    override fun onPause() {
        super.onPause()
        Log.v(CICLO_PDM,"onPause: Finalizando ciclo em primeiro plano")
    }

    override fun onStop() {
        super.onStop()
        Log.v(CICLO_PDM, "onStop: Finalizando ciclo visível")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(CICLO_PDM,"onDestroy: Finalizando ciclo completo")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(CICLO_PDM,"onRestart: Preparando execução do onStart")
    }
}