package com.example.myroom.repositori

import android.content.Context
import com.example.myroom.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context):
        ContainerApp {
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSsiswa(
            siswaDaoDatabaseSiswa.getDatabase(context).siswaDao())
    }
}
