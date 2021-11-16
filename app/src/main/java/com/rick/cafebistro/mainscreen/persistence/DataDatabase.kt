package com.rick.cafebistro.mainscreen.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rick.cafebistro.mainscreen.domain.BreakFast
import com.rick.cafebistro.mainscreen.domain.Dessert
import com.rick.cafebistro.mainscreen.domain.MainCourse

@Database(
    entities = [MainCourse::class],
    version = 1
)
abstract class MainCourseDatabase: RoomDatabase() {

    abstract val mainCourseDao: MainCourseDao

    companion object {
        const val MAIN_COURSE_DATABASE = "MAIN_COURSE_DATABASE"
    }

}

@Database(
    entities = [Dessert::class],
    version = 1
)
abstract class DessertDatabase: RoomDatabase() {

    abstract val dessertDao: DessertDao

    companion object {
        const val DESSERT_DATABASE = "DESSERT_DATABASE"
    }

}

@Database(
    entities = [BreakFast::class],
    version = 1
)
abstract class BreakFastDatabase: RoomDatabase() {

    abstract val breakFastDao: BreakFastDao

    companion object {
        const val BREAKFAST_DATABASE = "BREAKFAST_DATABASE"
    }

}