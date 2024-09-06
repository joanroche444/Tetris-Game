package com.example.tetrisgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainmenu)

        val gameAct=findViewById<Button>(R.id.buttonplay)

        val gameAct2=findViewById<Button>(R.id.menuhelp2)


          gameAct.setOnClickListener{
              val intent = Intent(this,MainActivity::class.java)
              startActivity(intent)
          }
        gameAct2.setOnClickListener{
            val intent = Intent(this,Help::class.java)
            startActivity(intent)
        }
    }
}