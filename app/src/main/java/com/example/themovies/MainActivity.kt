package com.example.themovies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
import com.example.themovies.ui.TheMoviesTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheMoviesTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MovieItem(movies.first())
                }
            }
        }
    }
}

@Composable
fun MovieItem(movie: Movie) {
    Text(text = movie.title)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TheMoviesTheme {
        MovieItem(movies.first())
    }
}