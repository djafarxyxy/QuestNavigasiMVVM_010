package com.example.tugas9.Data.Dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.tugas9.Data.entity.Mahasiswa

@Dao
interface mahasiswaDao {

    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}