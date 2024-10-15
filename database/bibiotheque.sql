-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 15 oct. 2024 à 19:13
-- Version du serveur : 10.4.32-MariaDB
-- Version de PHP : 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `bibiotheque`
--

-- --------------------------------------------------------

--
-- Structure de la table `auteurs`
--

CREATE TABLE `auteurs` (
  `AuteurID` int(11) NOT NULL,
  `Nom` varchar(100) NOT NULL,
  `Prenom` varchar(100) NOT NULL,
  `DateNaissance` date DEFAULT NULL,
  `Nationalite` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `auteurs`
--

INSERT INTO `auteurs` (`AuteurID`, `Nom`, `Prenom`, `DateNaissance`, `Nationalite`) VALUES
(1, 'auteur 1', 'auteur 1', '2000-04-24', 'algerien'),
(4, 'sandra', 'text', '1998-04-24', 'marcain'),
(5, 'sandra', 'text', '1998-04-24', 'cote');

-- --------------------------------------------------------

--
-- Structure de la table `emprunts`
--

CREATE TABLE `emprunts` (
  `EmpruntID` int(11) NOT NULL,
  `LivreID` int(11) DEFAULT NULL,
  `MembreID` int(11) DEFAULT NULL,
  `DateEmprunt` date NOT NULL,
  `DateRetour` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `emprunts`
--

INSERT INTO `emprunts` (`EmpruntID`, `LivreID`, `MembreID`, `DateEmprunt`, `DateRetour`) VALUES
(4, 2, 1, '2024-02-12', '2025-02-02');

-- --------------------------------------------------------

--
-- Structure de la table `livres`
--

CREATE TABLE `livres` (
  `LivreID` int(11) NOT NULL,
  `Titre` varchar(255) NOT NULL,
  `AuteurID` int(11) DEFAULT NULL,
  `Genre` varchar(50) DEFAULT NULL,
  `ISBN` varchar(20) DEFAULT NULL,
  `DatePublication` date DEFAULT NULL,
  `Disponibilite` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `livres`
--

INSERT INTO `livres` (`LivreID`, `Titre`, `AuteurID`, `Genre`, `ISBN`, `DatePublication`, `Disponibilite`) VALUES
(2, 'physique', 1, '256', 'LMK25', '2024-02-25', 0),
(3, 'MATHEMATIQUE ', 1, '155', 'LMK250', '2021-08-20', 1);

-- --------------------------------------------------------

--
-- Structure de la table `membres`
--

CREATE TABLE `membres` (
  `MembreID` int(11) NOT NULL,
  `Nom` varchar(100) NOT NULL,
  `Prenom` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `DateInscription` date DEFAULT curdate()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `membres`
--

INSERT INTO `membres` (`MembreID`, `Nom`, `Prenom`, `Email`, `DateInscription`) VALUES
(1, 'etudiant', 'etudiant', 'derkaouifatima50@gmail.com', '2024-12-01'),
(2, 'MEMBRE', 'MEMBRE', 'MEMBRE@GMAIL.COM', '2019-12-12');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `auteurs`
--
ALTER TABLE `auteurs`
  ADD PRIMARY KEY (`AuteurID`);

--
-- Index pour la table `emprunts`
--
ALTER TABLE `emprunts`
  ADD PRIMARY KEY (`EmpruntID`),
  ADD KEY `LivreID` (`LivreID`) USING BTREE,
  ADD KEY `Etranger` (`MembreID`) USING BTREE;

--
-- Index pour la table `livres`
--
ALTER TABLE `livres`
  ADD PRIMARY KEY (`LivreID`),
  ADD UNIQUE KEY `ISBN` (`ISBN`),
  ADD KEY `livres_ibfk_1` (`AuteurID`);

--
-- Index pour la table `membres`
--
ALTER TABLE `membres`
  ADD PRIMARY KEY (`MembreID`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `auteurs`
--
ALTER TABLE `auteurs`
  MODIFY `AuteurID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `emprunts`
--
ALTER TABLE `emprunts`
  MODIFY `EmpruntID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `livres`
--
ALTER TABLE `livres`
  MODIFY `LivreID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `membres`
--
ALTER TABLE `membres`
  MODIFY `MembreID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `emprunts`
--
ALTER TABLE `emprunts`
  ADD CONSTRAINT `emprunts_ibfk_1` FOREIGN KEY (`LivreID`) REFERENCES `livres` (`LivreID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `emprunts_ibfk_2` FOREIGN KEY (`MembreID`) REFERENCES `membres` (`MembreID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `livres`
--
ALTER TABLE `livres`
  ADD CONSTRAINT `livres_ibfk_1` FOREIGN KEY (`AuteurID`) REFERENCES `auteurs` (`AuteurID`) ON DELETE SET NULL ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
