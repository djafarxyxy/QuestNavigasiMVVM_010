package com.example.tugas9.Repository

import com.example.tugas9.Data.Dao.mahasiswaDao
import com.example.tugas9.Data.entity.Mahasiswa

class LocalRepositoryMhs(
    private val mahasiswaDao: mahasiswaDao
) : RepositoryMhs {

    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}
