# FirstResponderApp – Android-Tablet / GitHub Pages

Installierbare Web-App (PWA) mit **28 unveränderten Originalseiten** der SAA (Stand 06/2026). Die App hat eine Startübersicht, interne Sprungflächen und eine dauerhaft sichtbare Leiste mit **Zurück / Start / Vorherige Seite / Nächste Seite**. Sie kann wie jede andere App geöffnet und über Android verlassen werden; kein Kioskmodus.

## Dateien
- `index.html`: Benutzeroberfläche, Navigation und interne Links
- `pages/`: 28 Seitenbilder, für Offlinebetrieb erforderlich
- `icons/`: App-Symbole
- `manifest.webmanifest`: Android-Installationsinformationen
- `service-worker.js`: Offline-Cache (Versionskennung bei Änderungen erhöhen)
- `LINKPRUEFUNG.csv`: **79 automatisch erzeugte Linkflächen**, noch nicht fachlich geprüft
- `.nojekyll`: GitHub-Pages-Hilfsdatei

## Veröffentlichung über GitHub
1. GitHub-Repository anlegen, beispielsweise `first-responder-app`.
2. **Alle Dateien und Ordner aus dem ZIP** in das Repository-Stammverzeichnis hochladen, nicht nur das ZIP.
3. Unter **Settings → Pages → Build and deployment**: `Deploy from a branch`, Branch `main`, Ordner `/(root)`, speichern.
4. Auf dem Android-Tablet die angezeigte `https://...github.io/.../`-Adresse in Chrome öffnen.
5. Chrome-Menü **⋮ → App installieren** (gegebenenfalls **Zum Startbildschirm hinzufügen**). Danach über das App-Symbol starten; über Android-Gesten oder Home-Taste verlassen.
6. Nach dem ersten vollständigen Laden **Flugmodus einschalten** und die Startseite, alle Seiten und die Sprünge prüfen. Bei gelöschten Browserdaten ist erneutes Online-Laden nötig.

## Vor der Verwendung prüfen
- `LINKPRUEFUNG.csv` Zeile für Zeile durchgehen: Quellseite, markierter Bereich und Zielseite auf dem Tablet kontrollieren. Fehlende Links ergänzen; falsch platzierte korrigieren. Die 79 Flächen sind **keine 79 bestätigten korrekten Verweise**.
- Besonders Übergänge aus dem Basisalgorithmus und den A–E-Algorithmen prüfen; Darstellung im Hoch- und Querformat testen.
- Offlinebetrieb im Flugmodus testen; die PWA muss zuvor erfolgreich alle Ressourcen geladen haben.
- Fachliche Freigabe durch zuständige medizinische Leitung vor dem Einsatz einholen.

## Rechte und Datenschutz
**Achtung: GitHub Pages ist öffentlich erreichbar**, selbst wenn das Repository privat ist. Die PDF enthält einen ausdrücklichen Urheberrechtsvermerk. **Vor Veröffentlichung der Seitenbilder muss die Erlaubnis der Rechteinhaber vorliegen.** Falls keine Freigabe besteht, bitte **nicht** auf GitHub Pages veröffentlichen; stattdessen eine lokal installierte, nicht öffentliche Lösung wählen.

Die App ist ein Nachschlagewerk und ersetzt weder Ausbildung noch verbindliche Einsatzanweisungen.
