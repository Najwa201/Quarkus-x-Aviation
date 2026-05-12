# Projet Aviation - Quarkus

Projet réalisé avec Quarkus

## Fonctionnalités réalisées
- Création du projet Quarkus
- Mise en place des routes :
  - /compagnies
  - /avions
  - /flotte
- Ajout du fichier SQL avec les données du TP
- Début de connexion entre Quarkus et la base de données

## Difficultés rencontrées
Je n’ai pas pu installer Oracle sur mon ordinateur car je ne possède pas les droits administrateur nécessaires.  
J’ai donc utilisé une solution alternative avec H2 afin de pouvoir continuer le projet et tester les routes REST.

Une partie du projet reste incomplète car le temps de séance n’a pas été suffisant pour finaliser entièrement la configuration et les tests de la base de données.

## Lancement du projet
```bash
./mvnw quarkus:dev
