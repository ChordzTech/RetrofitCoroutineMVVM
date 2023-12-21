package com.example.mvvmretrofit

import com.example.mvvmretrofit.responsemodels.BusinessListResponse
import com.example.mvvmretrofit.responsemodels.DataItem

object ValidationUtil {

//    fun validateMovie(movie: Movie) : Boolean {
//        if (movie.name.isNotEmpty() && movie.category.isNotEmpty()) {
//            return true
//        }
//        return false
//    }
    fun validationBusiness(business: BusinessListResponse):Boolean{
        if (business.data!!.contains(DataItem(businessname = toString()))){
            return true
        }
        return false
    }
}