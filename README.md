GEOMETRY API

Stworz Api do dodawania figur geometrycznych do bazy danych.
obslugujemy nastepujace figury: Kwadrat, Kolo, Prostokat, ale w przyszlosci mozemy wiecej.

Request do dodawania figur ma wygladac tak:
@POST /api/v1/shapes
body: { type: "NAZWA", parameters: [p1, p2 p3] }
np dla kwadratu: { "type": "SQUARE", parameters: [10.0]}
stworzc ma kwadarat o boku 10

response: (dla tego przykladu)
201 created, body: { "id", "type", "width", "version", "createdBy", "createdAt", "lastModifiedAt", "lastModifiedBy", "area", "perimeter" }

endpoint ma byc dostepny tylko dla zalogowanych uzytkwonikow z rola CREATOR

drugi endpoint:
@GET /api/v1/shapes?parameters...
gdzie parameters to np:
?createdBy=...&type=...&areaFrom=...&areaTo...&perimeterFrom=...&perimeterTo=...&widthFrom=...&widthTo=...&radiusFrom=...&radiusTo=...
generalnie mozeby wyszukiwac po:
- typie figury
- pole od, pole do
- obwod od, obwod do
- data stworzenia od, do
- kto stworzyl,
- po parametrach figur, od - do

wymaganie kluczowe: jesli bedziemy chcieli dodac obsluge nowej figury to nie mozemy modyfikowac zadnej z istniejacych klas, w gre wchodzi tylko stworzenie nowych klas.
