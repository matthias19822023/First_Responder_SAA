# FirstResponderApp – Android APK via GitHub Actions

Dieses Repository enthält die bisherige PWA **und** ein natives Android-WebView-Projekt. Die Android-App lädt ihre 28 Originalseiten aus `app/src/main/assets/`, benötigt **keine Internetverbindung** und kann wie jede andere Android-App geöffnet und verlassen werden. Es wird keine Netzwerkberechtigung angefordert.

## APK erstellen (GitHub)

1. Die Dateien dieses ZIPs **entpacken** und den Inhalt (einschließlich `.github/`, `app/`, `build.gradle`, `settings.gradle`, `gradle.properties`) ins bestehende GitHub-Repository auf `main` hochladen. Nicht nur die ZIP-Datei hochladen. Versteckte Ordner wie `.github` müssen erhalten bleiben.
2. Im Repository den Reiter **Actions** öffnen. Gegebenenfalls Workflows aktivieren.
3. Links **Build Android APK** auswählen, dann **Run workflow → Branch: main → Run workflow**.
4. Den Lauf öffnen und warten, bis der Job `build` erfolgreich (grün) abgeschlossen ist.
5. Unten bei **Artifacts** auf `FirstResponderApp-debug-apk` klicken und ZIP herunterladen. Darin befindet sich `app-debug.apk`.
6. `app-debug.apk` auf das Android-Tablet kopieren, dort öffnen und gegebenenfalls die Installation aus dieser Quelle erlauben. Danach App-Symbol antippen. Die App wird über die normale Android-Home-Geste verlassen.

## Testen

- Flugmodus aktivieren, App neu starten, alle Seiten öffnen und Querverweise sowie Zurück/Start prüfen.
- Die Android-Zurück-Taste geht innerhalb der App zurück; wenn kein interner Verlauf mehr besteht, wird die App geschlossen.
- Die **79 automatisch erzeugten Linkflächen sind nicht einzeln fachlich geprüft**. Die Datei `LINKPRUEFUNG.csv` dient als Kontrollliste.
- Vor Einsatzzwecken ist eine medizinisch-fachliche Freigabe notwendig.

## Wichtig

- Dies ist eine **Debug-APK**, nur zum Testen. Sie ist nicht als regulär signierte Release-APK für Verteilung oder Play Store gedacht.
- Die Inhalte sind urheberrechtlich geschützt. Ein öffentliches GitHub-Repository bzw. GitHub Pages erfordert die entsprechende Berechtigung. Bei fehlender Berechtigung die Inhalte nur in einem autorisierten privaten Repository verwenden und GitHub Pages deaktivieren.
- Bei Aktualisierung der Seiten oder Navigation die Dateien in `app/src/main/assets/` ebenfalls aktualisieren; die PWA-Dateien im Repository-Stammverzeichnis werden **nicht automatisch** in die APK übernommen.
- Es ist kein Android-SDK in dieser Erstellungssitzung vorhanden; der eigentliche APK-Build und die Installation müssen durch GitHub Actions bzw. auf dem Tablet geprüft werden.
