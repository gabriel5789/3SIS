package br.com.fiap.movies.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.movies.R
import br.com.fiap.movies.data.MovieModel
import br.com.fiap.movies.databinding.ActivityMovieBinding

class MovieActivity : AppCompatActivity() {

    lateinit var binding: ActivityMovieBinding;

    private val movieModel: MovieModel by lazy {
        intent.extras?.getSerializable(MOVIE_MODEL_KEY) as MovieModel;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        binding = ActivityMovieBinding.inflate(layoutInflater);
        setContentView(binding.root);
        setupMovieDetails();
    }

    private fun setupMovieDetails() {
        binding.movieName.text = movieModel.name;
        binding.duration.text = movieModel.duration;
        binding.genre.text = movieModel.genre;
        binding.movieSinopsis.text = movieModel.sinopsis;
        binding.parentalRating.text = movieModel.parentalRating;
        binding.inTheathers.text = when(movieModel.inTheathers) {
            true -> getString(R.string.inTheathers);
            false -> getString(R.string.notInTheathers);
        }
    }

    companion object {
        const val MOVIE_MODEL_KEY = "MOVIE_MODEL_KEY";
    }
}