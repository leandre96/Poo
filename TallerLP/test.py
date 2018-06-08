class Deliver(object):
    def __init__(self,nombre):
        self.name=nombre
    def __str__(self):
        return self.name
print(Deliver("Jane"))
print(Deliver("Tarzan"))