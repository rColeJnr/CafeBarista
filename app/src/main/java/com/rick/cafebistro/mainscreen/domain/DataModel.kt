package com.rick.cafebistro.mainscreen.domain

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.rick.cafebistro.R

@Entity
data class BreakFast(
    @PrimaryKey val id: Int? = null,
    val name: String,
    val image: Int
)

enum class BreakFastImages(drawable: Int){
    BREAKFAST1(R.drawable.breakfast1),
    BREAKFAST2(R.drawable.breakfast2),
    BREAKFAST3(R.drawable.breakfast3),
    BREAKFAST4(R.drawable.breakfast4),
    BREAKFAST5(R.drawable.breakfast5),
    BREAKFAST6(R.drawable.breakfast6),
    BREAKFAST7(R.drawable.breakfast7),
    BREAKFAST8(R.drawable.breakfast8);

    companion object {
        val Default = BREAKFAST1
    }
}

@Entity
data class MainCourse(
    @PrimaryKey val id: Int? = null,
    val name: String,
    val image: Int
)

enum class MainCourseImages(drawable: Int){
    MAIN1(R.drawable.main1),
    MAIN2(R.drawable.main2),
    MAIN3(R.drawable.main3),
    MAIN4(R.drawable.main4),
    MAIN5(R.drawable.main5);

    companion object{
        val Default = MAIN1
    }
}

@Entity
data class Dessert(
    @PrimaryKey val id: Int? = null,
    val name: String,
    val image: Int
)

enum class DessertImage(drawable: Int){
    DESSERT1(R.drawable.dessert1),
    DESSERT2(R.drawable.dessert2),
    DESSERT3(R.drawable.dessert3),
    DESSERT4(R.drawable.dessert4),
    DESSERT5(R.drawable.dessert5),
    DESSERT6(R.drawable.dessert6);

    companion object {
        val Default = DESSERT1
    }
}