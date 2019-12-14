package com.example.template.Form

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.template.R
import kotlinx.android.synthetic.main.form.*
import kotlinx.android.synthetic.main.form.view.*
import java.util.*


class Form: AppCompatActivity(){
//global declarations

    //Radio(Gender)
    lateinit var rg_gender: RadioGroup
    lateinit var rb_male: RadioButton
    lateinit var rb_female: RadioButton

    //Radio(Specially Abled Status)
    lateinit var rg_abled: RadioGroup
    lateinit var rb_yes: RadioButton
    lateinit var rb_no: RadioButton

    //spinner(Qualification)
    lateinit var option: Spinner

    //Spinner(Unique_id)
    lateinit var option2: Spinner

 //-------------------------------------------------------------------------------------------------
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form)

        //radio (gender)
        rg_gender = findViewById(R.id.rg_gender)
        rb_male = findViewById(R.id.rb_male)
        rb_female = findViewById(R.id.rb_female)

        //radio (specially abled status)
         rg_abled = findViewById(R.id.rg_abled)
         rb_yes = findViewById(R.id.rb_yes)
         rb_no = findViewById(R.id.rb_no)

        //calendar
        val c = java.util.Calendar.getInstance()
        val year = c.get(java.util.Calendar.YEAR)
        val month = c.get(java.util.Calendar.MONTH)
        val day = c.get(java.util.Calendar.DAY_OF_MONTH)

        btn_dob.setOnClickListener{
            val dpd = DatePickerDialog(this,DatePickerDialog.OnDateSetListener{view, mYear, mMonth, mDay ->
                dob_view.setText(""+mDay+"/"+(mMonth+1)+"/"+mYear)
            },year,month,day)
            dpd.show()
        }

        //spinner(Qualification)
        option = findViewById(R.id.qualification_options) as Spinner

        var options = arrayOf("Below Matriculation","Matriculation","Higher Secondary","Graduate","Post Graduate")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                    //textView.text="$options[position]"
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

            }
        }

        //spinner(Unique ID)
        option2 = findViewById(R.id.uniqueid_options) as Spinner

        var options2 = arrayOf("Ration Card","Voter ID","Aadhar Card","Others")

        option2.adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,options2)

        }

//--------------------------------------------------------------------------------------------------
}