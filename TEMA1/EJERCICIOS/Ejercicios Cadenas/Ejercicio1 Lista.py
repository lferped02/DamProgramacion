animales = ["Elefante", "Perro", "Gato"]
animal = input("Introduce el nombre de un animal: ").lower()
if animal in animales:
    print ("El animal está en la lista")
    print (animales.index(animal))
else:
    print ("El animal no está en la lista")