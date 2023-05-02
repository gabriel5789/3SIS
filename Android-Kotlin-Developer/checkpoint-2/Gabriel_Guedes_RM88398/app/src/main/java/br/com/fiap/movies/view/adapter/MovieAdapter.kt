package br.com.fiap.movies.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.movies.R
import br.com.fiap.movies.data.MovieModel
import br.com.fiap.movies.databinding.ViewMovieItemBinding

class MovieAdapter(
        private val movieList: List<MovieModel>,
        private val onCardClick: (MovieModel) -> Unit
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = ViewMovieItemBinding.bind(itemView);

        fun bind(item: MovieModel) {
            binding.movieName.text = item.name
            binding.buttonDetail.setOnClickListener {
                onCardClick.invoke(item)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(R.layout.view_movie_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}
