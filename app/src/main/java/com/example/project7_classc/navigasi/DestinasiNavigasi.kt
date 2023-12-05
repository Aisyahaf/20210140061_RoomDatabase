package com.example.project7_classc.navigasi

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menentukan jalur untuk composable
     */
    val route: String

    /**
     * String resource id yg berisis judul yg akan ditampilkan di layar halaman
     */
    val titleRes: Int
}