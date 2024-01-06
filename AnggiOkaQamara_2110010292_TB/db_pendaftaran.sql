-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 06 Jan 2024 pada 01.50
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pendaftaran`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `administrasi_data`
--

CREATE TABLE `administrasi_data` (
  `nim` int(15) NOT NULL,
  `golongan` varchar(50) NOT NULL,
  `metode_pembayaran` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelengkap_data`
--

CREATE TABLE `pelengkap_data` (
  `nim` int(20) NOT NULL,
  `nama_ayah` varchar(50) NOT NULL,
  `pekerjaan_ayah` varchar(50) NOT NULL,
  `nama_ibu` varchar(50) NOT NULL,
  `pekerjaan_ibu` varchar(50) NOT NULL,
  `alamat` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pendaftaran_mahasiswa`
--

CREATE TABLE `pendaftaran_mahasiswa` (
  `nim` int(15) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `TTL` varchar(30) NOT NULL,
  `fakultas` varchar(50) NOT NULL,
  `jurusan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `administrasi_data`
--
ALTER TABLE `administrasi_data`
  ADD PRIMARY KEY (`nim`);

--
-- Indeks untuk tabel `pelengkap_data`
--
ALTER TABLE `pelengkap_data`
  ADD PRIMARY KEY (`nim`);

--
-- Indeks untuk tabel `pendaftaran_mahasiswa`
--
ALTER TABLE `pendaftaran_mahasiswa`
  ADD PRIMARY KEY (`nim`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
