package com.example.mvvmretrofit.data.repo

import com.example.mvvmretrofit.data.repo.remote.NetworkState
import com.example.mvvmretrofit.data.repo.remote.RetrofitService
import com.example.mvvmretrofit.responsemodels.BusinessListResponse

class MainRepository constructor(private val retrofitService: RetrofitService) {

//    suspend fun getAllMovies(): NetworkState<ProductListResponse> {
//        val response = retrofitService.getAllMovies()
//        return if (response.isSuccessful) {
//            val responseBody = response.body()
//            if (responseBody != null) {
//                NetworkState.Success(responseBody)
//            } else {
//                NetworkState.Error(response)
//            }
//        } else {
//            NetworkState.Error(response)
//        }
//    }

    suspend fun getBusinessList(): NetworkState<BusinessListResponse> {
        val response = retrofitService.getBusinessList()
        return if (response.isSuccessful) {
            val responseBody = response.body()
            if (responseBody != null) {
                NetworkState.Success(responseBody)
            } else {
                NetworkState.Error(response)
            }
        } else {
            NetworkState.Error(response)
        }
    }

}