package com.example.themovies

data class Movie(
    val title: String,
    val firstLetter: String,
    val description: String
)

val movies = listOf(
    Movie(
        title = "Hamilton",
        firstLetter = "H",
        description = "The real life of one of America's foremost founding fathers and first Secretary of the Treasury, Alexander Hamilton. Captured live on Broadway from the Richard Rodgers Theater with the original Broadway cast."
    ),
    Movie(
        title = "Onward (I)",
        firstLetter = "O",
        description = "Two elven brothers embark on a quest to bring their father back for one day."
    ),
    Movie(
        title = "The King of Staten Island",
        firstLetter = "K",
        description = "Scott has been a case of arrested development since his firefighter dad died. He spends his days smoking weed and dreaming of being a tattoo artist until events force him to grapple with his grief and take his first steps forward in life."
    ),
    Movie(
        title = "The Invisible Man",
        firstLetter = "I",
        description = "When Cecilia's abusive ex takes his own life and leaves her his fortune, she suspects his death was a hoax. As a series of coincidences turn lethal, Cecilia works to prove that she is being hunted by someone nobody can see."
    ),
)
