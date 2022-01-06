# Quiz Game

Als längeres Hausübungsbeispiel habe ich mir überlegt einen **Quiz Game** zu coden. Die Grund-Funktionalität unterscheidet sich dabei nur gering anderen herkömmlichen Fragespielen (wie z.b. Kahoot).

Da es sich hier um eine **Serveranwendung** handelt, gibt es eventuell die Möglichkeit einer Multiplayer-Funktion.

## User Interface

Die Anwendung wird in **derzeit 7** unterschiedliche Fenster unterteilt, die ihre eigene Funktionalität aufweisen. Die Verwendung und Sinnhaftigkeit dieser muss erst geklärt werden.

- ### Login Window
  Simples "Willkommen" Fenster, bei dem sich der jeweilige User anmelden kann.

- ### Main Window / Featured Quizzes
  Im Hauptfenster gibt es die Möglichkeit sich mit der Seite vertraut zu machen und Quizzes zu starten. 
  > **Notiz:** Die genaue Umfang dieses Fenstern kann stark variieren,  da mir die Möglichkeiten und Sinnhaftigkeit mancher Features erst klar werden muss

- ### Quiz-Library Windows
  Alle verfügbaren Quizes sind hier zu sehen. Auch von hier aus kann man Quizzes starten und Informationen über diese sehen.

- ### Quiz-Overwiev Windows
  Hier wird das derzeit ausgewählte Quiz angezeigt, man sieht Informationen über Inhalt, Fragenumfang, persönlicher Highscore etc.

- ### Quiz-Play Window
  In diesem Fenster befindet sich der eigentliche Spiel ablauf. Nach starten des Quizzes werden hier alle Fragen abgeprüft, bist man zum Schluss kommt oder man manuell das Spiel beendet. Bei einem Abbruch werden keine Informationen des letzten Spiels gespeichert.
  > **Optional**: durch Zeitbeschränkungen, individuelle Anzeigen etc. kann man dem Spiel ein bisschen mehr "Leben" geben.

- ### Personal History Window
  Alle vom Spieler abgeschlossen Quizzes werden hier in Form von einer Liste angezeigt.

- ### Overall Highscore Window
  Die Höchsten Rekorde jedes Quizzes und die besten Gesamt-Rekorde können von jeder Person überprüft werden.
  > **Notiz:** In welcher Form diese angezigt werden ist noch unklar, schöne Formatierung steht hier an oberster Stelle

Es fehlen noch einige Fenster, aber welche Features hier umgesetzt werden muss erst abgeklärt werden (Hier hat meine Kreativität versagt)

***Nach weiterer Absprache werden diese hier vermerkt und dieser Hinweis gelöscht.***

## Database

Es wird eine Datenbank verwendet um User, Quizzesz und weitere relevante Nutzungsdaten zu speichern. Mit **derzeit 3** Tabellen sollten alle Daten abgespeichert werden. Gleich wie bei **User Interface** muss die Verwendung und Sinnhaftigkeit einiger Tabellen erst abgeklärt werden.

- ### User Table
  Hier werden die Nutzer, Scores, Nutzungsinformationen etc. gespeichert. 
  > **Notiz:** wichtig, ermöglicht zuweisen von Scores etc.

- ### Quizzes Table
  Alle Quizzes (mit Fragen, Titel etc.) werden auch abgespeichert.
  > **Optional:** Zusätliche Informationen wie Dauer, Punkteanzahl

- ### Scores Table
  Spieler erreichte Punkte werden mit dem zugehörigen Quiz und anderen Inforationen gesichert.

Genau so wie bei **User Interface** sind mir keine weiteren und nützlichen Tabellen eingefallen, die aber sicher hilfreich und nötig wären. 

***Nach weiterer Absprache werden diese hier vermerkt und dieser Hinweis gelöscht.***
