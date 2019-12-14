package com.example.template

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.template.Form.Form
import com.example.template.List_Ward.List_Ward_MainActivity
//import com.example.template.Rv_CB.Rv_CB_MainActivity
import com.example.template.Rv_Swipe_CB.Rv_Swipe_CB_MainActivity
import com.example.template.Rv_Ward.Rv_Ward_MainActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val context = this
        btn_explicit.setOnClickListener{
            val intent = Intent(context, Rv_Ward_MainActivity::class.java)
            startActivity(intent)
            //finish()
        }

        btn_form.setOnClickListener{
            val intent = Intent(context, Rv_Swipe_CB_MainActivity::class.java)
            startActivity(intent)
            //finish()
        }

        btn_recycler.setOnClickListener{
            val intent = Intent(context, Form::class.java)
            startActivity(intent)
            //finish()
        //new changes
    }


//    // Creating Client
//        var client = OkHttpClient()
//
//        // Creating request
//        var request = Request.Builder()
//            .url("http://10.0.2.2:8000/company/get_jobs")
//            .build()
//
//        // Sending the request and Handling the response
//        client.newCall(request).enqueue(
//
//// Call Back functions for failure and success
//
//            object : Callback{
//
//                // On Failure this method is called i.e. called when connection error occurs
//                override fun onFailure(call: Call, e: IOException) {
//                    call.cancel()
//                    Log.d("Failure", e.toString())
//                }
//
//                // On success i.e. connection is established and a //response is received
//
//// this method is called
//
//                @RequiresApi(Build.VERSION_CODES.KITKAT)
//
//                override fun onResponse(call: Call, response: Response) {
//
//                    // Extracting the response
//                    val myresponse = response.body()!!.string()
//
//                    // Display the contents to the user
//                    this@MainActivity.runOnUiThread{
//                        try {
//                            Log.d("Response", myresponse)
//
//                            val jobs = JSONArray(myresponse)
//                                //data = jobs
//                            Log.d("JSON", jobs.toString())
//
//                            for (jobIndex in 0 until jobs.length()){
//                                Log.d("Job",jobs[jobIndex].toString())
//                                Log.d("Job",jobs.getJSONObject(jobIndex).getString("id"))
//                            }
//
//
//
//                        }
//                        catch (e : JSONException){
//                            // printing the error
//                            e.printStackTrace()
//                        }
//                    }
//                }
//
//            }
//        )





    }
}
