package com.rick.cafebistro.mainscreen.persistence

import androidx.room.*
import com.rick.cafebistro.mainscreen.domain.BreakFast
import com.rick.cafebistro.mainscreen.domain.Dessert
import com.rick.cafebistro.mainscreen.domain.MainCourse
import kotlinx.coroutines.flow.Flow

@Dao
interface MainCourseDao {

    @Query("SELECT * FROM maincourse")
    fun getMainCourses(): Flow<List<MainCourse>>

    @Query("SELECT * FROM maincourse WHERE id = :id")
    fun getMainCourseById(id: Int): MainCourse?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMainCourse(mainCourse: MainCourse)

    @Delete
    suspend fun deleteMainCourse(mainCourse: MainCourse)

}

@Dao
interface DessertDao {

    @Query("SELECT * FROM dessert")
    fun getDesserts(): Flow<List<Dessert>>

    @Query("SELECT * FROM dessert WHERE id = :id")
    fun getDessertById(id: Int): Dessert?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveDessert(dessert: Dessert)

    @Delete
    suspend fun deleteDessert(dessert: Dessert)

}

@Dao
interface BreakFastDao {

    @Query("SELECT * FROM breakfast")
    fun getBreakfasts(): Flow<List<BreakFast>>

    @Query("SELECT * FROM breakfast WHERE id = :id")
    fun getBreakFastById(id: Int): BreakFast?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveBreakFast(breakFast: BreakFast)

    @Delete
    suspend fun deleteBreakFast(breakFast: BreakFast)

}