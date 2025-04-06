-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 14, 2019 at 11:54 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.1.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentteacherportal`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `userID` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `first` varchar(32) NOT NULL,
  `last` varchar(32) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `phno` varchar(32) NOT NULL,
  `email` varchar(32) NOT NULL,
  `address` varchar(64) DEFAULT NULL,
  `cnic` varchar(32) NOT NULL,
  `role` varchar(32) DEFAULT NULL,
  `country` varchar(16) DEFAULT NULL,
  `city` varchar(32) DEFAULT NULL,
  `zipcode` varchar(16) DEFAULT NULL,
  `accountstatus` varchar(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`userID`, `password`, `first`, `last`, `gender`, `phno`, `email`, `address`, `cnic`, `role`, `country`, `city`, `zipcode`, `accountstatus`) VALUES
('a', 'a', 'Muhammad', 'Shahrukh', 'Male', '03334455999', 'myemail@gmail.com', '123 home, K Town, Lahore', '22333-4455-696-7', 'Admin', 'Pakistan', 'Lahore', '54000', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `courseID` varchar(7) NOT NULL,
  `title` varchar(64) NOT NULL,
  `credithours` int(11) NOT NULL,
  `type` varchar(32) NOT NULL,
  `category` varchar(32) NOT NULL,
  `assignstatus` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`courseID`, `title`, `credithours`, `type`, `category`, `assignstatus`) VALUES
('AGR317', 'Agricultural Meteorology', 3, 'Core', 'Theory', b'0'),
('ANA982', 'Analysis of Algorithms', 3, 'Core', 'Theory', b'0'),
('CAL373', 'Calculus II', 3, 'Core', 'Theory', b'1'),
('COM277', 'Computer Application in Business', 3, 'Core', 'Theory', b'0'),
('DAT866', 'Data Structures and Algorithms', 4, 'Core', 'Theory + Lab', b'0'),
('DIF2', 'Differential Equations', 3, 'Core', 'Theory', b'0'),
('ENG71', 'English-II', 3, 'Core', 'Theory', b'0'),
('FOR663', 'Foreign Language', 3, 'Core', 'Theory', b'0'),
('INT10', 'Introduction to Database Systems', 4, 'Core', 'Theory + Lab', b'0'),
('INT293', 'Introduction to Agribusiness', 3, 'Core', 'Theory', b'0'),
('INT659', 'Introduction to Psychology', 3, 'Core', 'Theory', b'0'),
('IPH872', 'Iphone Application Development', 4, 'Elective', 'Theory + Lab', b'0'),
('IT 110', 'IT Entrepreneurship', 3, 'Core', 'Theory', b'0'),
('LIF354', 'Life and Learning', 3, 'Elective', 'Theory', b'0'),
('LIN985', 'Linear Algebra', 3, 'Core', 'Theory', b'1'),
('MIC880', 'Microprocessor and Assembly Language', 4, 'Core', 'Theory + Lab', b'0'),
('OBJ50', 'Object Oriented Programming', 4, 'Core', 'Theory + Lab', b'0'),
('PRO190', 'Probability and Statistics', 3, 'Core', 'Theory', b'1'),
('SOF484', 'Software Engineering', 3, 'Core', 'Theory', b'0'),
('THE248', 'Theory of Automata', 3, 'Core', 'Theory', b'0');

-- --------------------------------------------------------

--
-- Table structure for table `degrees`
--

CREATE TABLE `degrees` (
  `id` varchar(8) NOT NULL,
  `type` varchar(32) NOT NULL,
  `name` varchar(64) NOT NULL,
  `duration` int(11) NOT NULL,
  `noofquarters` int(11) NOT NULL,
  `totalfee` double NOT NULL,
  `courses` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `degrees`
--

INSERT INTO `degrees` (`id`, `type`, `name`, `duration`, `noofquarters`, `totalfee`, `courses`) VALUES
('COM76', 'Bachelor', 'Computer Science', 4, 16, 1200000, 'DAT866-SOF484-MIC880-CAL373-ENG71-LIN985-'),
('ECO35', 'Bachelor', 'Economics', 4, 16, 800000, '');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `userID` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `first` varchar(32) NOT NULL,
  `last` varchar(32) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `phno` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `cnic` varchar(32) DEFAULT NULL,
  `role` varchar(32) DEFAULT NULL,
  `country` varchar(32) DEFAULT NULL,
  `city` varchar(32) DEFAULT NULL,
  `zipcode` varchar(16) DEFAULT NULL,
  `accountstatus` varchar(16) DEFAULT NULL,
  `degreeID` varchar(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`userID`, `password`, `first`, `last`, `gender`, `phno`, `email`, `address`, `cnic`, `role`, `country`, `city`, `zipcode`, `accountstatus`, `degreeID`) VALUES
('S201923811', 'RandPass', 'Muneeb', 'Ali', 'Male', '', '', '', 'Student', '', '', '', '', 'Active', 'ECO35'),
('S201925457', 'RandPass', 'Badar', 'ul Zaman', 'Male', '', '', '', 'Student', '', '', '', '', 'Active', 'ECO35'),
('S201975684', 'RandPass', 'Abbas', 'Zaheer', 'Male', '', '', '', 'Student', '', '', '', '', 'Active', 'COM76');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `userID` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `first` varchar(32) NOT NULL,
  `last` varchar(32) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `phno` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `cnic` varchar(32) DEFAULT NULL,
  `role` varchar(32) DEFAULT NULL,
  `country` varchar(32) DEFAULT NULL,
  `city` varchar(32) DEFAULT NULL,
  `zipcode` varchar(16) DEFAULT NULL,
  `accountstatus` varchar(16) DEFAULT NULL,
  `courses` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`userID`, `password`, `first`, `last`, `gender`, `phno`, `email`, `address`, `cnic`, `role`, `country`, `city`, `zipcode`, `accountstatus`, `courses`) VALUES
('zohaib.zahid', 'RandomPass', 'Zohaib', 'Zahid', 'Male', '', '', '', '', '', '', '', '', 'Active', 'CAL373-LIN985-PRO190-');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`userID`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`courseID`);

--
-- Indexes for table `degrees`
--
ALTER TABLE `degrees`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`userID`);
--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`userID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
