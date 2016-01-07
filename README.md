# PickMyBeer
i200 Projekt
Annely Aasalad

Programm küsib küsimusi, millele vastamise järel saab kasutaja soovituse, millist Eesti käsitööõlut
peaks ta proovima.
Programmi ülesehitus:
Sisselogimine, mida saab teha vaid õige parooli teadmisel
Testi tutvustus
Küsimused: igale küsimusele on neli vastusevarianti. Kasutaja vastus salvestab tulemuste ArrayListi
konkreetse õlle numbri. (kokku on valikus 10 õlut, seega listis on numbrid 1-10)
Kui kõigile küsimustele on vastatud, siis sorteerib programm saadud numbrid ja leiab kõige
sagedamini esinenud numbrid. Seejärel tõlgib ta numbrid õlledeks ning annab tulemuse.

UUE ÕLLE LISAMISE ABC:
1. Test.java's lisa igale küsimusele vähemalt ühele vastusevariandile uue õlle NUMBER.
2.TulemustePrint.java's lisa fori tsüklisse uus "else if" vajaliku infoga
3. Kui õllede koguhulk on piisavalt suur võib suurendada maksmimum tulemuste arvu TulemustePrint.java's
(populaarseim.size()<5)

KÜSIMUSE LISAMISE ABC:
1. Test.java's loo VBox küsimusNUMBER (mitte viimasele kohale)
ja lisa vajaminev info.
2. Test.java's loo nuppudele SetOnAction õigele järjekorra kohale.
