package com.example.aulaapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome:EditText = findViewById(R.id.edtNome)
        val edtEnd:EditText = findViewById(R.id.edtEnd)
        val edtBr:EditText = findViewById(R.id.edtBr)
        val edtCEP:EditText = findViewById(R.id.edtCEP)
        val edtCd:EditText = findViewById(R.id.edtCd)
        val edtEst:EditText = findViewById(R.id.edtEst)

        val btnCadastrar:Button = findViewById(R.id.btnCadastrar)
        btnCadastrar.setOnClickListener{
            val texto:String = edtNome.text.toString() + edtBr.text.toString() + edtCd.text.toString() + edtCEP.text.toString() + edtEnd.text.toString() + edtEst.text.toString()
            val toast = Toast.makeText(this, texto, Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}