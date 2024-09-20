package com.example.viewpager2tablayout

import java.io.Serializable


class Page(val name: String, val image: Int, val url: String): Serializable {

    companion object{
        val list = mutableListOf(
            Page("Новости", R.drawable.news, "https://ria.ru/"),
            Page(
                "Кино",
                R.drawable.cinema,
                "https://www.kinopoisk.ru/?utm_referrer=yandex.ruhttps://www.kinopoisk.ru/?utm_referrer=yandex.ru"
            ),
            Page("Спорт", R.drawable.sports, "https://www.sports.ru/"),
            Page("Музыка", R.drawable.music, "https://music.yandex.ru/home")
        )
    }
}