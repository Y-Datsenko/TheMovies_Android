package com.example.themovies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
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
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            alignment = Alignment.Center,
            modifier = Modifier
                .size(size = 50.dp)
                .background(color = Color(61, 198, 94), shape = CircleShape)
        ) {
            Text(text = movie.firstLetter, color = Color.White)
        }
        Column(modifier = Modifier.padding(start = 8.dp)) {
            Text(
                text = movie.title,
                style = MaterialTheme.typography.h6,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2
            )
            Text(
                text = movie.description,
                style = MaterialTheme.typography.subtitle1,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                modifier = Modifier.padding(top = 2.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TheMoviesTheme {
        MovieItem(movies.first())
    }
}