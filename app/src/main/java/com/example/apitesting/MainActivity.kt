package com.example.apitesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResult
import com.example.apitesting.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        getdata()
    }

    private fun getdata() {
       api.Api.getdata().enqueue(object :Callback<List<pojoItem>>{
           override fun onResponse(call: Call<List<pojoItem>>, response: Response<List<pojoItem>>) {
             val item=response.body()
               if (item != null) {
                   for(it in item){
                     it.id

                   }
               }
               Toast.makeText(this@MainActivity, "okie dokie", Toast.LENGTH_SHORT).show()
           }

           override fun onFailure(call: Call<List<pojoItem>>, t: Throwable) {
               Toast.makeText(this@MainActivity, "notokie", Toast.LENGTH_SHORT).show()
           }


       })
    }
}