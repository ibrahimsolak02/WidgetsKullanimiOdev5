package com.ibrahimsolak.widgetskullanimiodev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.ibrahimsolak.widgetskullanimiodev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var sonuc = ""

        binding.chip0.setOnClickListener(){
            sonuc += binding.chip0.text
            binding.editTextSonuc.setText(sonuc)
        }
        binding.chip1.setOnClickListener(){
            sonuc += binding.chip1.text
            binding.editTextSonuc.setText(sonuc)
        }
        binding.chip2.setOnClickListener(){
            sonuc += binding.chip2.text
            binding.editTextSonuc.setText(sonuc)
        }
        binding.chip3.setOnClickListener(){
            sonuc += binding.chip3.text
            binding.editTextSonuc.setText(sonuc)
        }
        binding.chip4.setOnClickListener(){
            sonuc += binding.chip4.text
            binding.editTextSonuc.setText(sonuc)
        }
        binding.chip5.setOnClickListener(){
            sonuc += binding.chip5.text
            binding.editTextSonuc.setText(sonuc)
        }
        binding.chip6.setOnClickListener(){
            sonuc += binding.chip6.text
            binding.editTextSonuc.setText(sonuc)
        }
        binding.chip7.setOnClickListener(){
            sonuc += binding.chip7.text
            binding.editTextSonuc.setText(sonuc)
        }
        binding.chip8.setOnClickListener(){
            sonuc += binding.chip8.text
            binding.editTextSonuc.setText(sonuc)
        }
        binding.chip9.setOnClickListener(){
            sonuc += binding.chip9.text
            binding.editTextSonuc.setText(sonuc)
        }

        binding.chipTopla.setOnClickListener(){
            sonuc += binding.chipTopla.text
            binding.editTextSonuc.setText(sonuc)
        }


        val sonuc2 = ArrayList<String>()
        binding.chipEsit.setOnClickListener() {
            if(sonuc.isEmpty() || sonuc.startsWith("+") || sonuc.endsWith("+")){
                Snackbar.make(it,"Lütfen girdiğiniz ifadeyi kontrol ediniz.",Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            for(i in sonuc.indices){
                if(sonuc[i] == '+' && i < sonuc.length - 1 && sonuc[i+1] == '+'){
                    Snackbar.make(it,"Lütfen girdiğiniz ifadeyi kontrol ediniz.",Snackbar.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
            }

            sonuc2.clear()
            sonuc2.addAll(sonuc.split("+"))

            var sonuc3 = 0

            for(i in sonuc2){
                var k = i.toInt()
                sonuc3 += k
            }
            sonuc =  sonuc3.toString()

            binding.editTextSonuc.setText("")
            binding.editTextSonuc.setText(sonuc.toString())

        }

        binding.chipAC.setOnClickListener(){
            sonuc = ""
            sonuc2.clear()
            binding.editTextSonuc.setText("")
        }
    }
}