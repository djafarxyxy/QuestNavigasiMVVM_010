package com.example.tugas9.Repository

import com.example.tugas9.Data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}