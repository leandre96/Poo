from threading import Thread
from random import randint
import time
import os

pistaLiebre="-"*70
pistaTortuga="-"*70

def change(Animal,s,num):
    return s[:num-1]+Animal+s[num:]

def movBack(num1,num2):
    if (num1-num2) <= 0:
        return 1
    else:
        return (num1-num2)

def movUp(num1,num2):
    if (num1 + num2) >= 70:
        return 70
    else:
        return (num1+num2)

def notWinning(Animal):
    return Animal.pos<70

def movTortuga(num, ran):
        if (50 >= ran >= 1):
            return "Avance Rapido", movUp(num,3)
        elif (70 >= ran >= 51):
            return "Resbalo", movBack(num, 6)
        else:
            return "Avance Lento", movUp(num, 1)
def movLiebre(num, ran):
        if (20 >= ran >= 1):
            return "Duerme", num
        elif (40 >= ran >= 21):
            return "Gran Salto", movUp(num, 9)
        elif (50 >= ran >= 41):
            return "Resbalon Grande", movBack(num, 12)
        elif (80 >= ran >= 51):
            return "Salto Pequeño", movUp(num, 1)
        else:
            return "Resbalon Pequeño", movBack(num, 2)
class Liebre(Thread):
    def __init__(self):

        Thread.__init__(self)
        self.pos = 1
        self.accion = ""
        self.id="L"


    def run(self):
        while(notWinning(self)):
            time.sleep(1)
            prob=randint(1,100)
            self.accion,self.pos=movLiebre(self.pos,prob)

            print("L: "+change(self.id,pistaLiebre,self.pos)+" Liebre "+self.accion+" Posicion "+str(self.pos))
        print("Liebre gano")
        os._exit(1)

class Tortuga(Thread):
    def __init__(self):

        Thread.__init__(self)
        self.pos = 1
        self.accion = ""
        self.id="T"


    def run(self):
        while(notWinning(self)):
            time.sleep(1)
            prob=randint(1,100)
            self.accion,self.pos=movTortuga(self.pos,prob)

            print("T: "+change(self.id, pistaTortuga, self.pos)+" Tortuga "+self.accion+" Posicion "+str(self.pos))
        print("Tortuga gano")
        os._exit(1)


lie=Liebre()
torti=Tortuga()
print("Carrera entre Liebre y Tortuga")
print("L: "+change("L",pistaLiebre,1))
print("T: "+change("T",pistaTortuga,1))
pistaLiebre="-"*70
pistaTortuga="-"*70
lie.start()
torti.start()


