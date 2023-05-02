package br.com.fiap.movies.view

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.movies.R
import br.com.fiap.movies.data.MovieModel
import br.com.fiap.movies.data.MoviesDataSource
import br.com.fiap.movies.databinding.ActivityMovieListBinding
import br.com.fiap.movies.view.MovieActivity.Companion.MOVIE_MODEL_KEY
import br.com.fiap.movies.view.adapter.MovieAdapter

class MovieListActivity : AppCompatActivity() {

    lateinit var binding : ActivityMovieListBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.recyclerViewMovies.adapter = MovieAdapter(
            MoviesDataSource.moviesList,
            ::goToMovieActivity
        )
    }

    private fun goToMovieActivity(movieModel: MovieModel) {
        startActivity(
            Intent(
                this,
                MovieActivity::class.java
            ).putExtra(MOVIE_MODEL_KEY, movieModel)
        )
    }
}