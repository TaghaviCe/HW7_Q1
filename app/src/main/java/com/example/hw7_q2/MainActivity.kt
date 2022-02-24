package com.example.hw7_q2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.hw7_q2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
        lateinit var text1:EditText
        var number1:Double=0.0
        var number2:Double=0.0
        var sub=false
        var add=false
        var mul=false
        var div=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
        text1=binding.TextNumber
       binding.button0.setOnClickListener {
           text1.setText(text1.text.toString()+"0")
       }
        binding.button1.setOnClickListener {
            text1.setText(text1.text.toString()+"1")
        }
        binding.button2.setOnClickListener {
            text1.setText(text1.text.toString()+"2")
        }
        binding.button3.setOnClickListener {
            text1.setText(text1.text.toString()+"3")
        }
        binding.button4.setOnClickListener {
            text1.setText(text1.text.toString()+"4")
        }
        binding.button5.setOnClickListener {
            text1.setText(text1.text.toString()+"5")
        }
        binding.button6.setOnClickListener {
            text1.setText(text1.text.toString()+"6")
        }
        binding.button7.setOnClickListener {
            text1.setText(text1.text.toString()+"7")
        }
        binding.button8.setOnClickListener {
            text1.setText(text1.text.toString()+"8")
        }
        binding.button9.setOnClickListener {
            text1.setText(text1.text.toString()+"9")
        }
        binding.buttondot.setOnClickListener {
            text1.setText(text1.text.toString()+".")
        }
        binding.buttonplus.setOnClickListener {
            number1+=text1.text.toString().toDouble()
            add=true
            text1.setText(" ")

        }
        binding.buttonSub.setOnClickListener {
            number1=text1.text.toString().toDouble()
            sub=true
            text1.setText(" ")
        }
        binding.buttonmul.setOnClickListener {
            number1=text1.text.toString().toDouble()
            mul=true
            text1.setText(" ")
        }
        binding.buttondiv.setOnClickListener {
            number1=text1.text.toString().toDouble()
            div=true
            text1.setText(" ")
        }
        binding.buttonEqual.setOnClickListener {
            number2=text1.text.toString().toDouble()
              if(sub==true){
                  text1.setText((number1-number2).toString()+"")
                  sub=false
              }else if(add==true){
                  text1.setText((number2+number1).toString()+"")
                  add=false
              }else if(mul==true){
                  text1.setText((number2*number1).toString()+"")
                  mul=false
              }else if(div==true){
                  text1.setText((number1/number2).toString()+"")
                  div=false
              }
        }
        binding.buttondelete.setOnClickListener {
            text1.setText(" ")
        }
    }
}