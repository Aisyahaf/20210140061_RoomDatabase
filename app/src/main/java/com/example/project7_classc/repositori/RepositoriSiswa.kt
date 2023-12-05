package com.example.project7_classc.repositori

import com.example.project7_classc.data.Siswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>

    fun  getSiswaStream(id: Int): Flow<Siswa?>

    suspend fun insertSiswa(siswa: Siswa)

    suspend fun deleteSiswa(siswa: Siswa)

    suspend fun updateSiswa(siswa: Siswa)
}