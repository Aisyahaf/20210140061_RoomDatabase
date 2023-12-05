package com.example.project7_classc.repositori

import android.content.Context
import com.example.project7_classc.AplikasiSiswa
import com.example.project7_classc.data.DatabaseSiswa

interface ContainerApp{
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: AplikasiSiswa): ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy{
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }

}