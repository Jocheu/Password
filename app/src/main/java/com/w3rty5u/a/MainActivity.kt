package com.w3rty5u.a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var see1 = findViewById<Button>(R.id.button);
        var see2 = findViewById<Button>(R.id.button4);
        var see3 = findViewById<Button>(R.id.button6);
        var see4 = findViewById<Button>(R.id.button7);
        var acceptpass = findViewById<Button>(R.id.button2)
        var checkpass = findViewById<Button>(R.id.button5)
        var text1 = findViewById<EditText>(R.id.editTextTextPassword)
        var text2 = findViewById<EditText>(R.id.editTextTextPassword2)
        var text3 = findViewById<EditText>(R.id.editTextNumberPassword)
        var text4 = findViewById<EditText>(R.id.editTextNumberPassword2)
        var haslo = ""
        var haslo2 = ""
        var sprawdz = ""
        var sprawdz2 = ""
        var acceptnum = findViewById<Button>(R.id.button9)
        var cheknum = findViewById<Button>(R.id.button8)
        see1.setOnClickListener {
            if(see1.text.toString() == "zobacz"){
                see1.text = "ukryj"
                text1.transformationMethod = HideReturnsTransformationMethod.getInstance()
            }
            else{
                see1.text = "zobacz"
                text1.transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }
        see2.setOnClickListener {
            if (see2.text.toString() == "zobacz") {
                see2.text = "ukryj"
                text2.transformationMethod = HideReturnsTransformationMethod.getInstance()
            } else {
                see2.text = "zobacz"
                text2.transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }
            see3.setOnClickListener {
                if (see3.text.toString() == "zobacz") {
                    see3.text = "ukryj"
                    text3.transformationMethod = HideReturnsTransformationMethod.getInstance()
                } else {
                    see3.text = "zobacz"
                    text3.transformationMethod = PasswordTransformationMethod.getInstance()
                }
            }
            see4.setOnClickListener {
                if (see4.text.toString() == "zobacz") {
                    see4.text = "ukryj"
                    text4.transformationMethod = HideReturnsTransformationMethod.getInstance()
                } else {
                    see4.text = "zobacz"
                    text4.transformationMethod = PasswordTransformationMethod.getInstance()
                }
            }

        acceptpass.setOnClickListener {
            haslo = text1.text.toString()
            Toast.makeText(this@MainActivity, "Hasło zapisane", Toast.LENGTH_SHORT).show()
        }
        checkpass.setOnClickListener {
            sprawdz = text2.text.toString()
            if(haslo == ""){
                Toast.makeText(this@MainActivity, "Najpierw podaj haslo", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(sprawdz == haslo){
                Toast.makeText(this@MainActivity, "Poprawne haslo", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this@MainActivity, "niepoprawne hasło", Toast.LENGTH_SHORT).show()
            }
        }

        acceptnum.setOnClickListener {
            haslo2 = text3.text.toString()
            Toast.makeText(this@MainActivity, "Hasło zapisane", Toast.LENGTH_SHORT).show()
        }
        cheknum.setOnClickListener {
            sprawdz2 = text4.text.toString()
            if(haslo2 == ""){
                Toast.makeText(this@MainActivity, "Najpierw podaj haslo", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(sprawdz2 == haslo2){
                Toast.makeText(this@MainActivity, "Poprawne haslo", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this@MainActivity, "niepoprawne hasło", Toast.LENGTH_SHORT).show()
            }
        }
    }
}