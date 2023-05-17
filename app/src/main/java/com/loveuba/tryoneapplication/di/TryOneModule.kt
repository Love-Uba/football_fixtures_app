package com.loveuba.tryoneapplication.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.loveuba.tryoneapplication.UtilConstants.BASE_URL
import com.loveuba.tryoneapplication.data.TryService
import com.loveuba.tryoneapplication.data.repo.ITryRepository
import com.loveuba.tryoneapplication.data.repo.TryRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TryOneModule {

//    @Provides
//    fun makeGson() : Gson{
//        return GsonBuilder().create()
//    }

    @Provides
    @Singleton
    fun provideLogger(): HttpLoggingInterceptor{
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Provides
    @Singleton
    fun provideClient(
        logger: HttpLoggingInterceptor
    ): OkHttpClient{
        return OkHttpClient.Builder()
            .connectTimeout(3000L, TimeUnit.MILLISECONDS)
            .readTimeout(3000L, TimeUnit.MILLISECONDS)
            .writeTimeout(3000L, TimeUnit.MILLISECONDS)
            .addInterceptor(logger)
            .addInterceptor { chain ->
                val request: Request = chain.request().newBuilder()
                    .addHeader("X-Auth-Token", "ef18f95fca244b2d97ee0e4104e7542b")
                    .build()
                chain.proceed(request)
            }
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofitClient(okHttpClient: OkHttpClient) : Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .build()
    }

    @Provides
    fun provideApiService(retrofit: Retrofit): TryService{
        return retrofit.create(TryService::class.java)
    }

    @Provides
    @Singleton
    fun provideTryRepository(tryService: TryService) : ITryRepository{
        return TryRepository(tryService)
    }

}