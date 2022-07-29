package com.example.bmicalculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val name = findViewById<EditText>(R.id.name)
        val img = findViewById<ImageView>(R.id.imageView)
        val rg = findViewById<RadioGroup>(R.id.sex)
        val height = findViewById<EditText>(R.id.height)
        val weight = findViewById<EditText>(R.id.weight)
        val head = findViewById<TextView>(R.id.heading)
        val age = findViewById<EditText>(R.id.age)
        val report = findViewById<TextView>(R.id.report)
        val btn2 = findViewById<Button>(R.id.btn2)
        val rem = findViewById<TextView>(R.id.remark)
        val naam = findViewById<TextView>(R.id.naam)
        val umar = findViewById<TextView>(R.id.umar)
        val gender = findViewById<TextView>(R.id.gender)
        val bmii = findViewById<TextView>(R.id.bmii)



            btn.setOnClickListener {
                val nameG = name.text.toString()
                val ageG = age.text.toString()
                val heightG = height.text.toString()
                val weightG = weight.text.toString()

                if(nameG == "" || ageG == "" || heightG == "" || weightG == "")
                {
                    Toast.makeText(this@MainActivity, "Please enter the details", Toast.LENGTH_SHORT).show()
                }
                else {
                    val heightgh = heightG.toFloat()
                    val weightgh = weightG.toFloat()

                    val bmi = weightgh / ((heightgh/100) * (heightgh/100))
                    val bmiG = String.format("%.2f", bmi)
                    val bmigh = bmiG.toFloat()
                    val msg = "Your BMI Report"
                  var remark = "Error"
                    if(bmigh >=1.00f && bmigh < 16.00f)
                    {
                        remark = "Severe thinness"
                    }
                    else if(bmigh >=16.00f && bmigh < 17.00f)
                    {
                        remark = "Moderate thinness"
                    }
                    else if(bmigh >=17.00f && bmigh <18.5)
                    {
                        remark = "Mild thinness"
                    }
                    else if(bmigh >= 18.5 && bmigh < 25)
                    {
                        remark = "Normal"
                    }
                    else if(bmigh>=25 && bmigh <30)
                    {
                        remark = "Overweight"
                    }
                    else if(bmigh>=30 && bmigh<35)
                    {
                        remark = "Obese Class I"
                    }
                    else if(bmigh >=35 && bmigh <40)
                    {
                        remark = "Obese Class II"
                    }
                    else if(bmigh>=40)
                    {
                        remark = "Obese Class III"
                    }
                    val g = when(rg.checkedRadioButtonId)
                    {
                        R.id.Male -> "Male"
                        else -> "Female"
                    }
                    val msg2 = "Remark = $remark"
                    rem.text = msg2

                    val msg3 = "Name : $nameG"
                    naam.text = msg3

                    val msg4 = "Age : $ageG"
                    umar.text = msg4

                    val msg5 = "BMI : $bmigh"
                    bmii.text = msg5

                    val msg6 = "Gender : $g"
                    gender.text = msg6

                    report.text = msg

                    name.setVisibility(View.INVISIBLE)
                    btn.setVisibility(View.INVISIBLE)
                    img.setVisibility(View.GONE)
                    height.setVisibility(View.GONE)
                    weight.setVisibility(View.GONE)
                    head.setVisibility(View.GONE)
                    age.setVisibility(View.GONE)
                    rg.setVisibility(View.GONE)
                    report.setVisibility(View.VISIBLE)
                    btn2.setVisibility(View.VISIBLE)
                    btn2.setVisibility(View.VISIBLE)
                    rem.setVisibility(View.VISIBLE)
                    naam.setVisibility(View.VISIBLE)
                    umar.setVisibility(View.VISIBLE)
                    gender.setVisibility(View.VISIBLE)
                    bmii.setVisibility(View.VISIBLE)


                }




        }
        
        btn2.setOnClickListener {
            name.setVisibility(View.VISIBLE)
            btn.setVisibility(View.VISIBLE)
            img.setVisibility(View.VISIBLE)
            height.setVisibility(View.VISIBLE)
            weight.setVisibility(View.VISIBLE)
            head.setVisibility(View.VISIBLE)
            age.setVisibility(View.VISIBLE)
            rg.setVisibility(View.VISIBLE)
            report.setVisibility(View.INVISIBLE)
            btn2.setVisibility(View.INVISIBLE)
            rem.setVisibility(View.INVISIBLE)
            naam.setVisibility(View.INVISIBLE)
            umar.setVisibility(View.INVISIBLE)
            gender.setVisibility(View.INVISIBLE)
            bmii.setVisibility(View.INVISIBLE)
            name.text.clear()
            age.text.clear()
            weight.text.clear()
            height.text.clear()
        }

    }




    }

