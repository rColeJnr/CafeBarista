package com.rick.cafebistro.mainscreen.persistence

import com.rick.cafebistro.mainscreen.domain.*
import kotlinx.coroutines.flow.Flow

class DessertRepositoryImpl(private val dessertDao: DessertDao): IDessertRepository {
    override suspend fun saveDessert(dessert: Dessert) {
        dessertDao.saveDessert(dessert)
    }

    override suspend fun deleteDessert(dessert: Dessert) {
        dessertDao.deleteDessert(dessert)
    }

    override suspend fun getDesserts(): Flow<List<Dessert>> {
        return dessertDao.getDesserts()
    }

    override suspend fun getDessertById(id: Int): Dessert? {
        return dessertDao.getDessertById(id)
    }
}

class MainCourseRepositoryImpl(private val mainCourseDao: MainCourseDao): IMainCourseRepository {
    override suspend fun saveMain(mainCourse: MainCourse) {
        mainCourseDao.saveMainCourse(mainCourse)
    }

    override suspend fun deleteMain(mainCourse: MainCourse) {
        mainCourseDao.deleteMainCourse(mainCourse)
    }

    override suspend fun getMains(): Flow<List<MainCourse>> {
        return mainCourseDao.getMainCourses()
    }

    override suspend fun getMainById(id: Int): MainCourse? {
        return mainCourseDao.getMainCourseById(id)
    }
}

class BreakFastRepositoryImpl(private val breakFastDao: BreakFastDao): IBreakFastRepository {
    override suspend fun saveBreak(breakFast: BreakFast) {
        breakFastDao.saveBreakFast(breakFast)
    }

    override suspend fun deleteBreak(breakFast: BreakFast) {
        breakFastDao.deleteBreakFast(breakFast)
    }

    override suspend fun getBreaks(): Flow<List<BreakFast>> {
        return breakFastDao.getBreakfasts()
    }

    override suspend fun getBreakById(id: Int): BreakFast? {
        return breakFastDao.getBreakFastById(id)
    }
}