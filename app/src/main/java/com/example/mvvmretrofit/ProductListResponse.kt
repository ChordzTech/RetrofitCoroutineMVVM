package com.example.mvvmretrofit


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductListResponse(

    @field:SerializedName("responseCode")
    val responseCode: Int? = null,

    @field:SerializedName("products")
    val products: List<ProductsItem?>? = null
) : Parcelable

@Parcelize
data class ProductsItem(

    @field:SerializedName("price")
    val price: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("category")
    val category: Category? = null,

    @field:SerializedName("brand")
    val brand: String? = null
) : Parcelable

@Parcelize
data class Usertype(

    @field:SerializedName("usertype")
    val usertype: String? = null
) : Parcelable

@Parcelize
data class Category(

    @field:SerializedName("usertype")
    val usertype: Usertype? = null,

    @field:SerializedName("category")
    val category: String? = null
) : Parcelable
