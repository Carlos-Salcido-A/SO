from tkinter import END, messagebox
import tkinter as tk
#HOLA MUNDO CON INTERFAZ

root = tk.Tk()
root.title("Hola Mundo")
root.config(width=400, height=400)

tk.Label(root, text="Ingrese su nombre: ").place(x=50,y=60)
txtNombre=tk.Entry()
txtNombre.place(x=50,y=80)

tk.Label(root, text="Resultado: ").place(x=50,y=120)
txtResultado= tk.Entry()
txtResultado.place(x=50,y=140)

def Mensaje():
    nombre=txtNombre.get()
    nombre="Hola "+nombre+"!"
    txtResultado.insert(0,nombre)

btnMostrar=tk.Button(root, text="Mostrar", command=Mensaje)
btnMostrar.place(x=50,y=200)


root.mainloop()