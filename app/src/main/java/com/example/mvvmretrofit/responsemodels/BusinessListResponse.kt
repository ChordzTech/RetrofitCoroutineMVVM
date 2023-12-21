package com.example.mvvmretrofit.responsemodels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.RawValue

@Parcelize
data class BusinessListResponse(

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: String? = null
) : Parcelable

@Parcelize
data class DataItem(
	
	@field:SerializedName("gsm")
	
	val gsm: @RawValue Any? = null,

	@field:SerializedName("waste")
	val waste:@RawValue Any? = null,

	@field:SerializedName("pincode")
	val pincode: String? = null,

	@field:SerializedName("burstingfactor")
	val burstingfactor:@RawValue Any? = null,

	@field:SerializedName("activationdate")
	val activationdate: String? = null,

	@field:SerializedName("subscriptiondate")
	val subscriptiondate: String? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("estimatenote")
	val estimatenote: String? = null,

	@field:SerializedName("businessid")
	val businessid: Int? = null,

	@field:SerializedName("tax")
	val tax:@RawValue Any? = null,

	@field:SerializedName("marginlength")
	val marginlength:@RawValue Any? = null,

	@field:SerializedName("marginwidth")
	val marginwidth:@RawValue Any? = null,

	@field:SerializedName("rate")
	val rate:@RawValue Any? = null,

	@field:SerializedName("businessname")
	val businessname: String? = null,

	@field:SerializedName("multiuser")
	val multiuser: Int? = null,

	@field:SerializedName("flutefactor")
	val flutefactor:@RawValue Any? = null,

	@field:SerializedName("conversionrate")
	val conversionrate:@RawValue Any? = null,

	@field:SerializedName("profit")
	val profit:@RawValue Any? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("contactno")
	val contactno: String? = null,

	@field:SerializedName("geolocation")
	val geolocation: String? = null,

	@field:SerializedName("status")
	val status: String? = null
) : Parcelable
