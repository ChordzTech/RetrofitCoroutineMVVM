package com.example.mvvmretrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmretrofit.databinding.AdapterMovieBinding
import com.example.mvvmretrofit.responsemodels.DataItem


class MovieAdapter : RecyclerView.Adapter<MainViewHolder>() {

//    var movieList = mutableListOf<Movie>()
    var businessList = mutableListOf<DataItem?>()

//    fun setMovies(movies: List<Movie>) {
//        this.movieList = movies.toMutableList()
//        notifyDataSetChanged()
//    }

    fun setBusiness(business: MutableList<DataItem?>) {
        this.businessList = business
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val binding = AdapterMovieBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
//        val movie = movieList[position]
//        if (ValidationUtil.validateMovie(movie)) {
//            holder.binding.name.text = movie.name
//            Glide.with(holder.itemView.context).load(movie.imageUrl).into(holder.binding.imageview)
//        }
        val business = businessList[position]
        holder.binding.name.text = business!!.businessname
    }

    override fun getItemCount(): Int {
//        return movieList.size
        return businessList.size
    }
}

class MainViewHolder(val binding: AdapterMovieBinding) : RecyclerView.ViewHolder(binding.root) {

}