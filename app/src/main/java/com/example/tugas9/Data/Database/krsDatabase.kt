package com.example.tugas9.Data.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tugas9.Data.Dao.mahasiswaDao
import com.example.tugas9.Data.entity.Mahasiswa

@Database(entities = [Mahasiswa::class], version =1 , exportSchema = false)
abstract class krsDatabase(): RoomDatabase(){
    abstract fun mahasiswaDao():mahasiswaDao

    companion object{
        @Volatile
        private var Instance: krsDatabase? = null


        fun getDatabase(context: Context): krsDatabase{
            return (Instance ?: synchronized(this){
                Room.databaseBuilder(
                    context.applicationContext,
                    krsDatabase::class.java, //Class database
                    "krsDatabase" //
                )
                    .build().also{ Instance= it}
            })
        }
    }
}