-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 29, 2020 lúc 01:41 AM
-- Phiên bản máy phục vụ: 10.4.13-MariaDB
-- Phiên bản PHP: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `thuetruyen`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblhoadon`
--

CREATE TABLE `tblhoadon` (
  `id` int(11) NOT NULL,
  `idPhieuthuetruyen` int(11) NOT NULL,
  `idNhanvien` int(11) NOT NULL,
  `day` date NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tblhoadon`
--

INSERT INTO `tblhoadon` (`id`, `idPhieuthuetruyen`, `idNhanvien`, `day`, `total`) VALUES
(1, 1, 2, '2020-01-05', 15.61),
(2, 2, 3, '2020-04-14', 11.44);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblkhachhang`
--

CREATE TABLE `tblkhachhang` (
  `id` int(11) NOT NULL,
  `fullname` varchar(255) NOT NULL,
  `idCard` int(11) NOT NULL,
  `birthday` date NOT NULL,
  `address` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tblkhachhang`
--

INSERT INTO `tblkhachhang` (`id`, `fullname`, `idCard`, `birthday`, `address`, `email`, `phone`) VALUES
(1, 'Hoàng Nam Anh', 12345678, '1995-07-23', 'Thanh Xuân- Hà Nội', 'hoangan0795@gmail.com', '0912345567'),
(2, 'Tô Hoàng Anh', 12346785, '1999-06-24', 'Hai Bà Trưng- Hà Nội', 'tohoanganh24@gmail.com', '0123456789'),
(3, 'Nguyễn Hồng Nhung', 12356789, '2000-09-09', 'Cầu Giấy – Hà Nội', 'nhnhung090@gmail.com', '0726725372'),
(4, 'Nguyễn Văn Quang', 22672564, '1997-07-07', 'Cầu Giấy – Hà Nội', 'xquang0797@gmail.com', '0562934582'),
(5, 'Trần Xuân Quốc', 45628564, '1998-09-08', 'Đống Đa – Hà Nội', 'xquoc089@gmail.com', '0393872642'),
(6, 'Cao Thị Trang', 65314384, '1996-09-09', 'Nam Từ Liêm – Hà Nội', 'caottrang0996@gmail.com', '0892645213'),
(7, 'Nguyễn Hoàng Xuân', 76356354, '1999-12-30', 'Bắc Từ Liêm – Hà Nội', 'hngxuan9912@gmail.com', '0923273542'),
(8, 'Tô Hoàng Xuân', 83753453, '2000-06-04', 'Hà Đông – Hà Nội', 'hngxuan0406@gmail.com', '0276376532');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblloi`
--

CREATE TABLE `tblloi` (
  `id` int(11) NOT NULL,
  `failure` varchar(255) NOT NULL,
  `price` float NOT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tblloi`
--

INSERT INTO `tblloi` (`id`, `failure`, `price`, `description`) VALUES
(1, 'Rách trang bìa', 5, 'Rách góc,.. trang bìa'),
(2, 'Bung bìa', 8, 'Bung hẳn 1 trang bìa'),
(3, 'Rách trang con', 2, 'Rách 1 trang con mà không phải trang bìa'),
(4, 'Bung trang con', 4, 'Bung 1 trang con mà không phải trang bìa'),
(5, 'Bẩn/Ghi ', 3, 'Bị bẩn hoặc bị ghi bút mực ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblnhanvien`
--

CREATE TABLE `tblnhanvien` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `fullname` varchar(255) NOT NULL,
  `position` varchar(255) CHARACTER SET utf16 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tblnhanvien`
--

INSERT INTO `tblnhanvien` (`id`, `username`, `password`, `fullname`, `position`) VALUES
(1, 'staffA', 'staffa123', 'Nguyễn Văn A', 'Nhân viên lễ tân'),
(2, 'staffNam', 'staffnam456', 'Nguyễn Ngọc Nam', 'Nhân viên lễ tân'),
(3, 'staffTrung', 'stafftrung789', 'Bùi Đức Trung', 'Nhân viên lễ tân'),
(4, 'staffTuyen', 'stafftuyen891', 'Trần Xuân Tuyên', 'Quản lý');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblphieuphat`
--

CREATE TABLE `tblphieuphat` (
  `id` int(11) NOT NULL,
  `idTruyenthue` int(11) NOT NULL,
  `idLoi` int(11) NOT NULL,
  `price` float NOT NULL,
  `note` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tblphieuphat`
--

INSERT INTO `tblphieuphat` (`id`, `idTruyenthue`, `idLoi`, `price`, `note`) VALUES
(1, 2, 2, 8, 'Bung bìa trước'),
(2, 3, 4, 4, 'Bung trang số 38'),
(3, 3, 5, 3, 'Trang 16 bị dính mực'),
(4, 5, 5, 3, 'Trang bìa dính mực ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblphieuthuetruyen`
--

CREATE TABLE `tblphieuthuetruyen` (
  `id` int(11) NOT NULL,
  `idKhachhang` int(11) NOT NULL,
  `idNhanvien` int(11) NOT NULL,
  `hireDate` date NOT NULL,
  `payDate` date NOT NULL,
  `saleoff` float NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tblphieuthuetruyen`
--

INSERT INTO `tblphieuthuetruyen` (`id`, `idKhachhang`, `idNhanvien`, `hireDate`, `payDate`, `saleoff`, `status`) VALUES
(1, 1, 2, '2019-12-05', '2020-01-05', 0, 1),
(2, 3, 3, '2020-03-14', '2020-04-14', 0, 1),
(3, 8, 3, '2020-05-25', '2020-06-25', 0, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbltruyen`
--

CREATE TABLE `tbltruyen` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `bookcode` int(11) NOT NULL,
  `type` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `publisher` varchar(255) NOT NULL,
  `publishingYear` int(11) NOT NULL,
  `price` float NOT NULL,
  `hireprice` float NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbltruyen`
--

INSERT INTO `tbltruyen` (`id`, `name`, `bookcode`, `type`, `author`, `publisher`, `publishingYear`, `price`, `hireprice`, `status`) VALUES
(1, 'Conan (Tập 66)', 123456, 'Trinh thám', 'Aoyama Gosho', 'Kim Đồng', 2018, 16.8, 1.68, 'Chưa thuê'),
(2, 'Shin – Cậu bé bút chì (Tập 9)', 123460, 'Truyện tranh', ' Usui Yoshito', 'Kim Đồng', 2018, 17.1, 1.71, 'Đang thuê'),
(3, 'Conan (Tập 89)\r\n', 123894, 'Trinh thám', 'Aoyama Gosho', 'Nhã Nam', 2019, 17.8, 1.78, 'Chưa thuê'),
(4, 'Doremon (Tập 3)\r\n', 123998, 'Truyện tranh', 'Fujiko F Fujio', 'Kim Đồng', 2019, 18.5, 1.85, 'Chưa thuê'),
(5, 'Conan (Tập 90)\r\n', 245678, 'Trinh thám', 'Aoyama Gosho', 'Kim Đồng', 2020, 18.9, 1.89, 'Chưa thuê'),
(6, 'Doremon (Tập 5)\r\n', 345678, 'Truyện tranh', 'Fujiko F Fujio', 'Kim Đồng', 2020, 19, 1.9, 'Chưa thuê'),
(7, 'Shin – Cậu bé bút chì (Tập 12)', 357328, 'Truyện tranh', 'Usui Yoshito', 'Kim Đồng', 2020, 19.5, 1.9, 'Chưa thuê'),
(8, 'Conan (Tập 88)\r\n', 453268, 'Trinh thám', 'Aoyama Gosho', 'Kim Đồng', 2020, 19.8, 1.98, 'Chưa thuê'),
(9, 'Doremon (Tập 9)\r\n', 456789, 'Truyện tranh', 'Fujiko F Fujio', 'Kim Đồng', 2020, 19.8, 1.98, 'Đang thuê'),
(10, 'Doremon (Tập 10)\r\n', 456732, 'Truyện tranh', 'Fujiko F Fujio', 'Kim Đồng', 2020, 19.9, 1.99, 'Chưa thuê'),
(11, 'Shin – Cậu bé bút chì (Tập 11)', 467234, 'Truyện tranh', 'Usui Yoshito', 'Kim Đồng', 2020, 18.7, 1.87, 'Chưa thuê');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbltruyenthue`
--

CREATE TABLE `tbltruyenthue` (
  `id` int(11) NOT NULL,
  `idPhieuthuetruyen` int(11) NOT NULL,
  `idTruyen` int(11) NOT NULL,
  `saleoff` float NOT NULL,
  `price` float NOT NULL,
  `Hireprice` float NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbltruyenthue`
--

INSERT INTO `tbltruyenthue` (`id`, `idPhieuthuetruyen`, `idTruyen`, `saleoff`, `price`, `Hireprice`, `status`) VALUES
(1, 1, 2, 0, 17, 1.71, 'Đã trả'),
(2, 1, 7, 0, 19, 1.9, 'Đã trả'),
(3, 2, 1, 0, 16.8, 1.68, 'Đã trả'),
(4, 2, 3, 0, 17.8, 1.78, 'Đã trả'),
(5, 2, 8, 0, 19.8, 1.98, 'Đã trả'),
(6, 3, 11, 0, 18.7, 1.87, 'Đang');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tblhoadon`
--
ALTER TABLE `tblhoadon`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idNhanvien` (`idNhanvien`),
  ADD KEY `idPhieuthuetruyen` (`idPhieuthuetruyen`);

--
-- Chỉ mục cho bảng `tblkhachhang`
--
ALTER TABLE `tblkhachhang`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `tblloi`
--
ALTER TABLE `tblloi`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `tblnhanvien`
--
ALTER TABLE `tblnhanvien`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `tblphieuphat`
--
ALTER TABLE `tblphieuphat`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idTruyenthue` (`idTruyenthue`),
  ADD KEY `idLoi` (`idLoi`);

--
-- Chỉ mục cho bảng `tblphieuthuetruyen`
--
ALTER TABLE `tblphieuthuetruyen`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idKhachhang` (`idKhachhang`),
  ADD KEY `idNhanvien` (`idNhanvien`);

--
-- Chỉ mục cho bảng `tbltruyen`
--
ALTER TABLE `tbltruyen`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `tbltruyenthue`
--
ALTER TABLE `tbltruyenthue`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idPhieuthuetruyen` (`idPhieuthuetruyen`),
  ADD KEY `idTruyen` (`idTruyen`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tblhoadon`
--
ALTER TABLE `tblhoadon`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `tblkhachhang`
--
ALTER TABLE `tblkhachhang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT cho bảng `tblloi`
--
ALTER TABLE `tblloi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `tblnhanvien`
--
ALTER TABLE `tblnhanvien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `tblphieuphat`
--
ALTER TABLE `tblphieuphat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `tblphieuthuetruyen`
--
ALTER TABLE `tblphieuthuetruyen`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `tbltruyen`
--
ALTER TABLE `tbltruyen`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT cho bảng `tbltruyenthue`
--
ALTER TABLE `tbltruyenthue`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `tblhoadon`
--
ALTER TABLE `tblhoadon`
  ADD CONSTRAINT `tblhoadon_ibfk_1` FOREIGN KEY (`idNhanvien`) REFERENCES `tblnhanvien` (`id`),
  ADD CONSTRAINT `tblhoadon_ibfk_2` FOREIGN KEY (`idPhieuthuetruyen`) REFERENCES `tblphieuthuetruyen` (`id`);

--
-- Các ràng buộc cho bảng `tblphieuphat`
--
ALTER TABLE `tblphieuphat`
  ADD CONSTRAINT `tblphieuphat_ibfk_1` FOREIGN KEY (`idTruyenthue`) REFERENCES `tbltruyenthue` (`id`),
  ADD CONSTRAINT `tblphieuphat_ibfk_2` FOREIGN KEY (`idLoi`) REFERENCES `tblloi` (`id`);

--
-- Các ràng buộc cho bảng `tblphieuthuetruyen`
--
ALTER TABLE `tblphieuthuetruyen`
  ADD CONSTRAINT `tblphieuthuetruyen_ibfk_1` FOREIGN KEY (`idKhachhang`) REFERENCES `tblkhachhang` (`id`),
  ADD CONSTRAINT `tblphieuthuetruyen_ibfk_2` FOREIGN KEY (`idNhanvien`) REFERENCES `tblnhanvien` (`id`);

--
-- Các ràng buộc cho bảng `tbltruyenthue`
--
ALTER TABLE `tbltruyenthue`
  ADD CONSTRAINT `tbltruyenthue_ibfk_1` FOREIGN KEY (`idPhieuthuetruyen`) REFERENCES `tblphieuthuetruyen` (`id`),
  ADD CONSTRAINT `tbltruyenthue_ibfk_2` FOREIGN KEY (`idTruyen`) REFERENCES `tbltruyen` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
