from tkinter import END, messagebox
import tkinter as tk
import math
#HOLA MUNDO CON INTERFAZ

root = tk.Tk()
root.title("CALCULADORA DE ÁREAS")
root.config(width=400, height=400)

#INGRESAR BASE
tk.Label(root, text="Ingrese Base: ").place(x=20,y=30)
txtBase=tk.Entry()
txtBase.place(x=120,y=30)

#INGRESAR Altura
tk.Label(root, text="Ingrese Altura: ").place(x=20,y=60)
txtAltura=tk.Entry()
txtAltura.place(x=120,y=60)

#BOTÓN CUADRADO
def Cuadrado():
    if(txtResultado.get() != ""):
        txtResultado.delete("0", END)
    area=float(txtBase.get())
    area= area*area
    txtResultado.insert(0,area)

btnCuadrado=tk.Button(root, text="Cuadrado", command=Cuadrado)
btnCuadrado.place(x=20,y=90)

#BOTÓN RECTANGULO
def Rectangulo():
    if(txtResultado.get() != ""):
        txtResultado.delete("0", END)
    area=float(txtBase.get())
    area= area*float(txtAltura.get())
    txtResultado.insert(0,area)

btnRectangulo=tk.Button(root, text="Rectángulo", command=Rectangulo)
btnRectangulo.place(x=120,y=90)

#BOTÓN TRIÁNGULO
def Triangulo():
    if(txtResultado.get() != ""):
        txtResultado.delete("0", END)
    area=float(txtBase.get())
    area= (area*float(txtAltura.get()) / 2)
    txtResultado.insert(0,area)

btnTriangulo=tk.Button(root, text="Triángulo", command=Triangulo)
btnTriangulo.place(x=235,y=90)

#INGRESAR MEDIDA DE UN LADO
tk.Label(root, text="Medida de un lado: ").place(x=20,y=180)
txtMedLado=tk.Entry()
txtMedLado.place(x=150,y=180)

#INGRESAR NUMERO DE LADOS
tk.Label(root, text="Número de lados: ").place(x=20,y=210)
txtNumLado=tk.Entry()
txtNumLado.place(x=150,y=210)

#BOTÓN POLINOMIO
def Polinomio():
    if(txtResultado.get() != ""):
        txtResultado.delete("0", END)
    lado=float(txtMedLado.get())
    lados= float(txtNumLado.get())
    theta= 360/(2*lados)
    ayuda=math.tan(math.radians(theta))
    apotema= lado/(2*ayuda)
    area = ((lados*lado)*apotema)/2
    txtResultado.insert(0,str(area))

btnPolinomio=tk.Button(root, text="Polinimio", command=Polinomio)
btnPolinomio.place(x=120,y=240)

#RESULTADOS
tk.Label(root, text="Resultado: ").place(x=20,y=120)
txtResultado= tk.Entry()
txtResultado.place(x=120,y=120)

root.mainloop()