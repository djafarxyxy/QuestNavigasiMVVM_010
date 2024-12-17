package com.example.tugas9.dependenciesinjection

import android.content.Context
import com.example.tugas9.Data.Database.krsDatabase
import com.example.tugas9.Repository.LocalRepositoryMhs
import com.example.tugas9.Repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(krsDatabase.getDatabase(context).mahasiswaDao())
    }
}