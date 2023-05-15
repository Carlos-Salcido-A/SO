from tkinter import END, messagebox
import tkinter as tk
import math
#HOLA MUNDO CON INTERFAZ

root = tk.Tk()
root.title("CALCULADORA DE ÁREAS")
root.config(width=400, height=400)

#INGRESAR TEMPERATURA
tk.Label(root, text="Ingrese Temperatura: ").place(x=20,y=30)
txtTemperatura=tk.Entry()
txtTemperatura.place(x=160,y=30)

#BOTÓN CELSIUS A FARENHEIT
def CF():
    if(txtResultado.get() != ""):
        txtResultado.delete("0", END)
    c=float(txtTemperatura.get())
    f = (c*1.8)+32
    txtResultado.insert(0,f)
btnCF=tk.Button(root, text="C° - F°", command=CF)
btnCF.place(x=20,y=60)

#BOTÓN CELSIUS A KELVIN
def CK():
    if(txtResultado.get() != ""):
        txtResultado.delete("0", END)
    c=float(txtTemperatura.get())
    k = c+273.15
    txtResultado.insert(0,k)
btnCK=tk.Button(root, text="C° - K ", command=CK)
btnCK.place(x=20,y=90)

#BOTÓN KELVIN A FARENHEIT
def KF():
    if(txtResultado.get() != ""):
        txtResultado.delete("0", END)
    k=float(txtTemperatura.get())
    f = (1.8 * (k-273.15)) + 32
    txtResultado.insert(0,f)
btnKF=tk.Button(root, text=" K - F°", command=KF)
btnKF.place(x=120,y=60)

#BOTÓN KELVIN A CELSIUS
def KC():
    if(txtResultado.get() != ""):
        txtResultado.delete("0", END)
    k=float(txtTemperatura.get())
    c = k-273.15
    txtResultado.insert(0,c)
btnKC=tk.Button(root, text=" K - C°", command=KC)
btnKC.place(x=120,y=90)

#BOTÓN FARENHEIT A CELSIUS
def FC():
    if(txtResultado.get() != ""):
        txtResultado.delete("0", END)
    f=float(txtTemperatura.get())
    c = (f-32) / 1.8
    txtResultado.insert(0,c)
btnFC=tk.Button(root, text="F° - C°", command=FC)
btnFC.place(x=220,y=60)

#BOTÓN FARENHEIT A KELVIN
def FK():
    if(txtResultado.get() != ""):
        txtResultado.delete("0", END)
    f=float(txtTemperatura.get())
    k = (0.5555555*(f-32))+273.15
    txtResultado.insert(0,k)
btnFK=tk.Button(root, text="F° - K ", command=FK)
btnFK.place(x=220,y=90)

#RESULTADOS
tk.Label(root, text="Resultado: ").place(x=20,y=120)
txtResultado= tk.Entry()
txtResultado.place(x=120,y=120)

root.mainloop()