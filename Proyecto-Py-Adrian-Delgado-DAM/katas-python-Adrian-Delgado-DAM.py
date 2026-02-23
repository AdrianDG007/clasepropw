# Proyecto-3-Katas Python
# Nombre : [Adrián Delgado Gómez]
# Voy intentando hacer esto lo mejor que puedo y a veces no doy más jaja He puesto comentarios donde
# más me han costado para recordar que hace cada cosa.

# Necesario para algunos ejercicios para algunos ejercicios
from functools import reduce
import math

#                       Kata 1
# Escribe una funcion que reciba una cadena de texto y devuelva
# un diccionario con las frecuencias de cada letra. Sin espacios.

def frecuenciaLetras (cadena) :
    frecuencias = {}
    for letra in cadena :
        if letra != " " :  # ignoramos los espacios
            # si la letra ya esta sumamos 1, si no metemos 1
            frecuencias [letra] = frecuencias.get (letra, 0) + 1
    return frecuencias

# Probando
print ( "Kata 1 :", frecuenciaLetras ("hola mundo" ) )

#                       Kata 2
# Dada una lista de numeros, obten una nueva lista con el doble
# de cada valor. Usa map ().

def doblarValores (lista) :
    # map aplica la o lamda a cada elemento de la lista
    # list () lo convierte de nuevo a lista porque map devuelve un objeto raro
    return list ( map (lambda x : x * 2, lista ) )

print ( "Kata 2 :", doblarValores ( [1, 2, 3, 4, 5] ) )


#                       Kata 3
# Funcion que tome una lista de palabras y una palabra objetivo.
# Devuelve las palabras que contengan la palabra objetivo.

def palabrasQueContienen (listaPalabras, objetivo) :
    resultado = []
    for palabra in listaPalabras :
        if objetivo in palabra :  # comprueba si objetivo esta dentro de la palabra
            resultado.append (palabra)
    return resultado

print ( "Kata 3 :", palabrasQueContienen ( ["casa", "castillo", "perro", "casanova"], "casa" ) )


#                       Kata 4
# Funcion que calcule la diferencia entre valores de dos listas.
# Usa map ().

def diferenciaListas (lista1, lista2) :
    # zip junta los elementos de las listas en pareja (tuplas)
    return list ( map (lambda par : par [0] - par [1], zip (lista1, lista2 ) ) )

print ( "Kata 4 :", diferenciaListas ( [10, 20, 30], [1, 5, 10] ) )


#                       Kata 5
# Funcion que calcule la media de una lista y diga si esta aprobado
# o suspenso. notaAprobado es 5 por defecto.

def calcularMediaEstado (listaNumeros, notaAprobado = 5) :
    media = sum (listaNumeros) / len (listaNumeros)
    # el operador ternario es un if/else de una
    estado = "aprobado" if media >=  notaAprobado else "suspenso"
    return (media, estado)

print ( "Kata 5 :", calcularMediaEstado ( [4, 6, 7, 5] ) )


#                       Kata 6
# Funcion que calcule el factorial de un numero de forma recursiva.

def factorial (n) :
    # caso base : el factorial de 0 o 1 es 1
    if n <= 1 :
        return 1
    # la o se llama con n-1 esto se llama recursividad
    # me costo entender esto : factorial (4) = 4 * factorial (3) = 4 * 3 * factorial (2)...
    return n * factorial (n - 1)

print ( "Kata 6 :", factorial (5 ) )


#                       Kata 7
# Convierte una lista de tuplas a una lista de Strings. Usa map ().

def tuplasAStrings (listaTuplas) :
    # str () convierte cualquier cosa en string
    return list ( map (str, listaTuplas ) )

print ( "Kata 7 :", tuplasAStrings ( [ (1, 2), (3, 4), (5, 6) ] ) )


#                       Kata 8
# Programa que pide dos numeros e intenta dividirlos.
# Maneja excepciones si no son numeros o si se divide por cero.

def divisionSegura () :
    try :
        num1 = float ( input ("Introduce el primer numero : " ) )
        num2 = float ( input ("Introduce el segundo numero : " ) )
        resultado = num1 / num2
        print (f"Division exitosa : {resultado}")
    except ValueError :
        # salta cuando el usuario mete letras en vez de numeros
        print ("Error : tienes que meter numeros, no letras.")
    except ZeroDivisionError :
        # salta cuando intentas dividir entre 0
        print ("Error : no se puede dividir entre cero.")

# Descomenta para probando :
# divisionSegura ()


#                       Kata 9
# Funcion que excluye mascotas prohibidas en España de una lista.
# Usa filter ().

def filtrarMascotas (listaMascotas) :
    prohibidas = ["Mapache", "Tigre", "Serpiente Pitón", "Cocodrilo", "Oso"]
    # filter devuelve los elementos que son True
    return list ( filter (lambda mascota : mascota not in prohibidas, listaMascotas ) )

print ( "Kata 9 :", filtrarMascotas ( ["Perro", "Tigre", "Gato", "Mapache", "Conejo"] ) )


#                       Kata 10
# Funcion que recibe una lista y calcula su promedio.
# Si esta vacia lanza una excepcion personalizada.

class ListaVaciaError (Exception) :
    # creo mi propia excepcion personalizada
    pass

def promedioLista (lista) :
    if len (lista) == 0 :
        raise ListaVaciaError ("¡La lista esta vacia no puedo calcular el promedio!")
    return sum (lista) / len (lista)

try :
    print ( "Kata 10 :",         promedioLista ( [10, 20, 30] ) )
    print ( "Kata 10 (vacia) :", promedioLista ( [] ) )
except ListaVaciaError as e :
    print (f"Kata 10 Error : {e}")


#                       Kata 11
# Programa que pide la edad y maneja que no sea un numero
# o que este fuera de rango (0-120).

def pedirEdad () :
    try :
        edad = int ( input ("Introduce tu edad : ") )
        if edad < 0 or edad > 120 :
            raise ValueError ("Edad fuera de rango")
        print (f"Tu edad es : {edad}")
    except ValueError :
        print ("Error : introduce un numero entero valido entre 0 y 120.")

# Descomenta para probando :
# pedirEdad ()


#                       Kata 12
# Funcion que devuelve la longitud de cada palabra en una frase.
# Usa map ().

def longitudPalabras (frase) :
    palabras = frase.split ()  # split () separa la frase x espacios
    return list ( map (len, palabras ) )

print ( "Kata 12 :", longitudPalabras ("hola que tal estas hoy" ) )


#                       Kata 13
# Funcion que devuelve una lista de tuplas (mayuscula, minuscula)
# para cada letra unica de un conjunto. Usa map ().

def mayusMinus (caracteres) :
    # set () elimina duplicados 
    letrasUnicas = set (caracteres)
    return list ( map (lambda c : ( c.upper (), c.lower () ), letrasUnicas) )

print ( "Kata 13 :", mayusMinus ("hello") )


#                       Kata 14
# Funcion que devuelve palabras de una lista que empiecen
# con una letra especifica. Usa filter ().

def palabrasPorLetra (lista, letra) :
    return list ( filter (lambda palabra : palabra.startswith (letra), lista) )

print ( "Kata 14 :", palabrasPorLetra ( ["casa", "perro", "coche", "gato", "campo"], "c" ) )


#                       Kata 15
# Lambda que sume 3 a cada numero de una lista.

sumar3 = lambda lista : list ( map (lambda x : x + 3, lista ) )

print ( "Kata 15 :", sumar3 ( [1, 2, 3, 4, 5] ) )


#                       Kata 16
# Funcion que devuelve palabras más largas que n. Usa filter ().

def palabrasMasLargas (texto, n) :
    palabras = texto.split ()
    return list ( filter (lambda p : len (p) > n, palabras) )

print ( "Kata 16 :", palabrasMasLargas ("el cielo esta muy azul hoy", 3) )


#                       Kata 17
# Funcion que convierte lista de digitos al numero correspondiente.
# Ej : [5,7,2] -> 572. Usa reduce ().

def digitosANumero (listaDigitos) :
    # en cada paso : multiplicamos el acumulado por 10 y sumamos el siguiente
    # esto me costo entenderlo : la reduccion de derecha a izquierda
    # [5,7,2] : 0 * 10 + 5 = 5 -> 5 * 10 + 7 = 57 -> 57 * 10 + 2 = 572
    return reduce (lambda acc, digito : acc * 10 + digito, listaDigitos, 0)

print ( "Kata 17 :", digitosANumero ( [5, 7, 2] ) )


#                       Kata 18
# Lista de diccionarios con estudiantes y filter para los que
# tienen o >=  90.

estudiantes = [
    {"nombre" : "Ana",   "edad" : 20, "calificacion" : 95},
    {"nombre" : "Luis",  "edad" : 22, "calificacion" : 78},
    {"nombre" : "Marta", "edad" : 19, "calificacion" : 91},
    {"nombre" : "Pedro", "edad" : 21, "calificacion" : 65},
]

aprobadosConNota = list ( filter (lambda e : e ["calificacion"] >=  90, estudiantes ) )
print ("Kata 18 :", aprobadosConNota)


#                       Kata 19
# Lambda que filtre los numeros impares de una lista.

filtrarImpares = lambda lista : list ( filter (lambda x : x % 2 != 0, lista) )

print ( "Kata 19 :", filtrarImpares ( [1, 2, 3, 4, 5, 6, 7, 8, 9] ) )


#                       Kata 20
# De una lista mixta de ints y Strings, quedarse solo con los ints.
# Usa filter ().

def soloEnteros (listaMixta) :
    # isinstance comprueba si un elemento es del tipo dicho
    return list ( filter (lambda x : isinstance (x, int), listaMixta) )

print ( "Kata 20 :", soloEnteros ( [1, "hola", 2, "adios", 3, True, 4] ) )


#                       Kata 21
# Lambda que calcule el cubo de un numero.

cubo = lambda n : n ** 3

print ( "Kata 21 :", cubo (4) )


#                       Kata 22
# Producto total de los valores de una lista. Usa reduce ().

def productoLista (lista) :
    return reduce (lambda a, b : a * b, lista)

print ( "Kata 22 :", productoLista ( [1, 2, 3, 4, 5] ) )


#                       Kata 23
# Concatenar una lista de palabras. Usa reduce ().

def concatenarPalabras (lista) :
    return reduce (lambda a, b : a + " " + b, lista)

print ( "Kata 23 :", concatenarPalabras ( ["Hola", "que", "tal"] ) )


#                       Kata 24
# Diferencia total de los valores de una lista. Usa reduce ().

def diferenciaTotal (lista) :
    return reduce (lambda a, b : a - b, lista)

print ( "Kata 24 :", diferenciaTotal ( [100, 10, 5, 20] ) )


#                       Kata 25
# Funcion que cuente el numero de caracteres en una cadena.

def contarCaracteres (cadena) :
    return len (cadena)

print ( "Kata 25 :", contarCaracteres ("hola mundo" ) )


#                       Kata 26
# Lambda que calcule el resto de la division entre dos numeros.

restoDivision = lambda a, b : a % b

print ( "Kata 26 :", restoDivision (17, 5 ) )


#                       Kata 27
# Funcion que calcule el promedio de una lista.

def promedio (lista) :
    return sum (lista) / len (lista)

print ( "Kata 27 :", promedio ( [10, 20, 30, 40] ) )


#                       Kata 28
# Funcion que busque y devuelva el primer elemento duplicado.

def primerDuplicado (lista) :
    vistos = set ()
    for elemento in lista :
        if elemento in vistos :
            return elemento  # devolvemos el primero que vimos antes
        vistos.add (elemento)
    return None  # si no hay duplicados se devuelve None

print ( "Kata 28 :", primerDuplicado ( [1, 2, 3, 4, 2, 5] ) )


#                       Kata 29
# Funcion que enmascare todos los caracteres con '#' excepto
# los ultimos cuatro.

def enmascarar (variable) :
    texto = str (variable)
    if len (texto) <= 4 :
        return texto  # si tiene 4 o menos caracteres no se enmascara
    # se reemplaza todo menos los ultimos 4 con '#'
    return "#" * (len (texto) - 4) + texto [ - 4 : ]

print ( "Kata 29 :", enmascarar ("1234567890" ) )
print ( "Kata 29 :", enmascarar (4916123456789012 ) )  # como un numero de tarjeta


#                       Kata 30
# Funcion que determine si dos palabras son anagramas.

def sonAnagramas (palabra1, palabra2) :
    # sorted () ordena letras alfabeticamente
    # si las letras ordenadas son iguales son anagramas
    return sorted (palabra1.lower () ) == sorted (palabra2.lower () )

print ( "Kata 30 :", sonAnagramas ("amor", "roma" ) )
print ( "Kata 30 :", sonAnagramas ("hola", "adios" ) )


#                       Kata 31
# Funcion que pide una lista de nombres y un nombre a buscar.
# Lanza excepcion si no lo encuentra.

def buscarNombre () :
    entrada        = input ("Introduce nombres separados por comas : ")
    listaNombres  = [ nombre.strip () for nombre in entrada.split (",") ]
    nombreBuscado = input ("¿Que nombre buscas?")
    if nombreBuscado in listaNombres :
        print (f"¡'{nombreBuscado}' encontrado en la lista!")
    else :
        raise ValueError (f"'{nombreBuscado}' no esta en la lista.")

# Descomentar para probrar:
# try :
#     buscarNombre ()
# except ValueError as e :
#     print (f"Error : {e}")


#                       Kata 32
# Funcion que busca un nombre en una lista de empleados
# y devuelve su puesto.

def buscarEmpleado (nombreCompleto, listaEmpleados) :
    for empleado in listaEmpleados :
        if empleado ["nombre"] == nombreCompleto :
            return empleado ["puesto"]
    return "Esta persona no trabaja aqui."

empleadosEmpresa = [
    {"nombre" : "Ana Garcia",  "puesto" : "Desarrolladora"},
    {"nombre" : "Luis Perez",  "puesto" : "Diseñador"},
    {"nombre" : "Marta López", "puesto" : "Product Manager"},
]

print ( "Kata 32 :", buscarEmpleado ("Ana Garcia", empleadosEmpresa) )
print ( "Kata 32 :", buscarEmpleado ("Juan Nadie", empleadosEmpresa) )


#                       Kata 33
# Lambda que sume elementos correspondientes de dos listas.

sumarlistas = lambda l1, l2 : list ( map ( lambda par : par [0] + par [1], zip (l1, l2) ) )

print ( "Kata 33 :", sumarlistas ( [1, 2, 3], [4, 5, 6] ) )


#                       Kata 34
# Clase Arbol

class Arbol :
    def __init__ (self) :
        # al crear el arbol empieza con tronco de longitud 1 y sin ramas
        self.tronco = 1
        self.ramas  = []

    def crecerTronco (self) :
        self.tronco += 1

    def nuevaRama (self) :
        # cada rama  empieza con longitud 1
        self.ramas.append (1)

    def crecerRamas (self) :
        # enumerate me da el indice y el valor a la vez, muy util
        for i, rama in enumerate (self.ramas) :
            self.ramas [i] = rama + 1

    def quitarRama (self, posicion) :
        # pop () elimina el elemento en la posicion indicada
        if posicion < len (self.ramas) :
            self.ramas.pop (posicion)
        else :
            print ("Esa posicion no existe.")

    def infoArbol (self) :
        return {
            "longitudTronco"  : self.tronco,
            "numero_ramas"     : len (self.ramas),
            "longitudes_ramas" : self.ramas
        }


# Caso de uso
print ("\n Kata 34 : Arbol ")
miArbol = Arbol ()                    # a. Crear arbol
miArbol.crecerTronco ()               # b. Crecer tronco
miArbol.nuevaRama ()                  # c. Añadir rama
miArbol.crecerRamas ()                # d. Crecer todas las ramas
miArbol.nuevaRama ()                  # e. Añadir dos ramas más
miArbol.nuevaRama ()
miArbol.quitarRama (1)                # f. Quitar rama en posicion 2 (indice 1)
print ( miArbol.infoArbol () )        # g. Mostrar info


#                       Kata 35
# Clase UsuarioBanco

class UsuarioBanco :
    def __init__ (self, nombre, saldo, cuentaCorriente) :
        self.nombre           = nombre
        self.saldo            = saldo
        self.cuentaCorriente = cuentaCorriente

    def retirarDinero (self, cantidad) :
        if cantidad > self.saldo :
            raise ValueError (f"{self.nombre} no tiene suficiente saldo para retirar {cantidad}.")
        self.saldo -= cantidad
        print (f"{self.nombre} ha retirado {cantidad}. Saldo actual : {self.saldo}")

    def transferirDinero (self, otroUsuario, cantidad) :
        try :
            otroUsuario.retirarDinero (cantidad)
            self.agregarDinero (cantidad)
            print (f"Transferencia de {cantidad} de {otroUsuario.nombre} a {self.nombre} completada.")
        except ValueError as e :
            print (f"Error en la transferencia : {e}")

    def agregarDinero (self, cantidad) :
        self.saldo += cantidad
        print (f"{self.nombre} ha recibido {cantidad}. Saldo actual : {self.saldo}")


# Caso de uso
print ("\n Kata 35 : UsuarioBanco ")
alicia = UsuarioBanco    ("Alicia", 100, True)  # a.
bob    = UsuarioBanco    ("Bob", 50, True)
bob.agregarDinero        (20)                       # b. Bob tiene ahora 70
alicia.transferirDinero  (bob, 80)            # c. Bob transfiere 80 a Alicia (pero solo tiene 70, dara error)
# Intentamos de nuevo con cantidad valida :
alicia2 = UsuarioBanco   ("Alicia", 100, True)
bob2    = UsuarioBanco   ("Bob", 50, True)
bob2.agregarDinero       (20)                      # Bob = 70
alicia2.transferirDinero (bob2, 60)          # Bob transfiere 60 a Alicia
alicia2.retirarDinero    (50)                   # d. Alicia retira 50


#                       Kata 36
# Funcion procesarTexto con subfunciones : contar, reemplazar, eliminar.

def contarPalabras (texto) :
    palabras = texto.lower ().split ()
    conteo = {}
    for palabra in palabras :
        conteo [palabra] = conteo.get (palabra, 0) + 1
    return conteo

def reemplazarPalabras (texto, palabra_original, palabra_nueva) :
    return texto.replace (palabra_original, palabra_nueva)

def eliminarPalabra (texto, palabra) :
    # reemplazamos la palabra por nada ("") y limpiamos espacios dobles
    return " ".join (texto.replace (palabra, "").split () )

def procesarTexto (texto, opcion,  * args) :
    #  * args permite pasar argumentos variables segun la opcion
    if opcion == "contar" :
        return contarPalabras (texto)
    elif opcion == "reemplazar" :
        return reemplazarPalabras ( texto, args [0], args [1] )
    elif opcion == "eliminar" :
        return eliminarPalabra    ( texto, args [0] )
    else :
        return "Opcion no valida. Usa : contar, reemplazar, eliminar"

# Caso de uso
print ("\n Kata 36 : procesarTexto ")
miTexto = "el gato come y el gato duerme y el gato juega"
print (procesarTexto (miTexto, "contar" ) )
print (procesarTexto (miTexto, "reemplazar", "gato", "perro" ) )
print (procesarTexto (miTexto, "eliminar", "y" ) )


#                       Kata 37
# Programa que indica si es de noche, dia o tarde segun la hora.

def momentoDelDia (hora) :
    if 6 <= hora < 13 :
        return "¡Buenos dias! Es de dia ☀️"
    elif 13 <= hora < 21 :
        return "¡Buenas tardes! Es de tarde 🌇"
    else :
        return "¡Buenas noches! Es de noche 🌙"

# Prueba con distintas horas
print ("\n Kata 37 ")
for h in [8, 15, 23, 3] :
    print (f"Hora {h}h : {momentoDelDia (h)}")

# Version interactiva (descomenta para probar) :
# horaUsuario = int (input ("¿Que hora es? (0-23) : " ) )
# print (momentoDelDia (horaUsuario) )


#                       Kata 38
# Programa que determina la calificacion en texto de un alumno.
# 0-69 : insuficiente | 70-79 : bien | 80-89 : muy bien | 90-100 : excelente

def calificacionTexto (nota) :
    if 0 <= nota <= 69 :
        return "Insuficiente"
    elif 70 <= nota <= 79 :
        return "Bien"
    elif 80 <= nota <= 89 :
        return "Muy bien"
    elif 90 <= nota <= 100 :
        return "Excelente"
    else :
        return "Nota no valida (debe ser entre 0 y 100)"

print ("\n Kata 38 ")
for nota in [45, 72, 85, 97, 110] :
    print (f"Nota {nota} : {calificacionTexto (nota)}")


#                       Kata 39
# Funcion que calcule el area de rectangulo, circulo o triangulo.

def calcularArea (figura, datos) :
    if figura == "rectangulo" :
        # datos = (base, altura)
        return datos [0] * datos [1]
    elif figura == "circulo" :
        # datos = (radio,)
        return math.pi * datos [0] ** 2
    elif figura == "triangulo" :
        # datos = (base, altura)
        return (datos [0] * datos [1]) / 2
    else :
        return "Figura no reconocida"

print ("\n Kata 39 ")
print ( "Rectangulo :", calcularArea      ( "rectangulo", (5, 3) ) )
print ( "Circulo :", round ( calcularArea ( "circulo",    (4,) ), 2 ) )
print ( "Triangulo :", calcularArea       ( "triangulo",  (6, 4) ) )


#                       Kata 40
# Programa de descuento en tienda online.

def calcularpPrecioFinal () :
    try :
        precio = float (input ( "Introduce el precio original del articulo : " ) )
        if precio < 0 :
            print ("El precio no puede ser negativo.")
            return

        tieneCupon = input ("¿Tienes cupon de descuento? (si/no) : ").strip ().lower ()

        if tieneCupon == "si" or tieneCupon == "si" :
            descuento = float ( input ("Introduce el valor del cupon de descuento : " ) )
            if descuento > 0 :
                precioFinal = precio - descuento
                if precioFinal < 0 :
                    precioFinal = 0  # el precio no puede ser negativo aunque el cupon sea mayor
                print (f"Descuento aplicado. Precio final : {precioFinal :.2f}€")
            else :
                print (f"El cupon no es valido. Precio final sin descuento : {precio :.2f}€")
        elif tieneCupon == "no" :
            print (f"Sin descuento. Precio final : {precio :.2f}€")
        else :
            print ("Respuesta no valida. Precio sin modificar.")

    except ValueError :
        print ("Error : introduce valores numericos validos.")

# Descomenta para probando :
# calcularpPrecioFinal ()