package com.rick.cafebistro.mainscreen.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rick.cafebistro.mainscreen.domain.BreakFast
import com.rick.cafebistro.mainscreen.domain.Dessert
import com.rick.cafebistro.mainscreen.domain.MainCourse

@Database(
    entities = [Dessert::class],
    version = 1
)
abstract class DessertDatabase: RoomDatabase() {

    abstract val dessertDao: DessertDao

}

@Database(
    entities = [MainCourse::class],
    version = 1
)
abstract class MainCourseDatabase: RoomDatabase() {

    abstract val mainCourseDao: MainCourseDao

}

@Database(
    entities = [BreakFast::class],
    version = 1
)
abstract class BreakFastDatabase: RoomDatabase() {

    abstract val breakFastDao: BreakFastDao

}