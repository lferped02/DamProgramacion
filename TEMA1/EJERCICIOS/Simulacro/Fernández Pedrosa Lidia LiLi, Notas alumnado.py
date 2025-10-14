nombre = input ("Dime su nombre: ")
nota = int (input ("Dame una nota del (0-100): "))

while nota >= 0 and nota <= 100:
   nota = int (input ("Dame una nota del (0-100): "))
   while nombre !="Exit":
        if nota >= 90 and nota <= 100:
            print ("Es sobresaliente")
            nombre = input ("Dime su nombre: ")
            nota = int (input ("Dame una nota del (0-100): "))
        elif nota >=70 and nota <= 89:
            print ("Es notable")
            nombre = input ("Dime su nombre: ")
            nota = int (input ("Dame una nota del (0-100): "))
        elif nota >=60 and nota <= 69:
            print ("Es bien")
            nombre = input ("Dime su nombre: ")
            nota = int (input ("Dame una nota del (0-100): "))
        elif nota >=50 and nota <= 59:
            print ("Es suficiente")
            nombre = input ("Dime su nombre: ")
            nota = int (input ("Dame una nota del (0-100): "))
        else:
            print ("Es suspenso")
            nombre = input ("Dime su nombre: ")
            nota = int (input ("Dame una nota del (0-100): "))