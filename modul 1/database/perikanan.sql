-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 17, 2016 at 01:42 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perikanan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_induk`
--

CREATE TABLE `tb_induk` (
  `id_induk` int(11) NOT NULL,
  `id_kolam` int(11) NOT NULL,
  `jumlah_induk` int(11) NOT NULL,
  `berat_rata` double NOT NULL,
  `tanggal_induk` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_kategori_keasaman`
--

CREATE TABLE `tb_kategori_keasaman` (
  `id_kategori_keasaman` int(11) NOT NULL,
  `ukuran_keasaman` varchar(10) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_kategori_pencemaran`
--

CREATE TABLE `tb_kategori_pencemaran` (
  `id_kategori_pencemaran` int(11) NOT NULL,
  `jenis_kategori_pencemaran` varchar(30) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_kategori_suhu`
--

CREATE TABLE `tb_kategori_suhu` (
  `id_kategori_suhu` int(11) NOT NULL,
  `jenis_kategori_suhu` varchar(25) NOT NULL,
  `ukuran_suhu` varchar(30) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_kelola_kolam`
--

CREATE TABLE `tb_kelola_kolam` (
  `id_kelola_kolam` int(11) NOT NULL,
  `tanggal_kelola` date NOT NULL,
  `id_kolam` int(11) NOT NULL,
  `jenis_kelola` enum('suhu','keasaman','pencemaran','irigasi') NOT NULL,
  `id_kategori_suhu` int(11) DEFAULT NULL,
  `id_kategori_keasaman` int(11) DEFAULT NULL,
  `id_kategori_pencemaran` int(11) DEFAULT NULL,
  `permasalahan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_kolam`
--

CREATE TABLE `tb_kolam` (
  `id_kolam` int(11) NOT NULL,
  `nama_kolam` varchar(10) NOT NULL,
  `panjang kolam` double NOT NULL,
  `lebar kolam` double NOT NULL,
  `tinggi_kolam` double NOT NULL,
  `daya_tampung_maksimal` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_induk`
--
ALTER TABLE `tb_induk`
  ADD PRIMARY KEY (`id_induk`);

--
-- Indexes for table `tb_kategori_keasaman`
--
ALTER TABLE `tb_kategori_keasaman`
  ADD PRIMARY KEY (`id_kategori_keasaman`);

--
-- Indexes for table `tb_kategori_pencemaran`
--
ALTER TABLE `tb_kategori_pencemaran`
  ADD PRIMARY KEY (`id_kategori_pencemaran`);

--
-- Indexes for table `tb_kategori_suhu`
--
ALTER TABLE `tb_kategori_suhu`
  ADD PRIMARY KEY (`id_kategori_suhu`);

--
-- Indexes for table `tb_kelola_kolam`
--
ALTER TABLE `tb_kelola_kolam`
  ADD PRIMARY KEY (`id_kelola_kolam`);

--
-- Indexes for table `tb_kolam`
--
ALTER TABLE `tb_kolam`
  ADD PRIMARY KEY (`id_kolam`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_induk`
--
ALTER TABLE `tb_induk`
  MODIFY `id_induk` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_kategori_pencemaran`
--
ALTER TABLE `tb_kategori_pencemaran`
  MODIFY `id_kategori_pencemaran` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_kelola_kolam`
--
ALTER TABLE `tb_kelola_kolam`
  MODIFY `id_kelola_kolam` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_kolam`
--
ALTER TABLE `tb_kolam`
  MODIFY `id_kolam` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
