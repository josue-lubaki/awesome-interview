package app;

import app.models.Tournament;

public class Main {
    public static void main(String[] args) {
        Tournament t = new Tournament();

        // Afficher la liste des noms de toutes équipes inscrites
        System.out.println("Liste des noms des équipes inscrites :");
        t.getTeams().forEach(team -> System.out.println("- " + team.getName() + " : " + team.getScore()));

        System.out.println();
        System.out.println("L'équipe gagnante est : " + t.getWinner().getName()
                + " avec un score de " + t.getWinner().getScore());
    }
}
