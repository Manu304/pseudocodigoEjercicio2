//202030799 Manuel Rojas
//Solicitar al usuario que ingrese un valor N y mostrar todos
//los valores comprendidos entre N y 1, comenzando desde N.
Proceso Ejercicio2Parte2
	Escribir "Ingrese un numero entero"
	Leer num
	Escribir "Los valores entre ", num, " y 1 son:"
	Para i <- 1 Hasta num Con Paso 1 Hacer
		Escribir num
		num <- num - 1
	Fin Para
FinProceso
