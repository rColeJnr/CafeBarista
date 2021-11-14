package com.rick.cafebistro.mainscreen.domain

import kotlinx.coroutines.flow.Flow

interface IDessertRepository {

    suspend fun saveDessert(dessert: Dessert)

    suspend fun deleteDessert(dessert: Dessert)

    suspend fun getDesserts(): Flow<List<Dessert>>

    suspend fun getDessertById(id: Int): Dessert?

}

interface IMainCourseRepository {

    suspend fun saveMain(mainCourse: MainCourse)

    suspend fun deleteMain(mainCourse: MainCourse)

    suspend fun getMains(): Flow<List<MainCourse>>

    suspend fun getMainById(id: Int): MainCourse?

}
interface IBreakFastRepository {

    suspend fun saveBreak(breakFast: BreakFast)

    suspend fun deleteBreak(breakFast: BreakFast)

    suspend fun getBreaks(): Flow<List<BreakFast>>

    suspend fun getBreakById(id: Int): BreakFast?

}