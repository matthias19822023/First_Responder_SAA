# FirstResponder – Android-Diagnose v1.1

## Nach dem GitHub-Build

1. Unter Actions das Artefakt `FirstResponderApp-debug-apk` herunterladen, ZIP entpacken und `app-debug.apk` installieren.
2. Die App starten. Erwartet: weiße Diagnose-Startseite mit der Schaltfläche **SAA öffnen**.
3. **SAA öffnen** drücken. Erwartet: SAA-Startseite mit 28 Seiten.
4. Falls die App sofort schließt, das Verhalten melden. Falls ein Textfehler erscheint, Screenshot machen.
5. Wenn die App läuft, alle internen Links, Zurück, Home und Offline-Funktion prüfen.

**Wichtig:** Paket-ID wurde zur Java-Klasse passend auf `de.firstresponder.saa` geändert. Die alte App mit der Paket-ID `de.feuerwehr.firstresponder` wird daher nicht automatisch ersetzt; beide können zunächst nebeneinander erscheinen. Alte Version erst nach erfolgreichem Test entfernen.

Diese APK ist eine Diagnoseversion, kein fachlich freigegebenes Einsatzmittel. Der Android-Build wurde hier nicht ausgeführt.
