public enum MesesAnio {
    Enero       ("Invierno",  1, 31), Febrero   ("Invierno",  2, 28),
    Marzo       ("Primevera", 3, 31), Abril     ("Primavera", 4, 30),
    Mayo        ("Primavera", 5, 31), Junio     ("Verano",    6, 30),
    Julio       ("Verano",    7, 31), Agosto    ("Verano",    8, 31),
    Septiembre  ("Otoño",     9, 30), Octubre   ("Otoño",    10, 31),
    Noviembre   ("Otoño",     1, 30), Diciembre ("Inviertno",12, 31);
    int numeroMes;
    String estacion;
    int diasMes;
    // me vale para contruir las enum de MesAnio
    MesesAnio (String estacionP, int numeroMesP, int diasMesP){
        estacion = estacionP;
        numeroMes = numeroMesP;
        diasMes = diasMesP;
    }
}
