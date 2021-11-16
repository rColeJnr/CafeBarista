package com.rick.cafebistro.mainscreen

import android.app.Application
import androidx.room.Room
import com.rick.cafebistro.mainscreen.domain.IBreakFastRepository
import com.rick.cafebistro.mainscreen.domain.IDessertRepository
import com.rick.cafebistro.mainscreen.domain.IMainCourseRepository
import com.rick.cafebistro.mainscreen.domain.use_cases.*
import com.rick.cafebistro.mainscreen.persistence.*
import com.rick.cafebistro.mainscreen.persistence.BreakFastDatabase.Companion.BREAKFAST_DATABASE
import com.rick.cafebistro.mainscreen.persistence.DessertDatabase.Companion.DESSERT_DATABASE
import com.rick.cafebistro.mainscreen.persistence.MainCourseDatabase.Companion.MAIN_COURSE_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainScreenModule {

    @Provides
    @Singleton
    fun providesMainCourseDatabase(app: Application): MainCourseDatabase =
        Room.databaseBuilder(
            app,
            MainCourseDatabase::class.java,
            MAIN_COURSE_DATABASE
        ).build()


    @Provides
    @Singleton
    fun providesDessertDatabase(app: Application): DessertDatabase =
        Room.databaseBuilder(
            app,
            DessertDatabase::class.java,
            DESSERT_DATABASE
        ).build()


    @Provides
    @Singleton
    fun providesBreakFastDatabase(app: Application): BreakFastDatabase =
        Room.databaseBuilder(
            app,
            BreakFastDatabase::class.java,
            BREAKFAST_DATABASE
        ).build()

    @Provides
    @Singleton
    fun providesMainCourseRepository(db: MainCourseDatabase) : IMainCourseRepository {
        return MainCourseRepositoryImpl(db.mainCourseDao)
    }

    @Provides
    @Singleton
    fun providesDessertRepository(db: DessertDatabase) : IDessertRepository {
        return DessertRepositoryImpl(db.dessertDao)
    }

    @Provides
    @Singleton
    fun providesBreakFastRepository(db: BreakFastDatabase) : IBreakFastRepository {
        return BreakFastRepositoryImpl(db.breakFastDao)
    }

    @Provides
    @Singleton
    fun providesDataUseCases(
        mainCourseRepository: IMainCourseRepository,
        dessertRepository: IDessertRepository,
        breakfastRepository: IBreakFastRepository,
    ): DataUseCases{
        return DataUseCases(
            getMainCourses = GetMainCourses(mainCourseRepository),
            getDesserts = GetDesserts(dessertRepository),
            getBreakFasts = GetBreakFasts(breakfastRepository),
            getMainCourseById = GetMainCourseById(mainCourseRepository),
            getDessertById = GetDessertById(dessertRepository),
            getBreakFastById = GetBreakFastById(breakfastRepository),
            deleteMainCourse = DeleteMainCourse(mainCourseRepository),
            deleteDessert = DeleteDessert(dessertRepository),
            deleteBreakFast = DeleteBreakFast(breakfastRepository),
            saveMainCourse = SaveMainCourse(mainCourseRepository),
            saveDessert = SaveDessert(dessertRepository),
            saveBreakFast = SaveBreakFast(breakfastRepository)
        )
    }
}