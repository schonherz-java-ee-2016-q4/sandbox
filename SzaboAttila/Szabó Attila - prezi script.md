
[TOC]

## Bemutatkozás

Jó napot kívánok! Szabó Attila vagyok, a Debreceni Egyetem Informatikai karán végzős programtervező informatikus hallgató. A project-munka során az Issue-tracker csapatban dolgoztam.

## Az én feladataim

A rendszer fejlesztése során próbáltam a lehető legtöbb rétegben dolgozni. A feladataimat **három nagy csoport**ba tudnám sorolni, ezek a:** fő feladataim**, az **egyéb feladatok**, és **a csapat közös feladatai**.

## Fő feladataim: hibajegytípusok

Az egyik fő feladatom a hibajegytípusok kezelése volt, ami **admin jogkörő feature**.
A hibajegyek típusai határozzák meg azt, hogy az adott hibajegynek milyen státuszai lesznek, valamint a különböző cégeknek különböző hibajegytípusaik lehetnek.
**Létrehoztam egy oldalt**, ahol a kiválasztott hibajegytípust lehet szerkeszteni: megváltoztatni** a típus nevét, leírását, státuszokat hozzáadni**, azokat **törölni**, továbbá lehetőség van a **státuszok sorrendbe állítására** is.
A státuszokat nagyon szabadon kezeljük, ezért akár elég bonyolult szerkezeteket is implementálni tudunk velük, csupán néhány **megkötésnek** kell eleget tennünk, ezek pedig a következőek:

- lennie kell a típusban egy egyértelműen meghatározható **kezdő állapot**nak, ez a valóságban annyit takar, hogy legyen pontosan egy pont, amire nem csatlakozik vissza semelyik másik státusz
- meg kell adnunk legalább egy **végállapot**ot is, ahol csak annyi a dolgunk, hogy a státuszoknál jeleznünk kell egy jelölőnégyzet bepipálásával, hogy ez egy végstátusz
- az utolsó és talán a legfontosabb megkötés pedig az, hogy **minden státusznak rendelkeznie kell kapcsolattal**.

## Fő feladataim: Issue-tracker RPC

A másik nagy feladatom az az Issue-tracker RPC-je és a többi rendszerrel való integrálódás volt.
Itt tartanom kellett a **kapcsolat**ot a többi csapat megbízott embereivel, és olyan **Remote EJB** hívásokat kellett írnom, amelyek segítségével a rendszereink össze tudtak kapcsolódni.
Az Issue-tracker-től a másik két rendszer elég sok **reportot** kért a felhasználók illetve a cégek hibajegyeivel kapcsolatban, ezért ezek legenerálásához elég sok JPQL lekérdezést kellett írnom.
Az RPC megvalósítása során elég sok **probléma** merült fel, ugyanis voltak olyan dolgok, amelyeket a mi rendszerünk teljesen könnyen kezelni tudott, míg a másik csapat rendszerében ugyan ezzel problémák voltak, és ez igaz volt fordítva is. Így ennek a leimplementálása elég nagy kihívást jelentett.

## Egyéb feladataim

A fő feladatokon kívül más egyéb feladatokat is csináltam, például:

- **Spring Security**-t konfiguráltam, majd később erre kellett rákötnöm az **Admin RPC**-jét
- létrehoztam egy **diagram**ot a felhasználók számára, amely a hozzájuk rendelt hibajegyekről ad kimutatást azok státusza alapján
- valamint az én feladatom volt még a **Checkstyle és** a **Cobertura** konfigurálása és ezek karbantartása, azért, hogy minőségi és jól tesztelt kódot tudjunk írni. Az ezekről szóló reportokat Jenkins-ben publikáltuk.

## Közös feladatok

Kivettem a részem a csapat közös feladataiból is:

- részt vettem az **adatmodell kialakításá**ban
- írnom kellett service **tesztek**et
- **log**oltam
- **többnyelvűsít**ettem az oldalt
- **segítettem a csapattrásaimnak** a problémáik megoldásában.

Köszönöm a figyelmet!
