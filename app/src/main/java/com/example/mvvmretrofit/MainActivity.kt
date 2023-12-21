package com.example.mvvmretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmretrofit.data.repo.MainRepository
import com.example.mvvmretrofit.data.repo.remote.RetrofitService
import com.example.mvvmretrofit.databinding.ActivityMainBinding
import com.example.mvvmretrofit.responsemodels.BusinessListResponse

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    private val adapter = MovieAdapter()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val retrofitService = RetrofitService.getInstance()
        val mainRepository = MainRepository(retrofitService)
        binding.recyclerview.adapter = adapter

        viewModel = ViewModelProvider(this, MyViewModelFactory(mainRepository)).get(MainViewModel::class.java)


//        viewModel.movieList.observe(this) {
////            adapter.setMovies(it)
//        }
        viewModel.businessList.observe(this) {
            val businessList : BusinessListResponse = it as BusinessListResponse
            Log.e("TAG", "businessList size : "+ businessList.data!!.size )
            adapter.setBusiness(businessList.data.toMutableList())
        }

        viewModel.errorMessage.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }

        viewModel.loading.observe(this, Observer {
            if (it) {
                binding.progressDialog.visibility = View.VISIBLE
            } else {
                binding.progressDialog.visibility = View.GONE
            }
        })

//        viewModel.getAllMovies()
        viewModel.getBusinessList()

    }
}